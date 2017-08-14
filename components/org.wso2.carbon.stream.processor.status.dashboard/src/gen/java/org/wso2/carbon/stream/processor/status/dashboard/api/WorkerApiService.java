/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.stream.processor.status.dashboard.api;

import org.wso2.carbon.stream.processor.status.dashboard.model.Worker;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2017-08-07T17:39:38.193Z")
public abstract class WorkerApiService {
    public abstract Response addWorker(Worker worker) throws NotFoundException;
    public abstract Response deleteWorker(Long id) throws NotFoundException;
    public abstract Response getWorkerById(Long id) throws NotFoundException;
    public abstract Response updateWorker(Long id,Worker worker) throws NotFoundException;
}
