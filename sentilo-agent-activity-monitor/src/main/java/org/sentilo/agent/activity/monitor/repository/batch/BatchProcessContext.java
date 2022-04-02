/*
 * Sentilo
 *
 * Original version 1.4 Copyright (C) 2013 Institut Municipal d’Informàtica, Ajuntament de
 * Barcelona. Modified by Opentrends adding support for multitenant deployments and SaaS.
 * Modifications on version 1.5 Copyright (C) 2015 Opentrends Solucions i Sistemes, S.L.
 *
 *
 * This program is licensed and may be used, modified and redistributed under the terms of the
 * European Public License (EUPL), either version 1.1 or (at your option) any later version as soon
 * as they are approved by the European Commission.
 *
 * Alternatively, you may redistribute and/or modify this program under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the licenses for the specific language governing permissions, limitations and more details.
 *
 * You should have received a copy of the EUPL1.1 and the LGPLv3 licenses along with this program;
 * if not, you may find them at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl http://www.gnu.org/licenses/ and
 * https://www.gnu.org/licenses/lgpl.txt
 */
package org.sentilo.agent.activity.monitor.repository.batch;

import java.util.List;

import org.sentilo.common.domain.EventMessage;
import org.sentilo.common.rest.RESTClient;

public class BatchProcessContext {

  private final List<EventMessage> eventsToProcess;
  private final RESTClient restClient;
  private final int numMaxRetries;
  private final BatchProcessCallback callback;
  private final String esVersion;

  public BatchProcessContext(final List<EventMessage> eventsToProcess, final RESTClient restClient, final int numMaxRetries, final String esVersion,
      final BatchProcessCallback callback) {
    super();
    this.eventsToProcess = eventsToProcess;
    this.restClient = restClient;
    this.numMaxRetries = numMaxRetries;
    this.esVersion = esVersion;
    this.callback = callback;
  }

  public List<EventMessage> getEventsToProcess() {
    return eventsToProcess;
  }

  public RESTClient getRestClient() {
    return restClient;
  }

  public int getNumMaxRetries() {
    return numMaxRetries;
  }

  public BatchProcessCallback getCallback() {
    return callback;
  }

  public String getEsVersion() {
    return esVersion;
  }

}
