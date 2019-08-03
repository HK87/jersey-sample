package com.hk87.jersey.sample.usecase.repository;

import com.hk87.jersey.sample.model.Employee.EmployeeId;

public class EmployeeRepositoryMock implements EmployeeRepositoryInterface {

    public String getEmployeeNameFrom(EmployeeId employeeId) {
        return "Foo Bar";
    }
}
