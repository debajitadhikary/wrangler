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
 * A class to represent a byte size value like "10KB" or "1.5MB".
 */
public class ByteSize implements Token {
    private final String value;

    public ByteSize(String value) {
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
        return TokenType.TEXT; // Temporary placeholder until we define BYTE_SIZE in TokenType.java
    }

    public long getBytes() {
        // Clean up the input (remove spaces, make lowercase)
        String input = value.trim().toLowerCase();
        // Get number part (e.g., "10" from "10KB")
        String numStr = input.replaceAll("[a-z]+", "");
        // Get unit part (e.g., "kb" from "10KB")
        String unit = input.replaceAll("[0-9.]+", "");

        // Convert number to double
        double number;
        try {
            number = Double.parseDouble(numStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number in byte size: " + value);
        }

        // Convert based on unit
        if (unit.equals("kb") || unit.equals("kib")) {
            return (long) (number * 1024);
        } else if (unit.equals("mb") || unit.equals("mib")) {
            return (long) (number * 1024 * 1024);
        } else if (unit.equals("gb") || unit.equals("gib")) {
            return (long) (number * 1024 * 1024 * 1024);
        } else if (unit.equals("tb") || unit.equals("tib")) {
            return (long) (number * 1024 * 1024 * 1024 * 1024);
        } else if (unit.equals("pb") || unit.equals("pib")) {
            return (long) (number * 1024 * 1024 * 1024 * 1024 * 1024);
        } else {
            throw new IllegalArgumentException("Unknown byte unit: " + unit);
        }
    }
}