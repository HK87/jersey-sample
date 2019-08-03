package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.business.model.employee.EmployeeGetRespnse;
import com.hk87.jersey.sample.model.Employee.Employee;
import java.util.List;

public interface EmployeeGetRespnseFactoryInterface {
    EmployeeGetRespnse createFrom(Employee employeeList);

    EmployeeGetRespnse createFrom(List<Employee> employeeList);
}
