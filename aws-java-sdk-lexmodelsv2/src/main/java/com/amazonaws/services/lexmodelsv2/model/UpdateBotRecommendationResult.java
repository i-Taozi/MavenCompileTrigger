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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot containing the bot recommendation that has been updated.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot containing the bot recommendation that has been updated.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation to update. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     */
    private String botRecommendationStatus;
    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     */
    private String botRecommendationId;
    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
     * </p>
     */
    private TranscriptSourceSetting transcriptSourceSetting;
    /**
     * <p>
     * The object representing the passwords that were used to encrypt the data related to the bot recommendation
     * results, as well as the KMS key ARN used to encrypt the associated metadata.
     * </p>
     */
    private EncryptionSetting encryptionSetting;

    /**
     * <p>
     * The unique identifier of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot containing the bot recommendation that has been updated.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @return The unique identifier of the bot containing the bot recommendation that has been updated.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot containing the bot recommendation that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the bot recommendation that has been updated.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @return The version of the bot containing the bot recommendation that has been updated.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the bot recommendation that has been updated.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the bot recommendation that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation to update. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the bot recommendation to update. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation to update. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @return The identifier of the language and locale of the bot recommendation to update. The string must match one
     *         of the supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation to update. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the bot recommendation to update. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @see BotRecommendationStatus
     */

    public void setBotRecommendationStatus(String botRecommendationStatus) {
        this.botRecommendationStatus = botRecommendationStatus;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @return The status of the bot recommendation.</p>
     *         <p>
     *         If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @see BotRecommendationStatus
     */

    public String getBotRecommendationStatus() {
        return this.botRecommendationStatus;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotRecommendationStatus
     */

    public UpdateBotRecommendationResult withBotRecommendationStatus(String botRecommendationStatus) {
        setBotRecommendationStatus(botRecommendationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotRecommendationStatus
     */

    public UpdateBotRecommendationResult withBotRecommendationStatus(BotRecommendationStatus botRecommendationStatus) {
        this.botRecommendationStatus = botRecommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation to be updated.
     */

    public void setBotRecommendationId(String botRecommendationId) {
        this.botRecommendationId = botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @return The unique identifier of the bot recommendation to be updated.
     */

    public String getBotRecommendationId() {
        return this.botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withBotRecommendationId(String botRecommendationId) {
        setBotRecommendationId(botRecommendationId);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot recommendation was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot recommendation was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot recommendation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot recommendation was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot recommendation was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot recommendation was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
     * </p>
     * 
     * @param transcriptSourceSetting
     *        The object representing the Amazon S3 bucket containing the transcript, as well as the associated
     *        metadata.
     */

    public void setTranscriptSourceSetting(TranscriptSourceSetting transcriptSourceSetting) {
        this.transcriptSourceSetting = transcriptSourceSetting;
    }

    /**
     * <p>
     * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
     * </p>
     * 
     * @return The object representing the Amazon S3 bucket containing the transcript, as well as the associated
     *         metadata.
     */

    public TranscriptSourceSetting getTranscriptSourceSetting() {
        return this.transcriptSourceSetting;
    }

    /**
     * <p>
     * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
     * </p>
     * 
     * @param transcriptSourceSetting
     *        The object representing the Amazon S3 bucket containing the transcript, as well as the associated
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withTranscriptSourceSetting(TranscriptSourceSetting transcriptSourceSetting) {
        setTranscriptSourceSetting(transcriptSourceSetting);
        return this;
    }

    /**
     * <p>
     * The object representing the passwords that were used to encrypt the data related to the bot recommendation
     * results, as well as the KMS key ARN used to encrypt the associated metadata.
     * </p>
     * 
     * @param encryptionSetting
     *        The object representing the passwords that were used to encrypt the data related to the bot recommendation
     *        results, as well as the KMS key ARN used to encrypt the associated metadata.
     */

    public void setEncryptionSetting(EncryptionSetting encryptionSetting) {
        this.encryptionSetting = encryptionSetting;
    }

    /**
     * <p>
     * The object representing the passwords that were used to encrypt the data related to the bot recommendation
     * results, as well as the KMS key ARN used to encrypt the associated metadata.
     * </p>
     * 
     * @return The object representing the passwords that were used to encrypt the data related to the bot
     *         recommendation results, as well as the KMS key ARN used to encrypt the associated metadata.
     */

    public EncryptionSetting getEncryptionSetting() {
        return this.encryptionSetting;
    }

    /**
     * <p>
     * The object representing the passwords that were used to encrypt the data related to the bot recommendation
     * results, as well as the KMS key ARN used to encrypt the associated metadata.
     * </p>
     * 
     * @param encryptionSetting
     *        The object representing the passwords that were used to encrypt the data related to the bot recommendation
     *        results, as well as the KMS key ARN used to encrypt the associated metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRecommendationResult withEncryptionSetting(EncryptionSetting encryptionSetting) {
        setEncryptionSetting(encryptionSetting);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getBotRecommendationStatus() != null)
            sb.append("BotRecommendationStatus: ").append(getBotRecommendationStatus()).append(",");
        if (getBotRecommendationId() != null)
            sb.append("BotRecommendationId: ").append(getBotRecommendationId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getTranscriptSourceSetting() != null)
            sb.append("TranscriptSourceSetting: ").append(getTranscriptSourceSetting()).append(",");
        if (getEncryptionSetting() != null)
            sb.append("EncryptionSetting: ").append(getEncryptionSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBotRecommendationResult == false)
            return false;
        UpdateBotRecommendationResult other = (UpdateBotRecommendationResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getBotRecommendationStatus() == null ^ this.getBotRecommendationStatus() == null)
            return false;
        if (other.getBotRecommendationStatus() != null && other.getBotRecommendationStatus().equals(this.getBotRecommendationStatus()) == false)
            return false;
        if (other.getBotRecommendationId() == null ^ this.getBotRecommendationId() == null)
            return false;
        if (other.getBotRecommendationId() != null && other.getBotRecommendationId().equals(this.getBotRecommendationId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getTranscriptSourceSetting() == null ^ this.getTranscriptSourceSetting() == null)
            return false;
        if (other.getTranscriptSourceSetting() != null && other.getTranscriptSourceSetting().equals(this.getTranscriptSourceSetting()) == false)
            return false;
        if (other.getEncryptionSetting() == null ^ this.getEncryptionSetting() == null)
            return false;
        if (other.getEncryptionSetting() != null && other.getEncryptionSetting().equals(this.getEncryptionSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getBotRecommendationStatus() == null) ? 0 : getBotRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getBotRecommendationId() == null) ? 0 : getBotRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getTranscriptSourceSetting() == null) ? 0 : getTranscriptSourceSetting().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSetting() == null) ? 0 : getEncryptionSetting().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBotRecommendationResult clone() {
        try {
            return (UpdateBotRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
