package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.EmployeeName;

public interface EmployeeNameFactoryInterface {
    EmployeeName createFrom(String employeeName);
}
