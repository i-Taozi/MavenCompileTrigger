/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */
package org.tanaguru.rules.accessiweb21.handler.list;

import org.tanaguru.entity.audit.ProcessResult;
import org.tanaguru.processor.SSPHandler;
import org.tanaguru.ruleimplementation.AbstractPageRuleImplementation;

/**
 *
 * @author jkowalczyk
 */
public abstract class AbstractPageRuleListThemeImplementation
        extends AbstractPageRuleImplementation {

    protected ListRulesHandler listRulesHandler = new ListRulesHandler();

    public AbstractPageRuleListThemeImplementation() {
        super();
    }

    @Override
    protected ProcessResult processImpl(SSPHandler sspHandler) {
        ProcessResult processResult = null;
        listRulesHandler.setSSPHandler(sspHandler);
        listRulesHandler.setProcessRemarkService(
                sspHandler.getProcessRemarkService());
        return processResult;
    }

    protected void cleanUpRule(){
        listRulesHandler.setSSPHandler(null);
        listRulesHandler.setProcessRemarkService(null);
        listRulesHandler = null;
    }

}
