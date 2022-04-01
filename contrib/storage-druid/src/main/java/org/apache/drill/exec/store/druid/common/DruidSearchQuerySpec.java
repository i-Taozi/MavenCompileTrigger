/*
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

package org.apache.drill.exec.store.druid.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "type", "value", "caseSensitive" })
public class DruidSearchQuerySpec {
  private final String type = DruidCompareOp.TYPE_SEARCH_CONTAINS.getCompareOp();
  private final String value;
  private final boolean caseSensitive;

  @JsonCreator
  public DruidSearchQuerySpec(@JsonProperty("value") String value,
                              @JsonProperty("caseSensitive") boolean caseSensitive) {
    this.value = value;
    this.caseSensitive = caseSensitive;
  }

  public String getType() {
    return type;
  }

  public String getValue() {
    return value;
  }

  public boolean isCaseSensitive() {
    return caseSensitive;
  }
}
