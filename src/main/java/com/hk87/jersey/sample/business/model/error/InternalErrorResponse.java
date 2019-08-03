package com.hk87.jersey.sample.business.model.error;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InternalErrorResponse extends CustomErrorResponse {

    private static final Response.Status STATUS = INTERNAL_SERVER_ERROR;
    private static final String MESSAGE = "Internal Error";

    public InternalErrorResponse() {
        super(MESSAGE, STATUS);
    }

    public InternalErrorResponse(String msg) {
        super(msg, STATUS);
    }
}
