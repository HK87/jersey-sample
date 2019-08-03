package com.hk87.jersey.sample.usecase.service;

import javax.ws.rs.BadRequestException;

public class EmployeeIdService implements EmployeeIdServiceInterface {
    public void checkFormat(String employeeId) {
        try {
            Integer.parseInt(employeeId);
        } catch (NumberFormatException e) {
            throw new BadRequestException("employeeId must be integer.");
        }
    }
}
