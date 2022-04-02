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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String newDBClusterIdentifier;
    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The number of days for which automated backups are retained. Specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String preferredMaintenanceWindow;
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
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;
    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String dBInstanceParameterGroupName;
    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the cluster from
     * its current domain. The domain must be created prior to this operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
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
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
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
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableHttpEndpoint;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableGlobalWriteForwarding;
    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String dBClusterInstanceClass;
    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
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
     * Valid for: Multi-AZ DB clusters only
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
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Boolean enablePerformanceInsights;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String performanceInsightsKMSKeyId;
    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints: This identifier must match the identifier of an existing DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints: This identifier must match the identifier of an existing DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints: This identifier must match the identifier of an existing DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param newDBClusterIdentifier
     *        The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *        lowercase string.</p>
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
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *         lowercase string.</p>
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
     *         The first character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getNewDBClusterIdentifier() {
        return this.newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param newDBClusterIdentifier
     *        The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *        lowercase string.</p>
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
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withNewDBClusterIdentifier(String newDBClusterIdentifier) {
        setNewDBClusterIdentifier(newDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *        the next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     *        <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *        <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *        <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *        <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *        changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        By default, this parameter is disabled.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *         the next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *         <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *         changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *        the next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     *        <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *        <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *        <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *        <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *        changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        By default, this parameter is disabled.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *         the next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *         <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *         changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The number of days for which automated backups are retained. Specify a minimum value of 1.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to use for the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB cluster parameter group to use for the DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to use for the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A list of VPC security groups that the DB cluster will belong to.</p>
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the DB cluster will belong to.</p>
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
     * A list of VPC security groups that the DB cluster will belong to.
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
     *        A list of VPC security groups that the DB cluster will belong to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the DB cluster will belong to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The port number on which the DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The new password for the master database user. This password can contain any printable ASCII character
     *         except "/", """, or "@".</p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *         <p>
     *         DB clusters are associated with a default option group that can't be modified.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region. To view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, using
     *         the <code>BackupRetentionPeriod</code> parameter. </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region. To view the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *         > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region. To view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
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

    public ModifyDBClusterRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
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
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
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
     *        Valid for: Aurora MySQL DB clusters only
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
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
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
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
     *         Valid for: Aurora MySQL DB clusters only
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
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
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
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
     *        Valid for: Aurora MySQL DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *         cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
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
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The version number of the database engine to which you want to upgrade. Changing this parameter results
     *         in an outage. The change is applied during the next maintenance window unless
     *         <code>ApplyImmediately</code> is enabled.</p>
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
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
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
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param dBInstanceParameterGroupName
     *        The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *        <p>
     *        When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *        cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *        window but instead are applied immediately.
     *        </p>
     *        </note>
     *        <p>
     *        Default: The existing name setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *        <code>AllowMajorVersionUpgrade</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDBInstanceParameterGroupName(String dBInstanceParameterGroupName) {
        this.dBInstanceParameterGroupName = dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *         <p>
     *         When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *         cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *         window but instead are applied immediately.
     *         </p>
     *         </note>
     *         <p>
     *         Default: The existing name setting
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *         <code>AllowMajorVersionUpgrade</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDBInstanceParameterGroupName() {
        return this.dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param dBInstanceParameterGroupName
     *        The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *        <p>
     *        When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *        cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *        window but instead are applied immediately.
     *        </p>
     *        </note>
     *        <p>
     *        Default: The existing name setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *        <code>AllowMajorVersionUpgrade</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBInstanceParameterGroupName(String dBInstanceParameterGroupName) {
        setDBInstanceParameterGroupName(dBInstanceParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the cluster from
     * its current domain. The domain must be created prior to this operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the
     *        cluster from its current domain. The domain must be created prior to this operation. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the cluster from
     * its current domain. The domain must be created prior to this operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the
     *         cluster from its current domain. The domain must be created prior to this operation. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *         Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the cluster from
     * its current domain. The domain must be created prior to this operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB cluster to. Specify <code>none</code> to remove the
     *        cluster from its current domain. The domain must be created prior to this operation. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDomain(String domain) {
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

    public ModifyDBClusterRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *        <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *         <code>serverless</code> DB engine mode.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *        <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
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

    public ModifyDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
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
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        setEnableHttpEndpoint(enableHttpEndpoint);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        this.enableGlobalWriteForwarding = enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        setEnableGlobalWriteForwarding(enableGlobalWriteForwarding);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     *        Not all DB instance classes are available in all Amazon Web Services Regions, or for all database
     *        engines.</p>
     *        <p>
     *        For the full list of DB instance classes and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setDBClusterInstanceClass(String dBClusterInstanceClass) {
        this.dBClusterInstanceClass = dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     *         db.m6g.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *         database engines.</p>
     *         <p>
     *         For the full list of DB instance classes and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getDBClusterInstanceClass() {
        return this.dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6g.xlarge.
     *        Not all DB instance classes are available in all Amazon Web Services Regions, or for all database
     *        engines.</p>
     *        <p>
     *        For the full list of DB instance classes and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBClusterInstanceClass(String dBClusterInstanceClass) {
        setDBClusterInstanceClass(dBClusterInstanceClass);
        return this;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
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
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB cluster.</p>
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
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
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
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB cluster.</p>
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
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
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
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB cluster.</p>
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
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withStorageType(String storageType) {
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
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
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
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
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
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
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
     *         Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
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
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
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
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *        than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *         than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *        than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *        Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *        on creating a monitoring role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code>
     *        value.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *         Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For
     *         information on creating a monitoring role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, supply a
     *         <code>MonitoringRoleArn</code> value.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *        Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *        on creating a monitoring role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code>
     *        value.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean isEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     *         </p>
     *         <p>
     *         If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *         default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web
     *         Services account has a different default KMS key for each Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getPerformanceInsightsKMSKeyId() {
        return this.performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2
     *         years).</p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getNewDBClusterIdentifier() != null)
            sb.append("NewDBClusterIdentifier: ").append(getNewDBClusterIdentifier()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade()).append(",");
        if (getDBInstanceParameterGroupName() != null)
            sb.append("DBInstanceParameterGroupName: ").append(getDBInstanceParameterGroupName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: ").append(getEnableHttpEndpoint()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getEnableGlobalWriteForwarding() != null)
            sb.append("EnableGlobalWriteForwarding: ").append(getEnableGlobalWriteForwarding()).append(",");
        if (getDBClusterInstanceClass() != null)
            sb.append("DBClusterInstanceClass: ").append(getDBClusterInstanceClass()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterRequest == false)
            return false;
        ModifyDBClusterRequest other = (ModifyDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getNewDBClusterIdentifier() == null ^ this.getNewDBClusterIdentifier() == null)
            return false;
        if (other.getNewDBClusterIdentifier() != null && other.getNewDBClusterIdentifier().equals(this.getNewDBClusterIdentifier()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
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
        if (other.getCloudwatchLogsExportConfiguration() == null ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(this.getCloudwatchLogsExportConfiguration()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getDBInstanceParameterGroupName() == null ^ this.getDBInstanceParameterGroupName() == null)
            return false;
        if (other.getDBInstanceParameterGroupName() != null && other.getDBInstanceParameterGroupName().equals(this.getDBInstanceParameterGroupName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEnableHttpEndpoint() == null ^ this.getEnableHttpEndpoint() == null)
            return false;
        if (other.getEnableHttpEndpoint() != null && other.getEnableHttpEndpoint().equals(this.getEnableHttpEndpoint()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getEnableGlobalWriteForwarding() == null ^ this.getEnableGlobalWriteForwarding() == null)
            return false;
        if (other.getEnableGlobalWriteForwarding() != null && other.getEnableGlobalWriteForwarding().equals(this.getEnableGlobalWriteForwarding()) == false)
            return false;
        if (other.getDBClusterInstanceClass() == null ^ this.getDBClusterInstanceClass() == null)
            return false;
        if (other.getDBClusterInstanceClass() != null && other.getDBClusterInstanceClass().equals(this.getDBClusterInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getEnablePerformanceInsights() == null ^ this.getEnablePerformanceInsights() == null)
            return false;
        if (other.getEnablePerformanceInsights() != null && other.getEnablePerformanceInsights().equals(this.getEnablePerformanceInsights()) == false)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() == null ^ this.getPerformanceInsightsKMSKeyId() == null)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() != null && other.getPerformanceInsightsKMSKeyId().equals(this.getPerformanceInsightsKMSKeyId()) == false)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() == null ^ this.getPerformanceInsightsRetentionPeriod() == null)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() != null
                && other.getPerformanceInsightsRetentionPeriod().equals(this.getPerformanceInsightsRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNewDBClusterIdentifier() == null) ? 0 : getNewDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceParameterGroupName() == null) ? 0 : getDBInstanceParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getEnableGlobalWriteForwarding() == null) ? 0 : getEnableGlobalWriteForwarding().hashCode());
        hashCode = prime * hashCode + ((getDBClusterInstanceClass() == null) ? 0 : getDBClusterInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBClusterRequest clone() {
        return (ModifyDBClusterRequest) super.clone();
    }

}
