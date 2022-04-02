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
package com.amazonaws.services.secretsmanager;

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;

/**
 * Interface for accessing AWS Secrets Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.secretsmanager.AbstractAWSSecretsManagerAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Web Services Secrets Manager</fullname>
 * <p>
 * Amazon Web Services Secrets Manager provides a service to enable you to store, manage, and retrieve, secrets.
 * </p>
 * <p>
 * This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
 * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">Amazon Web Services Secrets
 * Manager User Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API, you can use one of the Amazon Web Services SDKs, which consist of libraries and
 * sample code for various programming languages and platforms such as Java, Ruby, .NET, iOS, and Android. The SDKs
 * provide a convenient way to create programmatic access to Amazon Web Services Secrets Manager. For example, the SDKs
 * provide cryptographically signing requests, managing errors, and retrying requests automatically. For more
 * information about the Amazon Web Services SDKs, including downloading and installing them, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend you use the Amazon Web Services SDKs to make programmatic API calls to Secrets Manager. However, you
 * also can use the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn
 * more about the Secrets Manager HTTP Query API, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/query-requests.html">Making Query Requests</a> in
 * the <i>Amazon Web Services Secrets Manager User Guide</i>.
 * </p>
 * <p>
 * Secrets Manager API supports GET and POST requests for all actions, and doesn't require you to use GET for some
 * actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for
 * operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Support and Feedback for Amazon Web Services Secrets Manager</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback
 * and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">Amazon Web Services Secrets
 * Manager Discussion Forum</a>. For more information about the Amazon Web Services Discussion Forums, see <a
 * href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>How examples are presented</b>
 * </p>
 * <p>
 * The JSON that Amazon Web Services Secrets Manager expects as your request parameters and the service returns as a
 * response to HTTP query requests contain single, long strings without line breaks or white space formatting. The JSON
 * shown in the examples displays the code formatted with both line breaks and white space to improve readability. When
 * example input parameters can also cause long strings extending beyond the screen, you can insert line breaks to
 * enhance readability. You should always submit the input as a single JSON text string.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * Amazon Web Services Secrets Manager supports Amazon Web Services CloudTrail, a service that records Amazon Web
 * Services API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using
 * information that's collected by Amazon Web Services CloudTrail, you can determine the requests successfully made to
 * Secrets Manager, who made the request, when it was made, and so on. For more about Amazon Web Services Secrets
 * Manager and support for Amazon Web Services CloudTrail, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging
 * Amazon Web Services Secrets Manager Events with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services
 * Secrets Manager User Guide</i>. To learn more about CloudTrail, including enabling it and find your log files, see
 * the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">Amazon
 * Web Services CloudTrail User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecretsManagerAsync extends AWSSecretsManager {

    /**
     * <p>
     * Turns off automatic rotation, and if a rotation is currently in progress, cancels the rotation.
     * </p>
     * <p>
     * To turn on automatic rotation again, call <a>RotateSecret</a>.
     * </p>
     * <note>
     * <p>
     * If you cancel a rotation in progress, it can leave the <code>VersionStage</code> labels in an unexpected state.
     * Depending on the step of the rotation in progress, you might need to remove the staging label
     * <code>AWSPENDING</code> from the partially created version, specified by the <code>VersionId</code> response
     * value. We recommend you also evaluate the partially rotated new version to see if it should be deleted. You can
     * delete a version by removing all staging labels from it.
     * </p>
     * </note>
     * 
     * @param cancelRotateSecretRequest
     * @return A Java Future containing the result of the CancelRotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.CancelRotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest cancelRotateSecretRequest);

    /**
     * <p>
     * Turns off automatic rotation, and if a rotation is currently in progress, cancels the rotation.
     * </p>
     * <p>
     * To turn on automatic rotation again, call <a>RotateSecret</a>.
     * </p>
     * <note>
     * <p>
     * If you cancel a rotation in progress, it can leave the <code>VersionStage</code> labels in an unexpected state.
     * Depending on the step of the rotation in progress, you might need to remove the staging label
     * <code>AWSPENDING</code> from the partially created version, specified by the <code>VersionId</code> response
     * value. We recommend you also evaluate the partially rotated new version to see if it should be deleted. You can
     * delete a version by removing all staging labels from it.
     * </p>
     * </note>
     * 
     * @param cancelRotateSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelRotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.CancelRotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest cancelRotateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<CancelRotateSecretRequest, CancelRotateSecretResult> asyncHandler);

    /**
     * <p>
     * Creates a new secret. A <i>secret</i> is a set of credentials, such as a user name and password, that you store
     * in an encrypted form in Secrets Manager. The secret also includes the connection information to access a database
     * or other service, which Secrets Manager doesn't encrypt. A secret in Secrets Manager consists of both the
     * protected secret data and the important information needed to manage the secret.
     * </p>
     * <p>
     * For information about creating a secret in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html">Create a
     * secret</a>.
     * </p>
     * <p>
     * To create a secret, you can provide the secret value to be encrypted in either the <code>SecretString</code>
     * parameter or the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or
     * <code>SecretBinary</code> then Secrets Manager creates an initial secret version and automatically attaches the
     * staging label <code>AWSCURRENT</code> to it.
     * </p>
     * <p>
     * If you don't specify an KMS encryption key, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * 
     * @param createSecretRequest
     * @return A Java Future containing the result of the CreateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.CreateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest createSecretRequest);

    /**
     * <p>
     * Creates a new secret. A <i>secret</i> is a set of credentials, such as a user name and password, that you store
     * in an encrypted form in Secrets Manager. The secret also includes the connection information to access a database
     * or other service, which Secrets Manager doesn't encrypt. A secret in Secrets Manager consists of both the
     * protected secret data and the important information needed to manage the secret.
     * </p>
     * <p>
     * For information about creating a secret in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html">Create a
     * secret</a>.
     * </p>
     * <p>
     * To create a secret, you can provide the secret value to be encrypted in either the <code>SecretString</code>
     * parameter or the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or
     * <code>SecretBinary</code> then Secrets Manager creates an initial secret version and automatically attaches the
     * staging label <code>AWSCURRENT</code> to it.
     * </p>
     * <p>
     * If you don't specify an KMS encryption key, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * 
     * @param createSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.CreateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest createSecretRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecretRequest, CreateSecretResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource-based permission policy attached to the secret. To attach a policy to a secret, use
     * <a>PutResourcePolicy</a>.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the resource-based permission policy attached to the secret. To attach a policy to a secret, use
     * <a>PutResourcePolicy</a>.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a secret and all of its versions. You can specify a recovery window during which you can restore the
     * secret. The minimum recovery window is 7 days. The default recovery window is 30 days. Secrets Manager attaches a
     * <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window. At the end of the
     * recovery window, Secrets Manager deletes the secret permanently.
     * </p>
     * <p>
     * For information about deleting a secret in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_delete-secret.html"
     * >https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_delete-secret.html</a>.
     * </p>
     * <p>
     * Secrets Manager performs the permanent secret deletion at the end of the waiting period as a background task with
     * low priority. There is no guarantee of a specific time after the recovery window for the permanent delete to
     * occur.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code>
     * and cancel the deletion of the secret.
     * </p>
     * <p>
     * In a secret scheduled for deletion, you cannot access the encrypted secret value. To access that information,
     * first cancel the deletion with <a>RestoreSecret</a> and then retrieve the information.
     * </p>
     * 
     * @param deleteSecretRequest
     * @return A Java Future containing the result of the DeleteSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.DeleteSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest deleteSecretRequest);

    /**
     * <p>
     * Deletes a secret and all of its versions. You can specify a recovery window during which you can restore the
     * secret. The minimum recovery window is 7 days. The default recovery window is 30 days. Secrets Manager attaches a
     * <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window. At the end of the
     * recovery window, Secrets Manager deletes the secret permanently.
     * </p>
     * <p>
     * For information about deleting a secret in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_delete-secret.html"
     * >https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_delete-secret.html</a>.
     * </p>
     * <p>
     * Secrets Manager performs the permanent secret deletion at the end of the waiting period as a background task with
     * low priority. There is no guarantee of a specific time after the recovery window for the permanent delete to
     * occur.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code>
     * and cancel the deletion of the secret.
     * </p>
     * <p>
     * In a secret scheduled for deletion, you cannot access the encrypted secret value. To access that information,
     * first cancel the deletion with <a>RestoreSecret</a> and then retrieve the information.
     * </p>
     * 
     * @param deleteSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DeleteSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest deleteSecretRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecretRequest, DeleteSecretResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a secret. It does not include the encrypted secret value. Secrets Manager only returns
     * fields that have a value in the response.
     * </p>
     * 
     * @param describeSecretRequest
     * @return A Java Future containing the result of the DescribeSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.DescribeSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest describeSecretRequest);

    /**
     * <p>
     * Retrieves the details of a secret. It does not include the encrypted secret value. Secrets Manager only returns
     * fields that have a value in the response.
     * </p>
     * 
     * @param describeSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.DescribeSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest describeSecretRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecretRequest, DescribeSecretResult> asyncHandler);

    /**
     * <p>
     * Generates a random password. We recommend that you specify the maximum length and include every character type
     * that the system you are generating a password for can support.
     * </p>
     * 
     * @param getRandomPasswordRequest
     * @return A Java Future containing the result of the GetRandomPassword operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetRandomPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest getRandomPasswordRequest);

    /**
     * <p>
     * Generates a random password. We recommend that you specify the maximum length and include every character type
     * that the system you are generating a password for can support.
     * </p>
     * 
     * @param getRandomPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRandomPassword operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetRandomPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest getRandomPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<GetRandomPasswordRequest, GetRandomPasswordResult> asyncHandler);

    /**
     * <p>
     * Retrieves the JSON text of the resource-based policy document attached to the secret. For more information about
     * permissions policies attached to a secret, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-policies.html"
     * >Permissions policies attached to a secret</a>.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Retrieves the JSON text of the resource-based policy document attached to the secret. For more information about
     * permissions policies attached to a secret, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-policies.html"
     * >Permissions policies attached to a secret</a>.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the contents of the encrypted fields <code>SecretString</code> or <code>SecretBinary</code> from the
     * specified version of a secret, whichever contains content.
     * </p>
     * <p>
     * For information about retrieving the secret value in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html">Retrieve secrets</a>.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:GetSecretValue</code> permissions. If the secret is
     * encrypted using a customer-managed key instead of the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>, then you also need <code>kms:Decrypt</code> permissions for that key.
     * </p>
     * 
     * @param getSecretValueRequest
     * @return A Java Future containing the result of the GetSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsync.GetSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest getSecretValueRequest);

    /**
     * <p>
     * Retrieves the contents of the encrypted fields <code>SecretString</code> or <code>SecretBinary</code> from the
     * specified version of a secret, whichever contains content.
     * </p>
     * <p>
     * For information about retrieving the secret value in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html">Retrieve secrets</a>.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:GetSecretValue</code> permissions. If the secret is
     * encrypted using a customer-managed key instead of the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>, then you also need <code>kms:Decrypt</code> permissions for that key.
     * </p>
     * 
     * @param getSecretValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.GetSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest getSecretValueRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecretValueRequest, GetSecretValueResult> asyncHandler);

    /**
     * <p>
     * Lists the versions for a secret.
     * </p>
     * <p>
     * To list the secrets in the account, use <a>ListSecrets</a>.
     * </p>
     * <p>
     * To get the secret value from <code>SecretString</code> or <code>SecretBinary</code>, call <a>GetSecretValue</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:ListSecretVersionIds</code> permissions.
     * </p>
     * 
     * @param listSecretVersionIdsRequest
     * @return A Java Future containing the result of the ListSecretVersionIds operation returned by the service.
     * @sample AWSSecretsManagerAsync.ListSecretVersionIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest listSecretVersionIdsRequest);

    /**
     * <p>
     * Lists the versions for a secret.
     * </p>
     * <p>
     * To list the secrets in the account, use <a>ListSecrets</a>.
     * </p>
     * <p>
     * To get the secret value from <code>SecretString</code> or <code>SecretBinary</code>, call <a>GetSecretValue</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:ListSecretVersionIds</code> permissions.
     * </p>
     * 
     * @param listSecretVersionIdsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecretVersionIds operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ListSecretVersionIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest listSecretVersionIdsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecretVersionIdsRequest, ListSecretVersionIdsResult> asyncHandler);

    /**
     * <p>
     * Lists the secrets that are stored by Secrets Manager in the Amazon Web Services account.
     * </p>
     * <p>
     * To list the versions of a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * <p>
     * To get the secret value from <code>SecretString</code> or <code>SecretBinary</code>, call <a>GetSecretValue</a>.
     * </p>
     * <p>
     * For information about finding secrets in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_search-secret.html">Enhanced search
     * capabilities for secrets in Secrets Manager</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:ListSecrets</code> permissions.
     * </p>
     * 
     * @param listSecretsRequest
     * @return A Java Future containing the result of the ListSecrets operation returned by the service.
     * @sample AWSSecretsManagerAsync.ListSecrets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest listSecretsRequest);

    /**
     * <p>
     * Lists the secrets that are stored by Secrets Manager in the Amazon Web Services account.
     * </p>
     * <p>
     * To list the versions of a secret, use <a>ListSecretVersionIds</a>.
     * </p>
     * <p>
     * To get the secret value from <code>SecretString</code> or <code>SecretBinary</code>, call <a>GetSecretValue</a>.
     * </p>
     * <p>
     * For information about finding secrets in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_search-secret.html">Enhanced search
     * capabilities for secrets in Secrets Manager</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:ListSecrets</code> permissions.
     * </p>
     * 
     * @param listSecretsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecrets operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ListSecrets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest listSecretsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecretsRequest, ListSecretsResult> asyncHandler);

    /**
     * <p>
     * Attaches a resource-based permission policy to a secret. A resource-based policy is optional. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control for Secrets Manager</a>
     * </p>
     * <p>
     * For information about attaching a policy in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html"
     * >Attach a permissions policy to a secret</a>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to a secret. A resource-based policy is optional. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and access
     * control for Secrets Manager</a>
     * </p>
     * <p>
     * For information about attaching a policy in the console, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html"
     * >Attach a permissions policy to a secret</a>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new version with a new encrypted secret value and attaches it to the secret. The version can contain a
     * new <code>SecretString</code> value or a new <code>SecretBinary</code> value.
     * </p>
     * <p>
     * We recommend you avoid calling <code>PutSecretValue</code> at a sustained rate of more than once every 10
     * minutes. When you update the secret value, Secrets Manager creates a new version of the secret. Secrets Manager
     * removes outdated versions when there are more than 100, but it does not remove versions created less than 24
     * hours ago. If you call <code>PutSecretValue</code> more than once every 10 minutes, you create more versions than
     * Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * You can specify the staging labels to attach to the new version in <code>VersionStages</code>. If you don't
     * include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version. If this operation creates the first version for the secret, then Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to it .
     * </p>
     * <p>
     * If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version, then
     * Secrets Manager also automatically moves the staging label <code>AWSPREVIOUS</code> to the version that
     * <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the
     * <code>ClientRequestToken</code> parameter already exists, and you specify the same secret data, the operation
     * succeeds but does nothing. However, if the secret data is different, then the operation fails because you can't
     * modify an existing version; you can only create new ones.
     * </p>
     * 
     * @param putSecretValueRequest
     * @return A Java Future containing the result of the PutSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsync.PutSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest putSecretValueRequest);

    /**
     * <p>
     * Creates a new version with a new encrypted secret value and attaches it to the secret. The version can contain a
     * new <code>SecretString</code> value or a new <code>SecretBinary</code> value.
     * </p>
     * <p>
     * We recommend you avoid calling <code>PutSecretValue</code> at a sustained rate of more than once every 10
     * minutes. When you update the secret value, Secrets Manager creates a new version of the secret. Secrets Manager
     * removes outdated versions when there are more than 100, but it does not remove versions created less than 24
     * hours ago. If you call <code>PutSecretValue</code> more than once every 10 minutes, you create more versions than
     * Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * You can specify the staging labels to attach to the new version in <code>VersionStages</code>. If you don't
     * include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version. If this operation creates the first version for the secret, then Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to it .
     * </p>
     * <p>
     * If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version, then
     * Secrets Manager also automatically moves the staging label <code>AWSPREVIOUS</code> to the version that
     * <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the
     * <code>ClientRequestToken</code> parameter already exists, and you specify the same secret data, the operation
     * succeeds but does nothing. However, if the secret data is different, then the operation fails because you can't
     * modify an existing version; you can only create new ones.
     * </p>
     * 
     * @param putSecretValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSecretValue operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.PutSecretValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest putSecretValueRequest,
            com.amazonaws.handlers.AsyncHandler<PutSecretValueRequest, PutSecretValueResult> asyncHandler);

    /**
     * <p>
     * For a secret that is replicated to other Regions, deletes the secret replicas from the Regions you specify.
     * </p>
     * 
     * @param removeRegionsFromReplicationRequest
     * @return A Java Future containing the result of the RemoveRegionsFromReplication operation returned by the
     *         service.
     * @sample AWSSecretsManagerAsync.RemoveRegionsFromReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRegionsFromReplicationResult> removeRegionsFromReplicationAsync(
            RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest);

    /**
     * <p>
     * For a secret that is replicated to other Regions, deletes the secret replicas from the Regions you specify.
     * </p>
     * 
     * @param removeRegionsFromReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveRegionsFromReplication operation returned by the
     *         service.
     * @sample AWSSecretsManagerAsyncHandler.RemoveRegionsFromReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveRegionsFromReplicationResult> removeRegionsFromReplicationAsync(
            RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveRegionsFromReplicationRequest, RemoveRegionsFromReplicationResult> asyncHandler);

    /**
     * <p>
     * Replicates the secret to a new Regions. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/create-manage-multi-region-secrets.html"
     * >Multi-Region secrets</a>.
     * </p>
     * 
     * @param replicateSecretToRegionsRequest
     * @return A Java Future containing the result of the ReplicateSecretToRegions operation returned by the service.
     * @sample AWSSecretsManagerAsync.ReplicateSecretToRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicateSecretToRegionsResult> replicateSecretToRegionsAsync(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest);

    /**
     * <p>
     * Replicates the secret to a new Regions. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/create-manage-multi-region-secrets.html"
     * >Multi-Region secrets</a>.
     * </p>
     * 
     * @param replicateSecretToRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReplicateSecretToRegions operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ReplicateSecretToRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReplicateSecretToRegionsResult> replicateSecretToRegionsAsync(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<ReplicateSecretToRegionsRequest, ReplicateSecretToRegionsResult> asyncHandler);

    /**
     * <p>
     * Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. You can access a
     * secret again after it has been restored.
     * </p>
     * 
     * @param restoreSecretRequest
     * @return A Java Future containing the result of the RestoreSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.RestoreSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RestoreSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest restoreSecretRequest);

    /**
     * <p>
     * Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. You can access a
     * secret again after it has been restored.
     * </p>
     * 
     * @param restoreSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.RestoreSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RestoreSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest restoreSecretRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreSecretRequest, RestoreSecretResult> asyncHandler);

    /**
     * <p>
     * Configures and starts the asynchronous process of rotating the secret.
     * </p>
     * <p>
     * If you include the configuration parameters, the operation sets the values for the secret and then immediately
     * starts a rotation. If you don't include the configuration parameters, the operation starts a rotation with the
     * values already stored in the secret. For more information about rotation, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotate secrets</a>.
     * </p>
     * <p>
     * To configure rotation, you include the ARN of an Amazon Web Services Lambda function and the schedule for the
     * rotation. The Lambda rotation function creates a new version of the secret and creates or updates the credentials
     * on the database or service to match. After testing the new credentials, the function marks the new secret version
     * with the staging label <code>AWSCURRENT</code>. Then anyone who retrieves the secret gets the new version. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * <p>
     * When rotation is successful, the <code>AWSPENDING</code> staging label might be attached to the same version as
     * the <code>AWSCURRENT</code> version, or it might not be attached to any version.
     * </p>
     * <p>
     * If the <code>AWSPENDING</code> staging label is present but not attached to the same version as
     * <code>AWSCURRENT</code>, then any later invocation of <code>RotateSecret</code> assumes that a previous rotation
     * request is still in progress and returns an error.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:RotateSecret</code> permissions and
     * <code>lambda:InvokeFunction</code> permissions on the function specified in the secret's metadata.
     * </p>
     * 
     * @param rotateSecretRequest
     * @return A Java Future containing the result of the RotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.RotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest rotateSecretRequest);

    /**
     * <p>
     * Configures and starts the asynchronous process of rotating the secret.
     * </p>
     * <p>
     * If you include the configuration parameters, the operation sets the values for the secret and then immediately
     * starts a rotation. If you don't include the configuration parameters, the operation starts a rotation with the
     * values already stored in the secret. For more information about rotation, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotate secrets</a>.
     * </p>
     * <p>
     * To configure rotation, you include the ARN of an Amazon Web Services Lambda function and the schedule for the
     * rotation. The Lambda rotation function creates a new version of the secret and creates or updates the credentials
     * on the database or service to match. After testing the new credentials, the function marks the new secret version
     * with the staging label <code>AWSCURRENT</code>. Then anyone who retrieves the secret gets the new version. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * <p>
     * When rotation is successful, the <code>AWSPENDING</code> staging label might be attached to the same version as
     * the <code>AWSCURRENT</code> version, or it might not be attached to any version.
     * </p>
     * <p>
     * If the <code>AWSPENDING</code> staging label is present but not attached to the same version as
     * <code>AWSCURRENT</code>, then any later invocation of <code>RotateSecret</code> assumes that a previous rotation
     * request is still in progress and returns an error.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:RotateSecret</code> permissions and
     * <code>lambda:InvokeFunction</code> permissions on the function specified in the secret's metadata.
     * </p>
     * 
     * @param rotateSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.RotateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest rotateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<RotateSecretRequest, RotateSecretResult> asyncHandler);

    /**
     * <p>
     * Removes the link between the replica secret and the primary secret and promotes the replica to a primary secret
     * in the replica Region.
     * </p>
     * <p>
     * You must call this operation from the Region in which you want to promote the replica to a primary secret.
     * </p>
     * 
     * @param stopReplicationToReplicaRequest
     * @return A Java Future containing the result of the StopReplicationToReplica operation returned by the service.
     * @sample AWSSecretsManagerAsync.StopReplicationToReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationToReplicaResult> stopReplicationToReplicaAsync(StopReplicationToReplicaRequest stopReplicationToReplicaRequest);

    /**
     * <p>
     * Removes the link between the replica secret and the primary secret and promotes the replica to a primary secret
     * in the replica Region.
     * </p>
     * <p>
     * You must call this operation from the Region in which you want to promote the replica to a primary secret.
     * </p>
     * 
     * @param stopReplicationToReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopReplicationToReplica operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.StopReplicationToReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationToReplicaResult> stopReplicationToReplicaAsync(StopReplicationToReplicaRequest stopReplicationToReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<StopReplicationToReplicaRequest, StopReplicationToReplicaResult> asyncHandler);

    /**
     * <p>
     * Attaches tags to a secret. Tags consist of a key name and a value. Tags are part of the secret's metadata. They
     * are not associated with specific versions of the secret. This operation appends tags to the existing list of
     * tags.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then adding or removing a tag can change permissions. If
     * successfully completing this operation would result in you losing your permissions for this secret, then the
     * operation is blocked and returns an Access Denied error.
     * </p>
     * </important>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecretsManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Attaches tags to a secret. Tags consist of a key name and a value. Tags are part of the secret's metadata. They
     * are not associated with specific versions of the secret. This operation appends tags to the existing list of
     * tags.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then adding or removing a tag can change permissions. If
     * successfully completing this operation would result in you losing your permissions for this secret, then the
     * operation is blocked and returns an Access Denied error.
     * </p>
     * </important>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes specific tags from a secret.
     * </p>
     * <p>
     * This operation is idempotent. If a requested tag is not attached to the secret, no error is returned and the
     * secret metadata is unchanged.
     * </p>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then removing a tag can change permissions. If successfully
     * completing this operation would result in you losing your permissions for this secret, then the operation is
     * blocked and returns an Access Denied error.
     * </p>
     * </important>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecretsManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes specific tags from a secret.
     * </p>
     * <p>
     * This operation is idempotent. If a requested tag is not attached to the secret, no error is returned and the
     * secret metadata is unchanged.
     * </p>
     * <important>
     * <p>
     * If you use tags as part of your security strategy, then removing a tag can change permissions. If successfully
     * completing this operation would result in you losing your permissions for this secret, then the operation is
     * blocked and returns an Access Denied error.
     * </p>
     * </important>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the details of a secret, including metadata and the secret value. To change the secret value, you can
     * also use <a>PutSecretValue</a>.
     * </p>
     * <p>
     * To change the rotation configuration of a secret, use <a>RotateSecret</a> instead.
     * </p>
     * <p>
     * We recommend you avoid calling <code>UpdateSecret</code> at a sustained rate of more than once every 10 minutes.
     * When you call <code>UpdateSecret</code> to update the secret value, Secrets Manager creates a new version of the
     * secret. Secrets Manager removes outdated versions when there are more than 100, but it does not remove versions
     * created less than 24 hours ago. If you update the secret value more than once every 10 minutes, you create more
     * versions than Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * <p>
     * If you call this operation with a <code>VersionId</code> that matches an existing version's
     * <code>ClientRequestToken</code>, the operation results in an error. You can't modify an existing version, you can
     * only create a new version. To remove a version, remove all staging labels from it. See
     * <a>UpdateSecretVersionStage</a>.
     * </p>
     * <p>
     * If you don't specify an KMS encryption key, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed key.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:UpdateSecret</code> permissions. If you use a customer
     * managed key, you must also have <code>kms:GenerateDataKey</code> and <code>kms:Decrypt</code> permissions .
     * </p>
     * 
     * @param updateSecretRequest
     * @return A Java Future containing the result of the UpdateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsync.UpdateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest updateSecretRequest);

    /**
     * <p>
     * Modifies the details of a secret, including metadata and the secret value. To change the secret value, you can
     * also use <a>PutSecretValue</a>.
     * </p>
     * <p>
     * To change the rotation configuration of a secret, use <a>RotateSecret</a> instead.
     * </p>
     * <p>
     * We recommend you avoid calling <code>UpdateSecret</code> at a sustained rate of more than once every 10 minutes.
     * When you call <code>UpdateSecret</code> to update the secret value, Secrets Manager creates a new version of the
     * secret. Secrets Manager removes outdated versions when there are more than 100, but it does not remove versions
     * created less than 24 hours ago. If you update the secret value more than once every 10 minutes, you create more
     * versions than Secrets Manager removes, and you will reach the quota for secret versions.
     * </p>
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets
     * Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.
     * </p>
     * <p>
     * If you call this operation with a <code>VersionId</code> that matches an existing version's
     * <code>ClientRequestToken</code>, the operation results in an error. You can't modify an existing version, you can
     * only create a new version. To remove a version, remove all staging labels from it. See
     * <a>UpdateSecretVersionStage</a>.
     * </p>
     * <p>
     * If you don't specify an KMS encryption key, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed key.
     * </p>
     * <p>
     * To run this command, you must have <code>secretsmanager:UpdateSecret</code> permissions. If you use a customer
     * managed key, you must also have <code>kms:GenerateDataKey</code> and <code>kms:Decrypt</code> permissions .
     * </p>
     * 
     * @param updateSecretRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecret operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UpdateSecret
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest updateSecretRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretRequest, UpdateSecretResult> asyncHandler);

    /**
     * <p>
     * Modifies the staging labels attached to a version of a secret. Secrets Manager uses staging labels to track a
     * version as it progresses through the secret rotation process. Each staging label can be attached to only one
     * version at a time. To add a staging label to a version when it is already attached to another version, Secrets
     * Manager first removes it from the other version first and then attaches it to this one. For more information
     * about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of
     * staging labels for the version.
     * </p>
     * <p>
     * You can move the <code>AWSCURRENT</code> staging label to this version by including it in this call.
     * </p>
     * <note>
     * <p>
     * Whenever you move <code>AWSCURRENT</code>, Secrets Manager automatically moves the label <code>AWSPREVIOUS</code>
     * to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * </note>
     * <p>
     * If this action results in the last label being removed from a version, then the version is considered to be
     * 'deprecated' and can be deleted by Secrets Manager.
     * </p>
     * 
     * @param updateSecretVersionStageRequest
     * @return A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service.
     * @sample AWSSecretsManagerAsync.UpdateSecretVersionStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest updateSecretVersionStageRequest);

    /**
     * <p>
     * Modifies the staging labels attached to a version of a secret. Secrets Manager uses staging labels to track a
     * version as it progresses through the secret rotation process. Each staging label can be attached to only one
     * version at a time. To add a staging label to a version when it is already attached to another version, Secrets
     * Manager first removes it from the other version first and then attaches it to this one. For more information
     * about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of
     * staging labels for the version.
     * </p>
     * <p>
     * You can move the <code>AWSCURRENT</code> staging label to this version by including it in this call.
     * </p>
     * <note>
     * <p>
     * Whenever you move <code>AWSCURRENT</code>, Secrets Manager automatically moves the label <code>AWSPREVIOUS</code>
     * to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * </note>
     * <p>
     * If this action results in the last label being removed from a version, then the version is considered to be
     * 'deprecated' and can be deleted by Secrets Manager.
     * </p>
     * 
     * @param updateSecretVersionStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecretVersionStage operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.UpdateSecretVersionStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest updateSecretVersionStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretVersionStageRequest, UpdateSecretVersionStageResult> asyncHandler);

    /**
     * <p>
     * Validates that a resource policy does not grant a wide range of principals access to your secret. A
     * resource-based policy is optional for secrets.
     * </p>
     * <p>
     * The API performs three checks when validating the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sends a call to <a href=
     * "https://aws.amazon.com/blogs/security/protect-sensitive-data-in-the-cloud-with-automated-reasoning-zelkova/"
     * >Zelkova</a>, an automated reasoning engine, to ensure your resource policy does not allow broad access to your
     * secret, for example policies that use a wildcard for the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * Checks for correct syntax in a policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verifies the policy does not lock out a caller.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validateResourcePolicyRequest
     * @return A Java Future containing the result of the ValidateResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsync.ValidateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateResourcePolicyResult> validateResourcePolicyAsync(ValidateResourcePolicyRequest validateResourcePolicyRequest);

    /**
     * <p>
     * Validates that a resource policy does not grant a wide range of principals access to your secret. A
     * resource-based policy is optional for secrets.
     * </p>
     * <p>
     * The API performs three checks when validating the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sends a call to <a href=
     * "https://aws.amazon.com/blogs/security/protect-sensitive-data-in-the-cloud-with-automated-reasoning-zelkova/"
     * >Zelkova</a>, an automated reasoning engine, to ensure your resource policy does not allow broad access to your
     * secret, for example policies that use a wildcard for the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * Checks for correct syntax in a policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verifies the policy does not lock out a caller.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validateResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateResourcePolicy operation returned by the service.
     * @sample AWSSecretsManagerAsyncHandler.ValidateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateResourcePolicyResult> validateResourcePolicyAsync(ValidateResourcePolicyRequest validateResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateResourcePolicyRequest, ValidateResourcePolicyResult> asyncHandler);

}
