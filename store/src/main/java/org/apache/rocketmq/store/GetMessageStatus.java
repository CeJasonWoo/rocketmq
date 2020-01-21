/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store;
// Jason
public enum GetMessageStatus {

    FOUND,

    NO_MATCHED_MESSAGE,

    MESSAGE_WAS_REMOVING, // 消息存放在下个commitLog文件中

    OFFSET_FOUND_NULL,// offset 为null

    OFFSET_OVERFLOW_BADLY,// offset越界

    OFFSET_OVERFLOW_ONE,// offset越界一个

    OFFSET_TOO_SMALL,// offset不在队列中

    NO_MATCHED_LOGIC_QUEUE,

    NO_MESSAGE_IN_QUEUE,
}
