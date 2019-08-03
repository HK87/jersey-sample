package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.EmployeeId;

public interface EmployeeIdFactoryInterface {
    EmployeeId createFrom(String employeeId);
}
