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

import org.tanaguru.entity.audit.ProcessResult;
import org.tanaguru.entity.audit.TestSolution;
import org.tanaguru.rules.rgaa32016.test.Rgaa32016RuleImplementationTestCase;
import org.tanaguru.rules.keystore.HtmlElementStore;
import org.tanaguru.rules.keystore.RemarkMessageStore;

/**
 * Unit test class for the implementation of the rule 11-1-3 of the referential Rgaa 3-2016.
 *
 * @author jkowalczyk
 */
public class Rgaa32016Rule110105Test extends Rgaa32016RuleImplementationTestCase {

    /**
     * Default constructor
     * @param testName
     */
    public Rgaa32016Rule110105Test (String testName){
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName("org.tanaguru.rules.rgaa32016.Rgaa32016Rule110103");
    }

    @Override
    protected void setUpWebResourceMap() {
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A01");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A02");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A03");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A04");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A05");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A06");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A07");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A08");
        addWebResource("Rgaa32016.Test.11.01.03-1Passed-A09");
        addWebResource("Rgaa32016.Test.11.01.03-2Failed-A01");
        addWebResource("Rgaa32016.Test.11.01.03-2Failed-A02");
        addWebResource("Rgaa32016.Test.11.01.03-2Failed-A03");
        addWebResource("Rgaa32016.Test.11.01.03-2Failed-A04");
        addWebResource("Rgaa32016.Test.11.01.03-2Failed-5");
        addWebResource("Rgaa32016.Test.11.01.03-4NA-A01");

    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------1Passed-A01-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A01"),1);

        //----------------------------------------------------------------------
        //------------------------------1Passed-A02-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A02"),1);

        //----------------------------------------------------------------------
        //------------------------------1Passed-A03-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A03"),1);

        //----------------------------------------------------------------------
        //------------------------------1Passed-A04-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A04"),1);

        //----------------------------------------------------------------------
        //------------------------------1Passed-A05-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A05"),1);
        
        //----------------------------------------------------------------------
        //------------------------------1Passed-A06-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A06"),1);

        //----------------------------------------------------------------------
        //------------------------------1Passed-A07-----------------------------
        //----------------------------------------------------------------------
        checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A07"),1);
        //----------------------------------------------------------------------
        //------------------------------1Passed-A08-----------------------------
        //----------------------------------------------------------------------
       checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A08"),1);
        //----------------------------------------------------------------------
        //------------------------------1Passed-A09-----------------------------
        //----------------------------------------------------------------------
       checkResultIsPassed(processPageTest("Rgaa32016.Test.11.01.03-1Passed-A09"),1);

        //----------------------------------------------------------------------
        //------------------------------2Failed-A01-----------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa32016.Test.11.01.03-2Failed-A01");
        checkResultIsFailed(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG,
                HtmlElementStore.INPUT_ELEMENT,
                1);

        //----------------------------------------------------------------------
        //------------------------------2Failed-A02-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa32016.Test.11.01.03-2Failed-A02");
        checkResultIsFailed(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG,
                HtmlElementStore.INPUT_ELEMENT,
                1);

        //----------------------------------------------------------------------
        //------------------------------2Failed-A03-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa32016.Test.11.01.03-2Failed-A03");
        checkResultIsFailed(processResult, 1, 3);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG,
                HtmlElementStore.INPUT_ELEMENT,
                1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG,
                HtmlElementStore.SPAN_ELEMENT,
                2);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG,
                HtmlElementStore.SPAN_ELEMENT,
                3);

        //----------------------------------------------------------------------
        //------------------------------2Failed-A04-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa32016.Test.11.01.03-2Failed-A04");
        checkResultIsFailed(processResult, 2, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG,
                HtmlElementStore.INPUT_ELEMENT,
                1);

        //----------------------------------------------------------------------
        //------------------------------2Failed-A5-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa32016.Test.11.01.03-2Failed-5");
        checkResultIsFailed(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.ARIA_LABELLEDBY_EMPTY_MSG,
                HtmlElementStore.INPUT_ELEMENT,
                1);

        //----------------------------------------------------------------------
        //------------------------------4NA-A01---------------------------------
        //----------------------------------------------------------------------
        checkResultIsNotApplicable(processPageTest("Rgaa32016.Test.11.01.03-4NA-A01"));
    }

}
