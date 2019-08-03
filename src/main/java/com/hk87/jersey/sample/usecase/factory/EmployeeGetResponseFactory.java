package com.hk87.jersey.sample.usecase.factory;

import com.hk87.jersey.sample.business.model.employee.EmployeeGetRespnse;
import com.hk87.jersey.sample.model.Employee.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeGetResponseFactory implements EmployeeGetRespnseFactoryInterface {

    public EmployeeGetRespnse createFrom(Employee employee) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employee));
        return createFrom(employeeList);
    }

    public EmployeeGetRespnse createFrom(List<Employee> employeeList) {
        EmployeeGetRespnse res = new EmployeeGetRespnse();
        List<com.hk87.jersey.sample.business.model.employee.Employee> responseEmployeeList =
                new ArrayList<>();
        for (Employee employee : employeeList) {
            com.hk87.jersey.sample.business.model.employee.Employee responseEmployee =
                    new com.hk87.jersey.sample.business.model.employee.Employee();
            // 値設定
            responseEmployee.setEmployeeId(employee.getEmployeeId().getValue());
            responseEmployee.setEmployeeName(employee.getEmployeeName().getValue());

            responseEmployeeList.add(responseEmployee);
        }
        res.setEmployeeList(responseEmployeeList);
        return res;
    }
}
