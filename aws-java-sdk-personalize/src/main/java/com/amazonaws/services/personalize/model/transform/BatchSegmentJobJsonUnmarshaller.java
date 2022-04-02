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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchSegmentJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchSegmentJobJsonUnmarshaller implements Unmarshaller<BatchSegmentJob, JsonUnmarshallerContext> {

    public BatchSegmentJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchSegmentJob batchSegmentJob = new BatchSegmentJob();

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
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("batchSegmentJobArn", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setBatchSegmentJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterArn", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setFilterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionVersionArn", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setSolutionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numResults", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setNumResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jobInput", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setJobInput(BatchSegmentJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobOutput", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setJobOutput(BatchSegmentJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    batchSegmentJob.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchSegmentJob;
    }

    private static BatchSegmentJobJsonUnmarshaller instance;

    public static BatchSegmentJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchSegmentJobJsonUnmarshaller();
        return instance;
    }
}
