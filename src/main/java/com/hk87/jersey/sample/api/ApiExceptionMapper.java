package com.hk87.jersey.sample.api;

import com.hk87.jersey.sample.business.model.error.BadRequestErrorResponse;
import com.hk87.jersey.sample.business.model.error.InternalErrorResponse;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ApiExceptionMapper implements ExceptionMapper<Throwable> {
    public Response toResponse(Throwable ex) {
        if (ex instanceof BadRequestException) {
            BadRequestErrorResponse error = new BadRequestErrorResponse(ex.getMessage());
            return Response.status(error.getStatus()).entity(error).build();
        } else if (ex instanceof InternalError) {
            InternalErrorResponse error;
            if (ex.getMessage() == null) {
                error = new InternalErrorResponse();
            } else {
                error = new InternalErrorResponse(ex.getMessage());
            }
            return Response.status(error.getStatus()).entity(error).build();
        } else {
            InternalErrorResponse error = new InternalErrorResponse();
            return Response.status(error.getStatus()).entity(error).build();
        }
    }
}
