package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.Employee;
import com.hk87.jersey.sample.model.Employee.EmployeeId;
import com.hk87.jersey.sample.model.Employee.EmployeeName;

public class EmployeeFactory implements EmployeeFactoryInterface {

    public Employee createFrom(EmployeeId employeeId, EmployeeName employeeName) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        return employee;
    }
}
