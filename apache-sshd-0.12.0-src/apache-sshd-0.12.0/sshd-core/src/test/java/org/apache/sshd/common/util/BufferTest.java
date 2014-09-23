/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sshd.common.util;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.apache.sshd.util.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BufferTest extends BaseTest {

    @Test
    public void testGetLong() throws Exception {
        long v = 1234567890123456789L;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        new DataOutputStream(stream).writeLong(v);
        Buffer buffer = new Buffer(stream.toByteArray());
        assertEquals(v, buffer.getLong());
    }
}
