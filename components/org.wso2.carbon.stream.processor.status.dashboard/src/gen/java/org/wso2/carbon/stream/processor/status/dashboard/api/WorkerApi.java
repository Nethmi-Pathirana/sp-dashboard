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

import org.wso2.carbon.stream.processor.status.dashboard.factories.WorkerApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.stream.processor.status.dashboard.model.InlineResponse200;
import org.wso2.carbon.stream.processor.status.dashboard.model.Worker;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/worker")


@io.swagger.annotations.Api(description = "the worker API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2017-08-07T17:39:38.193Z")
public class WorkerApi  {
   private final WorkerApiService delegate = WorkerApiServiceFactory.getWorkerApi();

    @POST
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new worker", notes = "", response = InlineResponse200.class, tags={ "worker", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully added", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = InlineResponse200.class) })
    public Response addWorker(@ApiParam(value = "Worker object that needs to be added" ,required=true) Worker worker)
    throws NotFoundException {
        return delegate.addWorker(worker);
    }

    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a worker", notes = "", response = void.class, tags={ "worker", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Worker not found", response = void.class) })
    public Response deleteWorker(@ApiParam(value = "Worker id to delete",required=true) @PathParam("id") Long id)
    throws NotFoundException {
        return delegate.deleteWorker(id);
    }

    @GET
    @Path("/{id}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find worker by ID", notes = "Returns a single worker", response = InlineResponse200.class, tags={ "worker", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Worker not found", response = InlineResponse200.class) })
    public Response getWorkerById(@ApiParam(value = "ID of worker to return",required=true) @PathParam("id") Long id)
    throws NotFoundException {
        return delegate.getWorkerById(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing worker", notes = "", response = InlineResponse200.class, tags={ "worker", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully updated the worker", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Worker not found", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = InlineResponse200.class) })
    public Response updateWorker(@ApiParam(value = "ID of worker that needs to be updated",required=true) @PathParam("id") Long id,
                                 @ApiParam(value = "Worker object that needs to be updated" ,required=true) Worker worker)
            throws NotFoundException {
        return delegate.updateWorker(id,worker);
    }
}
