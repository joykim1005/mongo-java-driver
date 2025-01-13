/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mongodb.client.model.search;

import com.mongodb.annotations.Beta;
import com.mongodb.annotations.Reason;
import com.mongodb.annotations.Sealed;

import java.util.UUID;

import java.time.Instant;

import org.bson.types.ObjectId;

/**
 * @see SearchOperator#in(FieldSearchPath, Boolean, Boolean...)
 * @see SearchOperator#in(FieldSearchPath, ObjectId, ObjectId...)
 * @see SearchOperator#in(FieldSearchPath, Number, Number...)
 * @see SearchOperator#in(FieldSearchPath, Instant, Instant...)
 * @see SearchOperator#in(FieldSearchPath, UUID, UUID...)
 * @see SearchOperator#in(FieldSearchPath, String, String...)
 * @see SearchOperator#inNull(FieldSearchPath)
 * @see SearchOperator#in(FieldSearchPath, Iterable)
 * @since 5.3
 */
@Sealed
@Beta(Reason.CLIENT)
public interface InSearchOperator extends SearchOperator {
    @Override
    InSearchOperator score(SearchScore modifier);
}
