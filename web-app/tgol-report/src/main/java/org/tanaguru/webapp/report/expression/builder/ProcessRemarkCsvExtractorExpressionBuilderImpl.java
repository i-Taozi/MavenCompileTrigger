/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015 Tanaguru.org
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
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
package org.tanaguru.webapp.report.expression.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.tanaguru.webapp.report.expression.I18nExpression;
import org.tanaguru.webapp.report.expression.ProcessRemarkCsvExtractorExpression;
import org.tanaguru.webapp.report.expression.retriever.KeyRetriever;

/**
 *
 * @author jkowalczyk
 */
public class ProcessRemarkCsvExtractorExpressionBuilderImpl
        implements AbstractGenericCustomExpressionBuilder<ProcessRemarkCsvExtractorExpression> {

    private static final Logger logger = Logger.getLogger(ProcessRemarkCsvExtractorExpressionBuilderImpl.class);

    private final List<String> bundleNameList = new ArrayList<>();

    public List<String> getBundleNameList() {
        return bundleNameList;
    }

    public void setBundleNameList(List<String> bundleNameList) {
        this.bundleNameList.addAll(bundleNameList);
    }

    @Override
    public ProcessRemarkCsvExtractorExpression build(Locale locale) {
        return new ProcessRemarkCsvExtractorExpression(bundleNameList, locale);
    }

}
