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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can read input data, or
 * write output from a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The unique name of the object in the bucket.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The Amazon Web Services account ID of the bucket owner.
     * </p>
     */
    private String bucketOwner;

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket name.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @return The Amazon S3 bucket name.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The unique name of the object in the bucket.
     * </p>
     * 
     * @param key
     *        The unique name of the object in the bucket.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The unique name of the object in the bucket.
     * </p>
     * 
     * @return The unique name of the object in the bucket.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The unique name of the object in the bucket.
     * </p>
     * 
     * @param key
     *        The unique name of the object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the bucket owner.
     * </p>
     * 
     * @param bucketOwner
     *        The Amazon Web Services account ID of the bucket owner.
     */

    public void setBucketOwner(String bucketOwner) {
        this.bucketOwner = bucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the bucket owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the bucket owner.
     */

    public String getBucketOwner() {
        return this.bucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the bucket owner.
     * </p>
     * 
     * @param bucketOwner
     *        The Amazon Web Services account ID of the bucket owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketOwner(String bucketOwner) {
        setBucketOwner(bucketOwner);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getBucketOwner() != null)
            sb.append("BucketOwner: ").append(getBucketOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getBucketOwner() == null ^ this.getBucketOwner() == null)
            return false;
        if (other.getBucketOwner() != null && other.getBucketOwner().equals(this.getBucketOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getBucketOwner() == null) ? 0 : getBucketOwner().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
