package com.hk87.jersey.sample.api;

import com.hk87.jersey.sample.business.controller.EmployeeControler;
import com.hk87.jersey.sample.business.controller.EmployeeControlerInterface;
import com.hk87.jersey.sample.usecase.factory.*;
import com.hk87.jersey.sample.usecase.repository.EmployeeRepositoryInterface;
import com.hk87.jersey.sample.usecase.repository.EmployeeRepositoryMock;
import com.hk87.jersey.sample.usecase.service.EmployeeIdService;
import com.hk87.jersey.sample.usecase.service.EmployeeIdServiceInterface;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class ApiConfig extends ResourceConfig {

    public ApiConfig() {
        packages(this.getClass().getPackage().getName());
        register(
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        // business
                        bind(EmployeeControler.class).to(EmployeeControlerInterface.class);

                        // usecase
                        bind(EmployeeFactory.class).to(EmployeeFactoryInterface.class);
                        bind(EmployeeIdFactory.class).to(EmployeeIdFactoryInterface.class);
                        bind(EmployeeNameFactory.class).to(EmployeeNameFactoryInterface.class);
                        bind(EmployeeIdService.class).to(EmployeeIdServiceInterface.class);
                        bind(EmployeeGetResponseFactory.class)
                                .to(EmployeeGetRespnseFactoryInterface.class);

                        // repository
                        bind(EmployeeRepositoryMock.class).to(EmployeeRepositoryInterface.class);
                    }
                });
    }
}
