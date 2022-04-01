/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.query.optimizer.capabilities;

import java.util.HashMap;
import java.util.Map;

import org.teiid.core.TeiidComponentException;


/**
 */
public class FakeCapabilitiesFinder implements CapabilitiesFinder {

    private Map<String, SourceCapabilities> caps = new HashMap<String, SourceCapabilities>();

    /**
     *
     */
    public FakeCapabilitiesFinder() {
    }

    public void addCapabilities(String connBinding, SourceCapabilities sourceCaps) {
        caps.put(connBinding, sourceCaps);
    }

    /* (non-Javadoc)
     * @see com.metamatrix.query.optimizer.capabilities.CapabilitiesFinder#findCapabilities(java.lang.String)
     */
    public SourceCapabilities findCapabilities(String connectorBindingID) throws TeiidComponentException {
        return caps.get(connectorBindingID);
    }

    public String toString() {
        return caps.toString();
    }

    @Override
    public boolean isValid(String fullName) {
        return true;
    }

}
