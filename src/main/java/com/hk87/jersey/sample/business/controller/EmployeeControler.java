package com.hk87.jersey.sample.business.controller;

import com.hk87.jersey.sample.business.model.employee.EmployeeGetRequest;
import com.hk87.jersey.sample.business.model.employee.EmployeeGetRespnse;
import com.hk87.jersey.sample.model.Employee.Employee;
import com.hk87.jersey.sample.model.Employee.EmployeeId;
import com.hk87.jersey.sample.model.Employee.EmployeeName;
import com.hk87.jersey.sample.usecase.factory.EmployeeFactoryInterface;
import com.hk87.jersey.sample.usecase.factory.EmployeeGetRespnseFactoryInterface;
import com.hk87.jersey.sample.usecase.factory.EmployeeIdFactoryInterface;
import com.hk87.jersey.sample.usecase.factory.EmployeeNameFactoryInterface;
import com.hk87.jersey.sample.usecase.repository.EmployeeRepositoryInterface;
import com.hk87.jersey.sample.usecase.service.EmployeeIdServiceInterface;
import javax.inject.Inject;

public class EmployeeControler implements EmployeeControlerInterface {

    @Inject private EmployeeFactoryInterface employeeFactory;

    @Inject private EmployeeIdFactoryInterface employeeIdFactory;

    @Inject private EmployeeNameFactoryInterface employeeNameFactory;

    @Inject private EmployeeGetRespnseFactoryInterface employeeGetRespnseFactory;

    @Inject private EmployeeRepositoryInterface employeeRepository;

    @Inject private EmployeeIdServiceInterface employeeIdService;

    public EmployeeGetRespnse get(EmployeeGetRequest req) {
        String strEmployeeId = req.getEmployeeId();
        employeeIdService.checkFormat(strEmployeeId);
        EmployeeId employeeId = employeeIdFactory.createFrom(strEmployeeId);
        EmployeeName employeeName =
                employeeNameFactory.createFrom(employeeRepository.getEmployeeNameFrom(employeeId));
        Employee employee = employeeFactory.createFrom(employeeId, employeeName);
        return employeeGetRespnseFactory.createFrom(employee);
    }
}
