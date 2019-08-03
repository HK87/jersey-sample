package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.model.Employee.EmployeeName;

public class EmployeeNameFactory implements EmployeeNameFactoryInterface {

    public EmployeeName createFrom(String strEmployeeName) {
        EmployeeName employeeName = new EmployeeName();
        employeeName.setValue(strEmployeeName);
        return employeeName;
    }
}
