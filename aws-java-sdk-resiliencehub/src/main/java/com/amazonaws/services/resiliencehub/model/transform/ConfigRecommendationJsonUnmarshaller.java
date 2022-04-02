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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRecommendationJsonUnmarshaller implements Unmarshaller<ConfigRecommendation, JsonUnmarshallerContext> {

    public ConfigRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigRecommendation configRecommendation = new ConfigRecommendation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appComponentName", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setAppComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("compliance", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setCompliance(new MapUnmarshaller<String, DisruptionCompliance>(context.getUnmarshaller(String.class),
                            DisruptionComplianceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("cost", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setCost(CostJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("haArchitecture", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setHaArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("optimizationType", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setOptimizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationCompliance", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setRecommendationCompliance(new MapUnmarshaller<String, RecommendationDisruptionCompliance>(context
                            .getUnmarshaller(String.class), RecommendationDisruptionComplianceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("referenceId", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suggestedChanges", targetDepth)) {
                    context.nextToken();
                    configRecommendation.setSuggestedChanges(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configRecommendation;
    }

    private static ConfigRecommendationJsonUnmarshaller instance;

    public static ConfigRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigRecommendationJsonUnmarshaller();
        return instance;
    }
}
