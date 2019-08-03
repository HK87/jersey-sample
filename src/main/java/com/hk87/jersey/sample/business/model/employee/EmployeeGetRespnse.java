package com.hk87.jersey.sample.business.model.employee;

import java.util.List;

public class EmployeeGetRespnse {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
