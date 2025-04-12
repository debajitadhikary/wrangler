/*
 * Copyright © 2017-2025 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package io.cdap.wrangler;

import io.cdap.wrangler.api.Arguments;
import io.cdap.wrangler.api.DirectiveContext;
import io.cdap.wrangler.api.Executor;
import io.cdap.wrangler.api.ExecutorContext;
import io.cdap.wrangler.api.Row;
import io.cdap.wrangler.api.annotations.PublicEvolving;

import java.util.ArrayList;
import java.util.List;

/**
 * Executor for aggregating statistics like total size and time.
 */
@PublicEvolving
public class AggregateStats implements Executor<Row, Row> {
  private String sizeColumn;
  private String timeColumn;
  private String outputSizeColumn;
  private String outputTimeColumn;
  private String sizeUnit;
  private String timeUnit;
  private double totalSize = 0.0; // In bytes
  private double totalTime = 0.0; // In nanoseconds
  private int rowCount = 0;
  private List<Row> results = new ArrayList<>();

  @Override
  public void initialize(Arguments args, DirectiveContext context) throws Exception {
    this.sizeColumn = args.value("sizeColumn").toString();
    this.timeColumn = args.value("timeColumn").toString();
    this.outputSizeColumn = args.value("outputSizeColumn").toString();
    this.outputTimeColumn = args.value("outputTimeColumn").toString();
    this.sizeUnit = args.value("sizeUnit").toString();
    this.timeUnit = args.value("timeUnit").toString();
  }

  @Override
  public Iterable<Row> execute(Row row, ExecutorContext context) throws Exception {
    rowCount++;

    // Aggregate size
    Object sizeValue = row.getValue(sizeColumn);
    if (sizeValue instanceof Number) {
      double size = ((Number) sizeValue).doubleValue();
      if ("MB".equalsIgnoreCase(sizeUnit)) {
        size *= 1024 * 1024; // MB to bytes
      } else if ("KB".equalsIgnoreCase(sizeUnit)) {
        size *= 1024; // KB to bytes
      } else if ("GB".equalsIgnoreCase(sizeUnit)) {
        size *= 1024 * 1024 * 1024; // GB to bytes
      }
      totalSize += size;
    }

    // Aggregate time
    Object timeValue = row.getValue(timeColumn);
    if (timeValue instanceof Number) {
      double time = ((Number) timeValue).doubleValue();
      if ("s".equalsIgnoreCase(timeUnit)) {
        time *= 1_000_000_000; // Seconds to nanoseconds
      } else if ("ms".equalsIgnoreCase(timeUnit)) {
        time *= 1_000_000; // Milliseconds to nanoseconds
      } else if ("min".equalsIgnoreCase(timeUnit)) {
        time *= 60 * 1_000_000_000; // Minutes to nanoseconds
      }
      totalTime += time;
    }

    List<Row> output = new ArrayList<>();
    output.add(row);
    return output;
  }

  @Override
  public void destroy() throws Exception {
    if (rowCount > 0) {
      Row outputRow = new Row();
      // Convert totals to output units (MB and seconds)
      double finalSize = totalSize / (1024.0 * 1024.0); // Bytes to MB
      double finalTime = totalTime / 1_000_000_000.0; // Nanoseconds to seconds
      outputRow.add(outputSizeColumn, finalSize);
      outputRow.add(outputTimeColumn, finalTime);
      results.add(outputRow);
    }
  }

  @Override
  public List<Row> results() {
    return results;
  }
}