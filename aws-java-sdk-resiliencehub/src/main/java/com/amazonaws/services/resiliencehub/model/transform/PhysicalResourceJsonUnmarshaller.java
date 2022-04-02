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
 * PhysicalResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalResourceJsonUnmarshaller implements Unmarshaller<PhysicalResource, JsonUnmarshallerContext> {

    public PhysicalResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        PhysicalResource physicalResource = new PhysicalResource();

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
                if (context.testExpression("appComponents", targetDepth)) {
                    context.nextToken();
                    physicalResource.setAppComponents(new ListUnmarshaller<AppComponent>(AppComponentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("logicalResourceId", targetDepth)) {
                    context.nextToken();
                    physicalResource.setLogicalResourceId(LogicalResourceIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("physicalResourceId", targetDepth)) {
                    context.nextToken();
                    physicalResource.setPhysicalResourceId(PhysicalResourceIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    context.nextToken();
                    physicalResource.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    physicalResource.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return physicalResource;
    }

    private static PhysicalResourceJsonUnmarshaller instance;

    public static PhysicalResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhysicalResourceJsonUnmarshaller();
        return instance;
    }
}
