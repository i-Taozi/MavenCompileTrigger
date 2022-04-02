/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2016  Tanaguru.org
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
package org.tanaguru.rules.rgaa32016;

import org.tanaguru.entity.audit.TestSolution;
import org.tanaguru.entity.audit.ProcessResult;
import org.tanaguru.rules.keystore.HtmlElementStore;
import org.tanaguru.rules.keystore.RemarkMessageStore;
import org.tanaguru.rules.rgaa32016.test.Rgaa32016RuleImplementationTestCase;

/**
 * Unit test class for the implementation of the rule 11-10-1 of the referential Rgaa 3-2016.
 *
 * @author
 */
public class Rgaa32016Rule111001Test extends Rgaa32016RuleImplementationTestCase {

    /**
     * Default constructor
     * @param testName
     */
    public Rgaa32016Rule111001Test (String testName){
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.tanaguru.rules.rgaa32016.Rgaa32016Rule111001");
    }

   @Override
    protected void setUpWebResourceMap() {
        addWebResource("Rgaa32016.Test.11.10.1-3NMI-01");
        addWebResource("Rgaa32016.Test.11.10.1-4NA-01");
    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------3NMI-01---------------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa32016.Test.11.10.1-3NMI-01");
        checkResultIsPreQualified(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.NEED_MORE_INFO,
                RemarkMessageStore.MANUAL_CHECK_ON_ELEMENTS_MSG,
                HtmlElementStore.FORM_ELEMENT,
                1);
               
        //----------------------------------------------------------------------
        //------------------------------4NA-01----------------------------------
        //----------------------------------------------------------------------
        checkResultIsNotApplicable(processPageTest("Rgaa32016.Test.11.10.1-4NA-01"));
    }
    
}