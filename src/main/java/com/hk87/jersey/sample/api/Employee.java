package com.hk87.jersey.sample.api;

import com.hk87.jersey.sample.business.controller.EmployeeControlerInterface;
import com.hk87.jersey.sample.business.model.employee.EmployeeGetRequest;
import com.hk87.jersey.sample.business.model.employee.EmployeeGetRespnse;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/** 社員情報の参照クラス */
@Path("/employee")
public class Employee extends AbstractApi {

    @Inject EmployeeControlerInterface employeeControler;

    @GET
    @Path("{employeeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeGetRespnse get(@PathParam("employeeId") String employeeId) throws Exception {
        EmployeeGetRequest req = new EmployeeGetRequest();
        req.setEmployeeId(employeeId);
        logger.info("request: {}", convertToJsonFrom(req));
        EmployeeGetRespnse res = employeeControler.get(req);
        logger.info("error: {}", convertToJsonFrom(res));
        return res;
    }
}
