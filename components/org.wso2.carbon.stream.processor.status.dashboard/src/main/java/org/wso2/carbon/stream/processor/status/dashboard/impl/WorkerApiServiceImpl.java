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

package org.wso2.carbon.stream.processor.status.dashboard.impl;

import org.wso2.carbon.stream.processor.status.dashboard.api.*;

import org.wso2.carbon.stream.processor.status.dashboard.model.Worker;

import org.wso2.carbon.stream.processor.status.dashboard.api.NotFoundException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2017-08-07T17:39:38.193Z")
public class WorkerApiServiceImpl extends WorkerApiService {

    Map<String,Worker> workerMap = new ConcurrentHashMap<>();

    @Override
    public Response addWorker(Worker worker) throws NotFoundException {
        // do some magic!
        Worker w = new Worker();
        w.setId(worker.getId());
        w.setUsername(worker.getUsername());
        w.setPassword(worker.getPassword());
        w.setUrl(worker.getUrl());
        workerMap.put(w.getId().toString(),w);
        return Response.ok().entity(w).type(MediaType.APPLICATION_JSON).build();
    }

    @Override
    public Response deleteWorker(Long id) throws NotFoundException {
        // do some magic!
        if(workerMap.get(id.toString())!=null){
            workerMap.remove(id);
            return Response.status(Response.Status.ACCEPTED).entity(id).type(MediaType.APPLICATION_JSON).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).entity(id).type(MediaType.APPLICATION_JSON).build();
        }
    }

    @Override
    public Response getWorkerById(Long id) throws NotFoundException {
        // do some magic!
        if(workerMap.get(id.toString())!=null){
            return Response.ok().entity(workerMap.get(id.toString())).type(MediaType.APPLICATION_JSON).build();
        }
        else {
            return Response.status(Response.Status.NOT_FOUND).entity(id).type(MediaType.APPLICATION_JSON).build();
        }
    }

    @Override
    public Response updateWorker(Long id, Worker worker) throws NotFoundException {
        // do some magic!
        Worker w = workerMap.get(worker.getId().toString());
        w.setId(worker.getId());
        w.setUsername(worker.getUsername());
        w.setPassword(worker.getPassword());
        w.setUrl(worker.getUrl());
        workerMap.put(w.getId().toString(),w);
        return Response.ok().entity(w).type(MediaType.APPLICATION_JSON).build();
    }
}
