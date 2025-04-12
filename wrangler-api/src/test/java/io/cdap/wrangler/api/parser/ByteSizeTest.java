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

import org.junit.Assert;
import org.junit.Test;

public class ByteSizeTest {
    @Test
    public void testBasicByteSize() {
        ByteSize size = new ByteSize("10KB");
        Assert.assertEquals("10KB", size.value());
        Assert.assertEquals(10240, size.getBytes());
        Assert.assertEquals(TokenType.TEXT, size.type());
    }

    @Test
    public void testDecimalByteSize() {
        ByteSize size = new ByteSize("1.5MB");
        Assert.assertEquals("1.5MB", size.value());
        Assert.assertEquals(1572864, size.getBytes()); // 1.5 * 1024 * 1024
        Assert.assertEquals(TokenType.TEXT, size.type());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUnit() {
        new ByteSize("10XYZ");
    }
}
