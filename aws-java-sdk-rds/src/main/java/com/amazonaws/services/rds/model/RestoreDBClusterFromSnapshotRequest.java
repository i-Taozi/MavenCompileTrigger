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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB
     * cluster snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the restored
     * DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an
     * Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterInstanceClass;
    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid Iops values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be
     *         created.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be
     *        created.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be
     *        created.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be
     *        created.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *         case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-snapshot-id</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *        <p>
     *        You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *        you can use only the ARN to specify a DB snapshot.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing Snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *         <p>
     *         You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *         you can use only the ARN to specify a DB snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing Snapshot.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *        <p>
     *        You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *        you can use only the ARN to specify a DB snapshot.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing Snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The database engine to use for the new DB cluster.</p>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use for the new DB cluster.</p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for MySQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL
     *        on Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        See <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *        >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        See <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *        >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        See <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The version of the database engine to use for the new DB cluster.</p>
     *         <p>
     *         To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora,
     *         use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for RDS for MySQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL
     *         on Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *         >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL
     *         on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         See <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *         >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use for the new DB cluster.</p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for MySQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL
     *        on Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        See <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *        >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        See <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *        >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        See <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: This value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The port number on which the new DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: This value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: This value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DB subnet group.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB subnet group to use for the new DB cluster.</p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DB subnet group.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DB subnet group.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param databaseName
     *        The database name for the restored DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The database name for the restored DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param databaseName
     *        The database name for the restored DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB cluster.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @return The name of the option group to use for the restored DB cluster.</p>
     *         <p>
     *         DB clusters are associated with a default option group that can't be modified.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB cluster.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A list of VPC security groups that the new DB cluster will belong to.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The tags to be assigned to the restored DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB
     * cluster snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the restored
     * DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB
     *        snapshot or DB cluster snapshot.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the
     *        restored DB cluster isn't encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB
     * cluster snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the restored
     * DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB
     *         snapshot or DB cluster snapshot.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *         restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *         snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the
     *         restored DB cluster isn't encrypted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB
     * cluster snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the restored
     * DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB
     *        snapshot or DB cluster snapshot.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> isn't encrypted, then the
     *        restored DB cluster isn't encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p> <note>
     *        <p>
     *        Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p> <note>
     *         <p>
     *         Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *         </p>
     *         </note>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <note>
     * <p>
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     * </p>
     * </note>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p> <note>
     *        <p>
     *        Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *         list depend on the DB engine being used.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *        CreateDBCluster</a>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *         CreateDBCluster</a>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html"> CreateDBCluster</a>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html">
     *        CreateDBCluster</a>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default DB cluster parameter group for the specified engine is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If this argument is
     *         omitted, the default DB cluster parameter group for the specified engine is used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing default DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default DB cluster parameter group for the specified engine is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *        DB cluster. The default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *         DB cluster. The default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *        DB cluster. The default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *         DB cluster. The default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an
     * Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *        to this operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
     *        created in an Active Directory Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an
     * Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *         to this operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can
     *         be created in an Active Directory Domain.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *         Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an
     * Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *        to this operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
     *        created in an Active Directory Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6g.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterInstanceClass(String dBClusterInstanceClass) {
        this.dBClusterInstanceClass = dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *         db.m6g.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *         database engines.</p>
     *         <p>
     *         For the full list of DB instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterInstanceClass() {
        return this.dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6g.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBClusterInstanceClass(String dBClusterInstanceClass) {
        setDBClusterInstanceClass(dBClusterInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         Valid values: <code>io1</code>
     *         </p>
     *         <p>
     *         When specified, a value for the <code>Iops</code> parameter is required.
     *         </p>
     *         <p>
     *         Default: <code>io1</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid Iops values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid Iops values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid Iops values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *         instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         For information about valid Iops values, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *         Provisioned IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid Iops values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid Iops values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS Storage to Improve Performance</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getDBClusterInstanceClass() != null)
            sb.append("DBClusterInstanceClass: ").append(getDBClusterInstanceClass()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBClusterFromSnapshotRequest == false)
            return false;
        RestoreDBClusterFromSnapshotRequest other = (RestoreDBClusterFromSnapshotRequest) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getDBClusterInstanceClass() == null ^ this.getDBClusterInstanceClass() == null)
            return false;
        if (other.getDBClusterInstanceClass() != null && other.getDBClusterInstanceClass().equals(this.getDBClusterInstanceClass()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getDBClusterInstanceClass() == null) ? 0 : getDBClusterInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBClusterFromSnapshotRequest clone() {
        return (RestoreDBClusterFromSnapshotRequest) super.clone();
    }

}
