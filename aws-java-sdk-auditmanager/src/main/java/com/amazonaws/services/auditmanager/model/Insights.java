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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the latest analytics data for all your active assessments.
 * </p>
 * <p>
 * This summary is a snapshot of the data that your active assessments collected on the <code>lastUpdated</code> date.
 * It’s important to understand that the following totals are daily counts based on this date — they aren’t a total sum
 * to date.
 * </p>
 * <p>
 * The <code>Insights</code> data is eventually consistent. This means that, when you read data from
 * <code>Insights</code>, the response might not instantly reflect the results of a recently completed write or update
 * operation. If you repeat your read request after a few hours, the response should return the latest data.
 * </p>
 * <note>
 * <p>
 * If you delete an assessment or change its status to inactive, <code>InsightsByAssessment</code> includes data for
 * that assessment as follows.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Inactive assessments</b> - If Audit Manager collected evidence for your assessment before you changed it inactive,
 * that evidence is included in the <code>InsightsByAssessment</code> counts for that day.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted assessments</b> - If Audit Manager collected evidence for your assessment before you deleted it, that
 * evidence isn't included in the <code>InsightsByAssessment</code> counts for that day.
 * </p>
 * </li>
 * </ul>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Insights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Insights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of active assessments in Audit Manager.
     * </p>
     */
    private Integer activeAssessmentsCount;
    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Fail</i>
     * ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     * </p>
     */
    private Integer noncompliantEvidenceCount;
    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Pass</i>
     * ruling, or collected from Config with a <i>Compliant</i> ruling.
     * </p>
     */
    private Integer compliantEvidenceCount;
    /**
     * <p>
     * The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated control
     * uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a
     * control uses a data source that doesn’t support compliance checks (for example: manual evidence, API calls, or
     * CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     * <code>Insights</code> data.
     * </p>
     * </note>
     */
    private Integer inconclusiveEvidenceCount;
    /**
     * <p>
     * The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code> date.
     * </p>
     */
    private Integer assessmentControlsCountByNoncompliantEvidence;
    /**
     * <p>
     * The total number of controls across all active assessments.
     * </p>
     */
    private Integer totalAssessmentControlsCount;
    /**
     * <p>
     * The time when the cross-assessment insights were last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The number of active assessments in Audit Manager.
     * </p>
     * 
     * @param activeAssessmentsCount
     *        The number of active assessments in Audit Manager.
     */

    public void setActiveAssessmentsCount(Integer activeAssessmentsCount) {
        this.activeAssessmentsCount = activeAssessmentsCount;
    }

    /**
     * <p>
     * The number of active assessments in Audit Manager.
     * </p>
     * 
     * @return The number of active assessments in Audit Manager.
     */

    public Integer getActiveAssessmentsCount() {
        return this.activeAssessmentsCount;
    }

    /**
     * <p>
     * The number of active assessments in Audit Manager.
     * </p>
     * 
     * @param activeAssessmentsCount
     *        The number of active assessments in Audit Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withActiveAssessmentsCount(Integer activeAssessmentsCount) {
        setActiveAssessmentsCount(activeAssessmentsCount);
        return this;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Fail</i>
     * ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @param noncompliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as non-compliant on the
     *        <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *        <i>Fail</i> ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     */

    public void setNoncompliantEvidenceCount(Integer noncompliantEvidenceCount) {
        this.noncompliantEvidenceCount = noncompliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Fail</i>
     * ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @return The number of compliance check evidence that Audit Manager classified as non-compliant on the
     *         <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *         <i>Fail</i> ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     */

    public Integer getNoncompliantEvidenceCount() {
        return this.noncompliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Fail</i>
     * ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @param noncompliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as non-compliant on the
     *        <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *        <i>Fail</i> ruling, or collected from Config with a <i>Non-compliant</i> ruling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withNoncompliantEvidenceCount(Integer noncompliantEvidenceCount) {
        setNoncompliantEvidenceCount(noncompliantEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Pass</i>
     * ruling, or collected from Config with a <i>Compliant</i> ruling.
     * </p>
     * 
     * @param compliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as compliant on the
     *        <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *        <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i> ruling.
     */

    public void setCompliantEvidenceCount(Integer compliantEvidenceCount) {
        this.compliantEvidenceCount = compliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Pass</i>
     * ruling, or collected from Config with a <i>Compliant</i> ruling.
     * </p>
     * 
     * @return The number of compliance check evidence that Audit Manager classified as compliant on the
     *         <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *         <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i> ruling.
     */

    public Integer getCompliantEvidenceCount() {
        return this.compliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant on the
     * <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a <i>Pass</i>
     * ruling, or collected from Config with a <i>Compliant</i> ruling.
     * </p>
     * 
     * @param compliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as compliant on the
     *        <code>lastUpdated</code> date. This includes evidence that was collected from Security Hub with a
     *        <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i> ruling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withCompliantEvidenceCount(Integer compliantEvidenceCount) {
        setCompliantEvidenceCount(compliantEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated control
     * uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a
     * control uses a data source that doesn’t support compliance checks (for example: manual evidence, API calls, or
     * CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     * <code>Insights</code> data.
     * </p>
     * </note>
     * 
     * @param inconclusiveEvidenceCount
     *        The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated
     *        control uses Security Hub or Config as a data source but you didn't enable those services. This is also
     *        the case when a control uses a data source that doesn’t support compliance checks (for example: manual
     *        evidence, API calls, or CloudTrail). </p> <note>
     *        <p>
     *        If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     *        <code>Insights</code> data.
     *        </p>
     */

    public void setInconclusiveEvidenceCount(Integer inconclusiveEvidenceCount) {
        this.inconclusiveEvidenceCount = inconclusiveEvidenceCount;
    }

    /**
     * <p>
     * The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated control
     * uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a
     * control uses a data source that doesn’t support compliance checks (for example: manual evidence, API calls, or
     * CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     * <code>Insights</code> data.
     * </p>
     * </note>
     * 
     * @return The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated
     *         control uses Security Hub or Config as a data source but you didn't enable those services. This is also
     *         the case when a control uses a data source that doesn’t support compliance checks (for example: manual
     *         evidence, API calls, or CloudTrail). </p> <note>
     *         <p>
     *         If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i>
     *         in <code>Insights</code> data.
     *         </p>
     */

    public Integer getInconclusiveEvidenceCount() {
        return this.inconclusiveEvidenceCount;
    }

    /**
     * <p>
     * The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated control
     * uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a
     * control uses a data source that doesn’t support compliance checks (for example: manual evidence, API calls, or
     * CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     * <code>Insights</code> data.
     * </p>
     * </note>
     * 
     * @param inconclusiveEvidenceCount
     *        The number of evidence without a compliance check ruling. Evidence is inconclusive when the associated
     *        control uses Security Hub or Config as a data source but you didn't enable those services. This is also
     *        the case when a control uses a data source that doesn’t support compliance checks (for example: manual
     *        evidence, API calls, or CloudTrail). </p> <note>
     *        <p>
     *        If evidence has a compliance check status of <i>not applicable</i>, it's classed as <i>inconclusive</i> in
     *        <code>Insights</code> data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withInconclusiveEvidenceCount(Integer inconclusiveEvidenceCount) {
        setInconclusiveEvidenceCount(inconclusiveEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code> date.
     * </p>
     * 
     * @param assessmentControlsCountByNoncompliantEvidence
     *        The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code>
     *        date.
     */

    public void setAssessmentControlsCountByNoncompliantEvidence(Integer assessmentControlsCountByNoncompliantEvidence) {
        this.assessmentControlsCountByNoncompliantEvidence = assessmentControlsCountByNoncompliantEvidence;
    }

    /**
     * <p>
     * The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code> date.
     * </p>
     * 
     * @return The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code>
     *         date.
     */

    public Integer getAssessmentControlsCountByNoncompliantEvidence() {
        return this.assessmentControlsCountByNoncompliantEvidence;
    }

    /**
     * <p>
     * The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code> date.
     * </p>
     * 
     * @param assessmentControlsCountByNoncompliantEvidence
     *        The number of assessment controls that collected non-compliant evidence on the <code>lastUpdated</code>
     *        date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withAssessmentControlsCountByNoncompliantEvidence(Integer assessmentControlsCountByNoncompliantEvidence) {
        setAssessmentControlsCountByNoncompliantEvidence(assessmentControlsCountByNoncompliantEvidence);
        return this;
    }

    /**
     * <p>
     * The total number of controls across all active assessments.
     * </p>
     * 
     * @param totalAssessmentControlsCount
     *        The total number of controls across all active assessments.
     */

    public void setTotalAssessmentControlsCount(Integer totalAssessmentControlsCount) {
        this.totalAssessmentControlsCount = totalAssessmentControlsCount;
    }

    /**
     * <p>
     * The total number of controls across all active assessments.
     * </p>
     * 
     * @return The total number of controls across all active assessments.
     */

    public Integer getTotalAssessmentControlsCount() {
        return this.totalAssessmentControlsCount;
    }

    /**
     * <p>
     * The total number of controls across all active assessments.
     * </p>
     * 
     * @param totalAssessmentControlsCount
     *        The total number of controls across all active assessments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withTotalAssessmentControlsCount(Integer totalAssessmentControlsCount) {
        setTotalAssessmentControlsCount(totalAssessmentControlsCount);
        return this;
    }

    /**
     * <p>
     * The time when the cross-assessment insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the cross-assessment insights were last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time when the cross-assessment insights were last updated.
     * </p>
     * 
     * @return The time when the cross-assessment insights were last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time when the cross-assessment insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the cross-assessment insights were last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insights withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getActiveAssessmentsCount() != null)
            sb.append("ActiveAssessmentsCount: ").append(getActiveAssessmentsCount()).append(",");
        if (getNoncompliantEvidenceCount() != null)
            sb.append("NoncompliantEvidenceCount: ").append(getNoncompliantEvidenceCount()).append(",");
        if (getCompliantEvidenceCount() != null)
            sb.append("CompliantEvidenceCount: ").append(getCompliantEvidenceCount()).append(",");
        if (getInconclusiveEvidenceCount() != null)
            sb.append("InconclusiveEvidenceCount: ").append(getInconclusiveEvidenceCount()).append(",");
        if (getAssessmentControlsCountByNoncompliantEvidence() != null)
            sb.append("AssessmentControlsCountByNoncompliantEvidence: ").append(getAssessmentControlsCountByNoncompliantEvidence()).append(",");
        if (getTotalAssessmentControlsCount() != null)
            sb.append("TotalAssessmentControlsCount: ").append(getTotalAssessmentControlsCount()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Insights == false)
            return false;
        Insights other = (Insights) obj;
        if (other.getActiveAssessmentsCount() == null ^ this.getActiveAssessmentsCount() == null)
            return false;
        if (other.getActiveAssessmentsCount() != null && other.getActiveAssessmentsCount().equals(this.getActiveAssessmentsCount()) == false)
            return false;
        if (other.getNoncompliantEvidenceCount() == null ^ this.getNoncompliantEvidenceCount() == null)
            return false;
        if (other.getNoncompliantEvidenceCount() != null && other.getNoncompliantEvidenceCount().equals(this.getNoncompliantEvidenceCount()) == false)
            return false;
        if (other.getCompliantEvidenceCount() == null ^ this.getCompliantEvidenceCount() == null)
            return false;
        if (other.getCompliantEvidenceCount() != null && other.getCompliantEvidenceCount().equals(this.getCompliantEvidenceCount()) == false)
            return false;
        if (other.getInconclusiveEvidenceCount() == null ^ this.getInconclusiveEvidenceCount() == null)
            return false;
        if (other.getInconclusiveEvidenceCount() != null && other.getInconclusiveEvidenceCount().equals(this.getInconclusiveEvidenceCount()) == false)
            return false;
        if (other.getAssessmentControlsCountByNoncompliantEvidence() == null ^ this.getAssessmentControlsCountByNoncompliantEvidence() == null)
            return false;
        if (other.getAssessmentControlsCountByNoncompliantEvidence() != null
                && other.getAssessmentControlsCountByNoncompliantEvidence().equals(this.getAssessmentControlsCountByNoncompliantEvidence()) == false)
            return false;
        if (other.getTotalAssessmentControlsCount() == null ^ this.getTotalAssessmentControlsCount() == null)
            return false;
        if (other.getTotalAssessmentControlsCount() != null && other.getTotalAssessmentControlsCount().equals(this.getTotalAssessmentControlsCount()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveAssessmentsCount() == null) ? 0 : getActiveAssessmentsCount().hashCode());
        hashCode = prime * hashCode + ((getNoncompliantEvidenceCount() == null) ? 0 : getNoncompliantEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantEvidenceCount() == null) ? 0 : getCompliantEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getInconclusiveEvidenceCount() == null) ? 0 : getInconclusiveEvidenceCount().hashCode());
        hashCode = prime * hashCode
                + ((getAssessmentControlsCountByNoncompliantEvidence() == null) ? 0 : getAssessmentControlsCountByNoncompliantEvidence().hashCode());
        hashCode = prime * hashCode + ((getTotalAssessmentControlsCount() == null) ? 0 : getTotalAssessmentControlsCount().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public Insights clone() {
        try {
            return (Insights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.InsightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
