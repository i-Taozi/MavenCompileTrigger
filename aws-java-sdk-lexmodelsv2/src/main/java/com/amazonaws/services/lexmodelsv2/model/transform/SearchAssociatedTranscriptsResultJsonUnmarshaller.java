/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchAssociatedTranscriptsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAssociatedTranscriptsResultJsonUnmarshaller implements Unmarshaller<SearchAssociatedTranscriptsResult, JsonUnmarshallerContext> {

    public SearchAssociatedTranscriptsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchAssociatedTranscriptsResult searchAssociatedTranscriptsResult = new SearchAssociatedTranscriptsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return searchAssociatedTranscriptsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botRecommendationId", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setBotRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nextIndex", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setNextIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("associatedTranscripts", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setAssociatedTranscripts(new ListUnmarshaller<AssociatedTranscript>(AssociatedTranscriptJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("totalResults", targetDepth)) {
                    context.nextToken();
                    searchAssociatedTranscriptsResult.setTotalResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchAssociatedTranscriptsResult;
    }

    private static SearchAssociatedTranscriptsResultJsonUnmarshaller instance;

    public static SearchAssociatedTranscriptsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchAssociatedTranscriptsResultJsonUnmarshaller();
        return instance;
    }
}
