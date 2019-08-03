package com.hk87.jersey.sample.business.controller;

import com.hk87.jersey.sample.business.model.employee.EmployeeGetRequest;
import com.hk87.jersey.sample.business.model.employee.EmployeeGetRespnse;

public interface EmployeeControlerInterface {

    public EmployeeGetRespnse get(EmployeeGetRequest req);
}
