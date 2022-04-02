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
package com.amazonaws.services.detective;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.detective.model.*;

/**
 * Interface for accessing Amazon Detective.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.detective.AbstractAmazonDetective} instead.
 * </p>
 * <p>
 * <p>
 * Detective uses machine learning and purpose-built visualizations to help you to analyze and investigate security
 * issues across your Amazon Web Services (Amazon Web Services) workloads. Detective automatically extracts time-based
 * events such as login attempts, API calls, and network traffic from CloudTrail and Amazon Virtual Private Cloud
 * (Amazon VPC) flow logs. It also extracts findings detected by Amazon GuardDuty.
 * </p>
 * <p>
 * The Detective API primarily supports the creation and management of behavior graphs. A behavior graph contains the
 * extracted data from a set of member accounts, and is created and managed by an administrator account.
 * </p>
 * <p>
 * To add a member account to the behavior graph, the administrator account sends an invitation to the account. When the
 * account accepts the invitation, it becomes a member account in the behavior graph.
 * </p>
 * <p>
 * Detective is also integrated with Organizations. The organization management account designates the Detective
 * administrator account for the organization. That account becomes the administrator account for the organization
 * behavior graph. The Detective administrator account can enable any organization account as a member account in the
 * organization behavior graph. The organization accounts do not receive invitations. The Detective administrator
 * account can also invite other accounts to the organization behavior graph.
 * </p>
 * <p>
 * Every behavior graph is specific to a Region. You can only use the API to manage behavior graphs that belong to the
 * Region that is associated with the currently selected endpoint.
 * </p>
 * <p>
 * The administrator account for a behavior graph can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enable and disable Detective. Enabling Detective creates a new behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * View the list of member accounts in a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add member accounts to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove member accounts from a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Apply tags to a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The organization management account can use the Detective API to select the delegated administrator for Detective.
 * </p>
 * <p>
 * The Detective administrator account for an organization can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Perform all of the functions of an administrator account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Determine whether to automatically enable new organization accounts as member accounts in the organization behavior
 * graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * An invited member account can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * View the list of behavior graphs that they are invited to.
 * </p>
 * </li>
 * <li>
 * <p>
 * Accept an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Decline an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove their account from a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All API actions are logged as CloudTrail events. See <a
 * href="https://docs.aws.amazon.com/detective/latest/adminguide/logging-using-cloudtrail.html">Logging Detective API
 * Calls with CloudTrail</a>.
 * </p>
 * <note>
 * <p>
 * We replaced the term "master account" with the term "administrator account." An administrator account is used to
 * centrally manage multiple accounts. In the case of Detective, the administrator account manages the accounts in their
 * behavior graph.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDetective {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.detective";

    /**
     * <p>
     * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be
     * called by an invited member account.
     * </p>
     * <p>
     * The request provides the ARN of behavior graph.
     * </p>
     * <p>
     * The member account status in the graph must be <code>INVITED</code>.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This
     * operation is called by the account that is enabling Detective.
     * </p>
     * <p>
     * Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at
     * least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty
     * prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within
     * the Detective quota. If it exceeds the quota, then you cannot enable Detective.
     * </p>
     * <p>
     * The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN
     * of the new behavior graph.
     * </p>
     * <p>
     * <code>CreateGraph</code> triggers a process to create the corresponding data tables for the new behavior graph.
     * </p>
     * <p>
     * An account can only be the administrator account for one behavior graph within a Region. If the same account
     * calls <code>CreateGraph</code> with the same administrator account, it always returns the same behavior graph
     * ARN. It does not create a new behavior graph.
     * </p>
     * 
     * @param createGraphRequest
     * @return Result of the CreateGraph operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1200 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @sample AmazonDetective.CreateGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateGraph" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGraphResult createGraph(CreateGraphRequest createGraphRequest);

    /**
     * <p>
     * <code>CreateMembers</code> is used to send invitations to accounts. For the organization behavior graph, the
     * Detective administrator account uses <code>CreateMembers</code> to enable organization accounts as member
     * accounts.
     * </p>
     * <p>
     * For invited accounts, <code>CreateMembers</code> sends a request to invite the specified Amazon Web Services
     * accounts to be member accounts in the behavior graph. This operation can only be called by the administrator
     * account for a behavior graph.
     * </p>
     * <p>
     * <code>CreateMembers</code> verifies the accounts and then invites the verified accounts. The administrator can
     * optionally specify to not send invitation emails to the member accounts. This would be used when the
     * administrator manages their member accounts centrally.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, <code>CreateMembers</code> attempts to enable the
     * accounts. The organization accounts do not receive invitations.
     * </p>
     * <p>
     * The request provides the behavior graph ARN and the list of accounts to invite or to enable.
     * </p>
     * <p>
     * The response separates the requested accounts into two lists:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was able to process. For invited accounts, includes member accounts
     * that are being verified, that have passed verification and are to be invited, and that have failed verification.
     * For organization accounts in the organization behavior graph, includes accounts that can be enabled and that
     * cannot be enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was unable to process. This list includes accounts that were already
     * invited to be member accounts in the behavior graph.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1200 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @sample AmazonDetective.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Disables the specified behavior graph and queues it to be deleted. This operation removes the behavior graph from
     * each member account's list of behavior graphs.
     * </p>
     * <p>
     * <code>DeleteGraph</code> can only be called by the administrator account for a behavior graph.
     * </p>
     * 
     * @param deleteGraphRequest
     * @return Result of the DeleteGraph operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteGraph" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGraphResult deleteGraph(DeleteGraphRequest deleteGraphRequest);

    /**
     * <p>
     * Removes the specified member accounts from the behavior graph. The removed accounts no longer contribute data to
     * the behavior graph. This operation can only be called by the administrator account for the behavior graph.
     * </p>
     * <p>
     * For invited accounts, the removed accounts are deleted from the list of accounts in the behavior graph. To
     * restore the account, the administrator account must send another invitation.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, the Detective administrator account can always
     * enable the organization account again. Organization accounts that are not enabled as member accounts are not
     * included in the <code>ListMembers</code> results for the organization behavior graph.
     * </p>
     * <p>
     * An administrator account cannot use <code>DeleteMembers</code> to remove their own account from the behavior
     * graph. To disable a behavior graph, the administrator account uses the <code>DeleteGraph</code> API method.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Returns information about the configuration for the organization behavior graph. Currently indicates whether to
     * automatically enable new organization accounts as member accounts.
     * </p>
     * <p>
     * Can only be called by the Detective administrator account for the organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws TooManyRequestsException
     *         The request cannot be completed because too many other requests are occurring at the same time.
     * @sample AmazonDetective.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Removes the Detective administrator account for the organization in the current Region. Deletes the behavior
     * graph for that account.
     * </p>
     * <p>
     * Can only be called by the organization management account. Before you can select a different Detective
     * administrator account, you must remove the Detective administrator account in all Regions.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws TooManyRequestsException
     *         The request cannot be completed because too many other requests are occurring at the same time.
     * @sample AmazonDetective.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Removes the member account from the specified behavior graph. This operation can only be called by an invited
     * member account that has the <code>ENABLED</code> status.
     * </p>
     * <p>
     * <code>DisassociateMembership</code> cannot be called by an organization account in the organization behavior
     * graph. For the organization behavior graph, the Detective administrator account determines which organization
     * accounts to enable or disable as member accounts.
     * </p>
     * 
     * @param disassociateMembershipRequest
     * @return Result of the DisassociateMembership operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DisassociateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisassociateMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMembershipResult disassociateMembership(DisassociateMembershipRequest disassociateMembershipRequest);

    /**
     * <p>
     * Designates the Detective administrator account for the organization in the current Region.
     * </p>
     * <p>
     * If the account does not have Detective enabled, then enables Detective for that account and creates a new
     * behavior graph.
     * </p>
     * <p>
     * Can only be called by the organization management account.
     * </p>
     * <p>
     * The Detective administrator account for an organization must be the same in all Regions. If you already
     * designated a Detective administrator account in another Region, then you must designate the same account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws TooManyRequestsException
     *         The request cannot be completed because too many other requests are occurring at the same time.
     * @sample AmazonDetective.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Returns the membership details for specified member accounts for a behavior graph.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can
     * only be called by an administrator account.
     * </p>
     * <p>
     * Because an account can currently only be the administrator of one behavior graph within a Region, the results
     * always contain a single behavior graph.
     * </p>
     * 
     * @param listGraphsRequest
     * @return Result of the ListGraphs operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListGraphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
     *      Documentation</a>
     */
    ListGraphsResult listGraphs(ListGraphsRequest listGraphsRequest);

    /**
     * <p>
     * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can
     * only be called by an invited member account.
     * </p>
     * <p>
     * Open invitations are invitations that the member account has not responded to.
     * </p>
     * <p>
     * The results do not include behavior graphs for which the member account declined the invitation. The results also
     * do not include behavior graphs that the member account resigned from or was removed from.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Retrieves the list of member accounts for a behavior graph.
     * </p>
     * <p>
     * For invited accounts, the results do not include member accounts that were removed from the behavior graph.
     * </p>
     * <p>
     * For the organization behavior graph, the results do not include organization accounts that the Detective
     * administrator account has not enabled as member accounts.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Returns information about the Detective administrator account for an organization. Can only be called by the
     * organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws TooManyRequestsException
     *         The request cannot be completed because too many other requests are occurring at the same time.
     * @sample AmazonDetective.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Returns the tag values that are assigned to a behavior graph.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by an
     * invited member account that has the <code>INVITED</code> status.
     * </p>
     * <p>
     * <code>RejectInvitation</code> cannot be called by an organization account in the organization behavior graph. In
     * the organization behavior graph, organization accounts do not receive an invitation.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return Result of the RejectInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RejectInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    RejectInvitationResult rejectInvitation(RejectInvitationRequest rejectInvitationRequest);

    /**
     * <p>
     * Sends a request to enable data ingest for a member account that has a status of
     * <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * <p>
     * For valid member accounts, the status is updated as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Detective enabled the member account, then the new status is <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Detective cannot enable the member account, the status remains <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMonitoringMemberRequest
     * @return Result of the StartMonitoringMember operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1200 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.StartMonitoringMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartMonitoringMember"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitoringMemberResult startMonitoringMember(StartMonitoringMemberRequest startMonitoringMemberRequest);

    /**
     * <p>
     * Applies tag values to a behavior graph.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a behavior graph.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration for the Organizations integration in the current Region. Can only be called by the
     * Detective administrator account for the organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws TooManyRequestsException
     *         The request cannot be completed because too many other requests are occurring at the same time.
     * @sample AmazonDetective.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
