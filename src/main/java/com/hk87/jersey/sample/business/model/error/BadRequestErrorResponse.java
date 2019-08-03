package com.hk87.jersey.sample.business.model.error;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

import javax.ws.rs.core.Response;

public class BadRequestErrorResponse extends CustomErrorResponse {

    private static final Response.Status STATUS = BAD_REQUEST;

    public BadRequestErrorResponse(String msg) {
        super(msg, STATUS);
    }
}
