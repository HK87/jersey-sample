package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.EmployeeId;

public class EmployeeIdFactory implements EmployeeIdFactoryInterface {

    public EmployeeId createFrom(String strEmployeeId) {
        EmployeeId employeeId = new EmployeeId();
        employeeId.setValue(strEmployeeId);
        return employeeId;
    }
}
