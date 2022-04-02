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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details regarding the file source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FileSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of content stored in the file source.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The digest of the file source.
     * </p>
     */
    private String contentDigest;
    /**
     * <p>
     * The Amazon S3 URI for the file source.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * The type of content stored in the file source.
     * </p>
     * 
     * @param contentType
     *        The type of content stored in the file source.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content stored in the file source.
     * </p>
     * 
     * @return The type of content stored in the file source.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of content stored in the file source.
     * </p>
     * 
     * @param contentType
     *        The type of content stored in the file source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSource withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The digest of the file source.
     * </p>
     * 
     * @param contentDigest
     *        The digest of the file source.
     */

    public void setContentDigest(String contentDigest) {
        this.contentDigest = contentDigest;
    }

    /**
     * <p>
     * The digest of the file source.
     * </p>
     * 
     * @return The digest of the file source.
     */

    public String getContentDigest() {
        return this.contentDigest;
    }

    /**
     * <p>
     * The digest of the file source.
     * </p>
     * 
     * @param contentDigest
     *        The digest of the file source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSource withContentDigest(String contentDigest) {
        setContentDigest(contentDigest);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI for the file source.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI for the file source.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the file source.
     * </p>
     * 
     * @return The Amazon S3 URI for the file source.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the file source.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI for the file source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSource withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentDigest() != null)
            sb.append("ContentDigest: ").append(getContentDigest()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSource == false)
            return false;
        FileSource other = (FileSource) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentDigest() == null ^ this.getContentDigest() == null)
            return false;
        if (other.getContentDigest() != null && other.getContentDigest().equals(this.getContentDigest()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentDigest() == null) ? 0 : getContentDigest().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public FileSource clone() {
        try {
            return (FileSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FileSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
