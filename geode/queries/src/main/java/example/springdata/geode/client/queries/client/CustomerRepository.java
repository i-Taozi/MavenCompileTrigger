/*
 * Copyright 2020-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.geode.client.queries.client;

import example.springdata.geode.client.queries.Customer;

import java.util.List;

import org.springframework.data.gemfire.mapping.annotation.ClientRegion;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.gemfire.repository.query.annotation.Hint;
import org.springframework.data.gemfire.repository.query.annotation.Limit;
import org.springframework.data.gemfire.repository.query.annotation.Trace;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Patrick Johnson
 */
@ClientRegion(name = "Customers")
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	@Trace
	@Limit(100)
	@Hint("emailAddressIndex")
	@Query("select * from /Customers customer where customer.emailAddress.value = $1")
	List<Customer> findByEmailAddressUsingIndex(String emailAddress);

	@Trace
	@Limit(100)
	@Query("select * from /Customers customer where customer.firstName = $1")
	List<Customer> findByFirstNameUsingIndex(String firstName);
}
