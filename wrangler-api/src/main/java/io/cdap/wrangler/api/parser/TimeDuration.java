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
package io.cdap.wrangler.api.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/**
 * A token representing a time duration with a value and unit.
 */
public class TimeDuration implements Token {
  private final String value;

  public TimeDuration(String value) {
    this.value = value;
  }

  @Override
  public String value() {
    return value;
  }

  @Override
  public JsonElement toJson() {
    return new JsonPrimitive(value);
  }

  @Override
  public TokenType type() {
    return TokenType.TIME_DURATION;
  }

  public long getMillis() {
    String input = value.trim().toLowerCase();
    String numStr = input.replaceAll("[a-z]+", "");
    String unit = input.replaceAll("[0-9.]+", "");

    if (!(unit.equals("ms") || unit.equals("s") || unit.equals("min") ||
          unit.equals("h") || unit.equals("d"))) {
      throw new IllegalArgumentException("Unknown time unit: " + unit);
    }

    double number;
    try {
      number = Double.parseDouble(numStr);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Invalid number in time duration: " + value, e);
    }

    if (unit.equals("ms")) {
      return (long) number;
    } else if (unit.equals("s")) {
      return (long) (number * 1000);
    } else if (unit.equals("min")) {
      return (long) (number * 60 * 1000);
    } else if (unit.equals("h")) {
      return (long) (number * 60 * 60 * 1000);
    } else if (unit.equals("d")) {
      return (long) (number * 24 * 60 * 60 * 1000);
    }
    throw new IllegalArgumentException("Unknown time unit: " + unit);
  }

  public long getNanos() {
    return getMillis() * 1_000_000L;
  }
}
