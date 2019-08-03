package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.Employee;
import com.hk87.jersey.sample.model.Employee.EmployeeId;
import com.hk87.jersey.sample.model.Employee.EmployeeName;

public interface EmployeeFactoryInterface {
    Employee createFrom(EmployeeId employeeId, EmployeeName employeeName);
}
