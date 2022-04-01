/*
 * Copyright (c) 2017. Sunghyouk Bae <sunghyouk.bae@gmail.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.hibernate.stresser.persistence.config;

import org.hibernate.cache.redis.client.RedisClient;
import org.hibernate.cache.redis.hibernate5.SingletonRedisRegionFactory;
import org.hibernate.cache.redis.util.CacheTimestamper;
import org.hibernate.cache.redis.util.Timestamper;

import java.util.Properties;

/**
 * @author Johno Crawford (johno@sulake.com)
 */
public class RedisRegionFactory extends SingletonRedisRegionFactory {

  public RedisRegionFactory(Properties props) {
    super(props);
  }

  @Override
  public CacheTimestamper createCacheTimestamper(RedisClient redisClient, String cacheKey) {
    return new Timestamper();
  }

  @Override
  public RedisClient createRedisClient() {
    return new RedisClient(ApplicationContextProvider.getAutowireCapableBeanFactory().getBean(RedisClientProvider.class).getRedisClient());
  }
}
