package com.assessment.Employee.services;

import com.assessment.Employee.entities.EmployeeDetailsEntity;

import java.util.List;

public interface IEmployeeService {
    EmployeeDetailsEntity createEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity);

    EmployeeDetailsEntity updateEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) throws Exception;

    List<EmployeeDetailsEntity> getAllEmployeeDetailsEntity();

    EmployeeDetailsEntity getEmployeeDetailsEntityById(Long employeeDetailsEntityId) throws Exception;

    void deleteEmployeeDetailsEntity(Long empId) throws Exception;

}
