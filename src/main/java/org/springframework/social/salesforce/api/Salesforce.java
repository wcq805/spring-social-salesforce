/**
 * Copyright (C) 2016 https://github.com/jottley/spring-social-salesforce
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.salesforce.api;

import org.codehaus.jackson.JsonNode;
import org.springframework.social.ApiBinding;

import java.util.List;

/**
 * Specifies operations performed on Salesforce.
 *
 * @author Umut Utkan
 */
public interface Salesforce extends ApiBinding {

    public ApiOperations apiOperations();

    public ChatterOperations chatterOperations();

    public QueryOperations queryOperations();

    public RecentOperations recentOperations();

    public SearchOperations searchOperations();

    public SObjectOperations sObjectsOperations();

    public <T> List<T> readList(JsonNode jsonNode, Class<T> type);

    public <T> T readObject(JsonNode jsonNode, Class<T> type);

    public String getBaseUrl();

    public String getInstanceUrl();

}
