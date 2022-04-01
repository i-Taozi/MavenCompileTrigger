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
package org.apache.drill.metastore.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.apache.drill.metastore.mongo.transform.Transformer;
import org.bson.Document;

/**
 * Provides Mongo Metastore component tools to transform, read or write data from / into Mongo collections.
 *
 * @param <T> Metastore component unit metadata type
 */
public interface MongoMetastoreContext<T> {

  /**
   * Returns Mongo collection implementation used as storage for Metastore
   * component data.
   *
   * @return Mongo collection instance
   */
  MongoCollection<Document> table();

  /**
   * Returns transformer which allows various
   * data, filters, operations transformation.
   *
   * @return transformer instance
   */
  Transformer<T> transformer();

  /**
   * Returns Mongo client implementation
   *
   * @return Mongo client instance
   */
  MongoClient client();
}
