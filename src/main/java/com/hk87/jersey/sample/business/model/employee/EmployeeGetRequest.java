package com.hk87.jersey.sample.business.model.employee;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployeeGetRequest")
public class EmployeeGetRequest {

    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
