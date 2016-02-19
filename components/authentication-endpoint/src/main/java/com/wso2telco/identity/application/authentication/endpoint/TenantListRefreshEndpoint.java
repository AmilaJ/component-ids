/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.wso2telco.identity.application.authentication.endpoint;

import com.wso2telco.identity.application.authentication.endpoint.util.TenantDataManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TenantListRefreshEndpoint extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws
            AuthenticationException {
        String tenantList = req.getParameter("tenantList");
        if(tenantList != null) {
            TenantDataManager.setTenantDataList(tenantList);
        }
    }
}