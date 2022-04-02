/***********************************************************************************************************************
 *
 * Copyright (C) 2010-2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/
package eu.stratosphere.api.common.typeutils.base.array;

import eu.stratosphere.api.common.typeutils.SerializerTestBase;
import eu.stratosphere.api.common.typeutils.TypeSerializer;
import eu.stratosphere.api.common.typeutils.base.array.LongPrimitiveArraySerializer;

/**
 * A test for the {@link LongPrimitiveArraySerializer}.
 */
public class CharPrimitiveArraySerializerTest extends SerializerTestBase<char[]> {

	@Override
	protected TypeSerializer<char[]> createSerializer() {
		return new CharPrimitiveArraySerializer();
	}

	@Override
	protected Class<char[]> getTypeClass() {
		return char[].class;
	}
	
	@Override
	protected int getLength() {
		return -1;
	}

	@Override
	protected char[][] getTestData() {
		return new char[][] {
			new char[] {0, 1, 2, 3, '\n', '\t', 'a', 'b', 'c', Character.MAX_VALUE, Character.MIN_VALUE},
			new char[] {},
			new char[] {100, 200, 315, 0, 17, 0, 0}
		};
	}
}
