/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.jstorm.window;

import backtype.storm.tuple.Tuple;
import java.io.Serializable;
import java.util.Collection;

/**
 * A retractor enables re-computing of purged historic windows.
 * Note that for such re-computing, user would need to pull window states from their own state factory,
 * e.g., HBase, HDFS, DB, etc. instead of state factory within JStorm.
 *
 * @author wange
 * @since 16/12/19
 */
public interface Retractor extends Serializable {
    void retract(Tuple element, Collection<TimeWindow> windows);
}