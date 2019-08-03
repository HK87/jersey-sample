package com.hk87.jersey.sample.business.model.error;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlTransient;

public class CustomErrorResponse {

    protected String message;

    @XmlTransient protected Response.Status status;

    public CustomErrorResponse(String message, Response.Status status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response.Status getStatus() {
        return status;
    }

    public void setStatus(Response.Status status) {
        this.status = status;
    }
}
