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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TestHypervisorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestHypervisorConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     */
    private String host;
    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway to the hypervisor to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestHypervisorConfigurationRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @return The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *         (FQDN).
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestHypervisorConfigurationRequest withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The password for the hypervisor.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @return The password for the hypervisor.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The password for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestHypervisorConfigurationRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The username for the hypervisor.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @return The username for the hypervisor.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The username for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestHypervisorConfigurationRequest withUsername(String username) {
        setUsername(username);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestHypervisorConfigurationRequest == false)
            return false;
        TestHypervisorConfigurationRequest other = (TestHypervisorConfigurationRequest) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public TestHypervisorConfigurationRequest clone() {
        return (TestHypervisorConfigurationRequest) super.clone();
    }

}
