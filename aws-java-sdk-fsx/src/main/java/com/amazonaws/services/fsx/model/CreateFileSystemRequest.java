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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object used to create a new Amazon FSx file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     * <code>ONTAP</code>, and <code>OPENZFS</code>.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).
     * </p>
     * <p>
     * <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the value
     * that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using SSD
     * storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file
     * systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB up to
     * 196,608 GiB (192 TiB).
     * </p>
     * <p>
     * <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB up to
     * 524,288 GiB (512 TiB).
     * </p>
     * <p>
     * <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure depends
     * on the value that you set for <code>StorageType</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     * <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and
     * OpenZFS deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     * options</a> in the <i>FSx for Lustre User Guide</i>.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     * <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server and
     * one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     * <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ file
     * system configuration, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability and
     * durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html"> Availability and
     * durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     * exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag appears in
     * the console as the file system name.
     * </p>
     */
    private java.util.List<Tag> tags;

    private String kmsKeyId;
    /**
     * <p>
     * The Microsoft Windows configuration for the file system that's being created.
     * </p>
     */
    private CreateFileSystemWindowsConfiguration windowsConfiguration;

    private CreateFileSystemLustreConfiguration lustreConfiguration;

    private CreateFileSystemOntapConfiguration ontapConfiguration;
    /**
     * <p>
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're creating.
     * Valid values are <code>2.10</code> and <code>2.12</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for Lustre
     * <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to <code>PERSISTENT_2</code>,
     * then the default is <code>2.12</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     * deployment type, the <code>CreateFileSystem</code> operation fails.
     * </p>
     * </note>
     */
    private String fileSystemTypeVersion;
    /**
     * <p>
     * The OpenZFS configuration for the file system that's being created.
     * </p>
     */
    private CreateFileSystemOpenZFSConfiguration openZFSConfiguration;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *         automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *         Services SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     * <code>ONTAP</code>, and <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     *        <code>ONTAP</code>, and <code>OPENZFS</code>.
     * @see FileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     * <code>ONTAP</code>, and <code>OPENZFS</code>.
     * </p>
     * 
     * @return The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     *         <code>ONTAP</code>, and <code>OPENZFS</code>.
     * @see FileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     * <code>ONTAP</code>, and <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     *        <code>ONTAP</code>, and <code>OPENZFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public CreateFileSystemRequest withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     * <code>ONTAP</code>, and <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create. Valid values are <code>WINDOWS</code>, <code>LUSTRE</code>,
     *        <code>ONTAP</code>, and <code>OPENZFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public CreateFileSystemRequest withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).
     * </p>
     * <p>
     * <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the value
     * that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using SSD
     * storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file
     * systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB up to
     * 196,608 GiB (192 TiB).
     * </p>
     * <p>
     * <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB up to
     * 524,288 GiB (512 TiB).
     * </p>
     * <p>
     * <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure depends
     * on the value that you set for <code>StorageType</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageCapacity
     *        Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).</p>
     *        <p>
     *        <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the
     *        value that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using
     *        SSD storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB
     *        file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600
     *        GiB.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB
     *        up to 196,608 GiB (192 TiB).
     *        </p>
     *        <p>
     *        <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB
     *        up to 524,288 GiB (512 TiB).
     *        </p>
     *        <p>
     *        <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure
     *        depends on the value that you set for <code>StorageType</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).
     * </p>
     * <p>
     * <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the value
     * that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using SSD
     * storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file
     * systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB up to
     * 196,608 GiB (192 TiB).
     * </p>
     * <p>
     * <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB up to
     * 524,288 GiB (512 TiB).
     * </p>
     * <p>
     * <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure depends
     * on the value that you set for <code>StorageType</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).</p>
     *         <p>
     *         <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the
     *         value that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types
     *         using SSD storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB
     *         file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600
     *         GiB.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024
     *         GiB up to 196,608 GiB (192 TiB).
     *         </p>
     *         <p>
     *         <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64
     *         GiB up to 524,288 GiB (512 TiB).
     *         </p>
     *         <p>
     *         <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure
     *         depends on the value that you set for <code>StorageType</code> as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *         </p>
     *         </li>
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).
     * </p>
     * <p>
     * <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the value
     * that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using SSD
     * storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file
     * systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB up to
     * 196,608 GiB (192 TiB).
     * </p>
     * <p>
     * <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB up to
     * 524,288 GiB (512 TiB).
     * </p>
     * <p>
     * <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure depends
     * on the value that you set for <code>StorageType</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageCapacity
     *        Sets the storage capacity of the file system that you're creating, in gibibytes (GiB).</p>
     *        <p>
     *        <b>FSx for Lustre file systems</b> - The amount of storage capacity that you can configure depends on the
     *        value that you set for <code>StorageType</code> and the Lustre <code>DeploymentType</code>, as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code>, <code>PERSISTENT_2</code> and <code>PERSISTENT_1</code> deployment types using
     *        SSD storage type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB
     *        file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600
     *        GiB.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>FSx for ONTAP file systems</b> - The amount of storage capacity that you can configure is from 1024 GiB
     *        up to 196,608 GiB (192 TiB).
     *        </p>
     *        <p>
     *        <b>FSx for OpenZFS file systems</b> - The amount of storage capacity that you can configure is from 64 GiB
     *        up to 524,288 GiB (512 TiB).
     *        </p>
     *        <p>
     *        <b>FSx for Windows File Server file systems</b> - The amount of storage capacity that you can configure
     *        depends on the value that you set for <code>StorageType</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     * <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and
     * OpenZFS deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     * options</a> in the <i>FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     *        <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP,
     *        and OpenZFS deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file
     *        system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     *        options</a> in the <i>FSx for Lustre User Guide</i>.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     * <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and
     * OpenZFS deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     * options</a> in the <i>FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @return Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     *         <code>HDD</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP,
     *         and OpenZFS deployment types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *         <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file
     *         system deployment types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value is <code>SSD</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *         Storage type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     *         options</a> in the <i>FSx for Lustre User Guide</i>.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     * <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and
     * OpenZFS deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     * options</a> in the <i>FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     *        <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP,
     *        and OpenZFS deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file
     *        system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     *        options</a> in the <i>FSx for Lustre User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     * <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP, and
     * OpenZFS deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     * options</a> in the <i>FSx for Lustre User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the file system that you're creating. Valid values are <code>SSD</code> and
     *        <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows, Lustre, ONTAP,
     *        and OpenZFS deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types, and on <code>PERSISTENT</code> Lustre file
     *        system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage type options</a> in the <i>FSx for Windows File Server User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options">Multiple storage
     *        options</a> in the <i>FSx for Lustre User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     * <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server and
     * one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     * <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ file
     * system configuration, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability and
     * durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html"> Availability and
     * durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     * exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @return Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     *         <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file
     *         server and one for the standby file server. You specify one of these subnets as the preferred subnet
     *         using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     *         <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ
     *         file system configuration, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability
     *         and durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i>
     *         and <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">
     *         Availability and durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.</p>
     *         <p>
     *         For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types,
     *         provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     * <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server and
     * one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     * <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ file
     * system configuration, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability and
     * durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html"> Availability and
     * durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     * exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     *        <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server
     *        and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     *        <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     *        <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ
     *        file system configuration, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability
     *        and durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i>
     *        and <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">
     *        Availability and durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     *        exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     * <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server and
     * one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     * <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ file
     * system configuration, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability and
     * durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html"> Availability and
     * durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     * exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     *        <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server
     *        and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     *        <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     *        <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ
     *        file system configuration, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability
     *        and durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i>
     *        and <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">
     *        Availability and durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     *        exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     * <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server and
     * one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     * <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ file
     * system configuration, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability and
     * durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html"> Availability and
     * durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     * exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows and ONTAP
     *        <code>MULTI_AZ_1</code> deployment types,provide exactly two subnet IDs, one for the preferred file server
     *        and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     *        <code>WindowsConfiguration &gt; PreferredSubnetID</code> or
     *        <code>OntapConfiguration &gt; PreferredSubnetID</code> properties. For more information about Multi-AZ
     *        file system configuration, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> Availability
     *        and durability: Single-AZ and Multi-AZ file systems</a> in the <i>Amazon FSx for Windows User Guide</i>
     *        and <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">
     *        Availability and durability</a> in the <i>Amazon FSx for ONTAP User Guide</i>.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> and all Lustre deployment types, provide
     *        exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @return A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *         access. This list isn't returned in later requests to describe the file system.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag appears in
     * the console as the file system name.
     * </p>
     * 
     * @return The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag
     *         appears in the console as the file system name.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag appears in
     * the console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag
     *        appears in the console as the file system name.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag appears in
     * the console as the file system name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag
     *        appears in the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag appears in
     * the console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system that's being created. The key value of the <code>Name</code> tag
     *        appears in the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @param kmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system that's being created.
     * </p>
     * 
     * @param windowsConfiguration
     *        The Microsoft Windows configuration for the file system that's being created.
     */

    public void setWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system that's being created.
     * </p>
     * 
     * @return The Microsoft Windows configuration for the file system that's being created.
     */

    public CreateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system that's being created.
     * </p>
     * 
     * @param windowsConfiguration
     *        The Microsoft Windows configuration for the file system that's being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        setWindowsConfiguration(windowsConfiguration);
        return this;
    }

    /**
     * @param lustreConfiguration
     */

    public void setLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * @return
     */

    public CreateFileSystemLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * @param lustreConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * @param ontapConfiguration
     */

    public void setOntapConfiguration(CreateFileSystemOntapConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * @return
     */

    public CreateFileSystemOntapConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * @param ontapConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withOntapConfiguration(CreateFileSystemOntapConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * <p>
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're creating.
     * Valid values are <code>2.10</code> and <code>2.12</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for Lustre
     * <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to <code>PERSISTENT_2</code>,
     * then the default is <code>2.12</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     * deployment type, the <code>CreateFileSystem</code> operation fails.
     * </p>
     * </note>
     * 
     * @param fileSystemTypeVersion
     *        (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're
     *        creating. Valid values are <code>2.10</code> and <code>2.12</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for
     *        Lustre <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to
     *        <code>PERSISTENT_2</code>, then the default is <code>2.12</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     *        deployment type, the <code>CreateFileSystem</code> operation fails.
     *        </p>
     */

    public void setFileSystemTypeVersion(String fileSystemTypeVersion) {
        this.fileSystemTypeVersion = fileSystemTypeVersion;
    }

    /**
     * <p>
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're creating.
     * Valid values are <code>2.10</code> and <code>2.12</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for Lustre
     * <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to <code>PERSISTENT_2</code>,
     * then the default is <code>2.12</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     * deployment type, the <code>CreateFileSystem</code> operation fails.
     * </p>
     * </note>
     * 
     * @return (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're
     *         creating. Valid values are <code>2.10</code> and <code>2.12</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for
     *         Lustre <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to
     *         <code>PERSISTENT_2</code>, then the default is <code>2.12</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     *         deployment type, the <code>CreateFileSystem</code> operation fails.
     *         </p>
     */

    public String getFileSystemTypeVersion() {
        return this.fileSystemTypeVersion;
    }

    /**
     * <p>
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're creating.
     * Valid values are <code>2.10</code> and <code>2.12</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for Lustre
     * <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to <code>PERSISTENT_2</code>,
     * then the default is <code>2.12</code>.
     * </p>
     * <note>
     * <p>
     * If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     * deployment type, the <code>CreateFileSystem</code> operation fails.
     * </p>
     * </note>
     * 
     * @param fileSystemTypeVersion
     *        (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that you're
     *        creating. Valid values are <code>2.10</code> and <code>2.12</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.12 is supported by all Lustre deployment types. <code>2.12</code> is required when setting FSx for
     *        Lustre <code>DeploymentType</code> to <code>PERSISTENT_2</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value = <code>2.10</code>, except when <code>DeploymentType</code> is set to
     *        <code>PERSISTENT_2</code>, then the default is <code>2.12</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>FileSystemTypeVersion</code> to <code>2.10</code> for a <code>PERSISTENT_2</code> Lustre
     *        deployment type, the <code>CreateFileSystem</code> operation fails.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withFileSystemTypeVersion(String fileSystemTypeVersion) {
        setFileSystemTypeVersion(fileSystemTypeVersion);
        return this;
    }

    /**
     * <p>
     * The OpenZFS configuration for the file system that's being created.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The OpenZFS configuration for the file system that's being created.
     */

    public void setOpenZFSConfiguration(CreateFileSystemOpenZFSConfiguration openZFSConfiguration) {
        this.openZFSConfiguration = openZFSConfiguration;
    }

    /**
     * <p>
     * The OpenZFS configuration for the file system that's being created.
     * </p>
     * 
     * @return The OpenZFS configuration for the file system that's being created.
     */

    public CreateFileSystemOpenZFSConfiguration getOpenZFSConfiguration() {
        return this.openZFSConfiguration;
    }

    /**
     * <p>
     * The OpenZFS configuration for the file system that's being created.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The OpenZFS configuration for the file system that's being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withOpenZFSConfiguration(CreateFileSystemOpenZFSConfiguration openZFSConfiguration) {
        setOpenZFSConfiguration(openZFSConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getFileSystemTypeVersion() != null)
            sb.append("FileSystemTypeVersion: ").append(getFileSystemTypeVersion()).append(",");
        if (getOpenZFSConfiguration() != null)
            sb.append("OpenZFSConfiguration: ").append(getOpenZFSConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getFileSystemTypeVersion() == null ^ this.getFileSystemTypeVersion() == null)
            return false;
        if (other.getFileSystemTypeVersion() != null && other.getFileSystemTypeVersion().equals(this.getFileSystemTypeVersion()) == false)
            return false;
        if (other.getOpenZFSConfiguration() == null ^ this.getOpenZFSConfiguration() == null)
            return false;
        if (other.getOpenZFSConfiguration() != null && other.getOpenZFSConfiguration().equals(this.getOpenZFSConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFileSystemTypeVersion() == null) ? 0 : getFileSystemTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getOpenZFSConfiguration() == null) ? 0 : getOpenZFSConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemRequest clone() {
        return (CreateFileSystemRequest) super.clone();
    }

}
