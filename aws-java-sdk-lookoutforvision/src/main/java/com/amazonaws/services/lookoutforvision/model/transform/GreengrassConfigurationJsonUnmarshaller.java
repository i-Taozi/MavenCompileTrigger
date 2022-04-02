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
package com.amazonaws.services.lookoutforvision.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GreengrassConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GreengrassConfigurationJsonUnmarshaller implements Unmarshaller<GreengrassConfiguration, JsonUnmarshallerContext> {

    public GreengrassConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        GreengrassConfiguration greengrassConfiguration = new GreengrassConfiguration();

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
                if (context.testExpression("CompilerOptions", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setCompilerOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetDevice", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setTargetDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetPlatform", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setTargetPlatform(TargetPlatformJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3OutputLocation", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setS3OutputLocation(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ComponentName", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComponentVersion", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setComponentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComponentDescription", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setComponentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    greengrassConfiguration.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return greengrassConfiguration;
    }

    private static GreengrassConfigurationJsonUnmarshaller instance;

    public static GreengrassConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GreengrassConfigurationJsonUnmarshaller();
        return instance;
    }
}
