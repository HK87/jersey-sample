package com.hk87.jersey.sample.usecase.repository;

import com.hk87.jersey.sample.model.Employee.EmployeeId;

public interface EmployeeRepositoryInterface {
    public String getEmployeeNameFrom(EmployeeId employeeId);
}
