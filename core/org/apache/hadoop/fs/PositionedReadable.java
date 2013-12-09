/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.fs;

import java.io.*;
import org.apache.hadoop.fs.*;

/** Stream that permits positional reading. 
 * 实现该接口的类都不会改变流的当前位置，而且还是线程安全的
 * */
public interface PositionedReadable {
  /**
   * Read upto the specified number of bytes, from a given
   * position within a file, and return the number of bytes read. This does not
   * change the current offset of a file, and is thread-safe.<br/>
   * 从指定位置开始，读最多指定长度的数据到buffer中offset开始的缓冲区中，该函数不改变读流的当前位置，同时它是线程安全的
   */
  public int read(long position, byte[] buffer, int offset, int length)
    throws IOException;
  
  /**
   * Read the specified number of bytes, from a given
   * position within a file. This does not
   * change the current offset of a file, and is thread-safe.<br/>
   * 从指定位置开始，读指定长度的数据到buffer中offset开始的缓冲区中
   */
  public void readFully(long position, byte[] buffer, int offset, int length)
    throws IOException;
  
  /**
   * Read number of bytes equalt to the length of the buffer, from a given
   * position within a file. This does not
   * change the current offset of a file, and is thread-safe.
   */
  public void readFully(long position, byte[] buffer) throws IOException;
}
