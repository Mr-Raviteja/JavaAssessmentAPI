package com.assessment.Employee.services;

import com.assessment.Employee.entities.EmployeeDetailsEntity;
import com.assessment.Employee.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepository iEmployeeRepository;


    @Override
    public EmployeeDetailsEntity createEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) {

        return iEmployeeRepository.save(employeeDetailsEntity);
    }

    @Override
    public EmployeeDetailsEntity updateEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) throws Exception {
        Optional<EmployeeDetailsEntity> employeeEntity = iEmployeeRepository.findById(employeeDetailsEntity.getEmpId());
        if (employeeEntity.isPresent()) {
            EmployeeDetailsEntity employeeDetailsEntity1 = employeeEntity.get();
            employeeDetailsEntity1.setFirstName(employeeDetailsEntity.getFirstName());
            employeeDetailsEntity1.setLastName(employeeDetailsEntity.getLastName());
            employeeDetailsEntity1.setMobile(employeeDetailsEntity.getMobile());
            employeeDetailsEntity1.setEmailAddress(employeeDetailsEntity.getEmailAddress());
            employeeDetailsEntity1.setCity(employeeDetailsEntity.getCity());
            employeeDetailsEntity1.setCountry(employeeDetailsEntity.getCountry());
            employeeDetailsEntity1.setPostCode(employeeDetailsEntity.getPostCode());
            iEmployeeRepository.save(employeeDetailsEntity1);
            return employeeDetailsEntity1;
        } else {
            throw new Exception("Record not found with id : " + employeeDetailsEntity.getEmpId());

        }

    }

    @Override
    public List<EmployeeDetailsEntity> getAllEmployeeDetailsEntity() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public EmployeeDetailsEntity getEmployeeDetailsEntityById(Long employeeDetailsEntityId) throws Exception {
        Optional<EmployeeDetailsEntity> employeeEntity = iEmployeeRepository.findById(employeeDetailsEntityId);
        if (employeeEntity.isPresent()) {
            return employeeEntity.get();
        } else {
            throw new Exception("Record not found with id : " + employeeDetailsEntityId);
        }
    }

    @Override
    public void deleteEmployeeDetailsEntity(Long empId) throws Exception {
        Optional<EmployeeDetailsEntity> employeeEntity = iEmployeeRepository.findById(empId);
        if (employeeEntity.isPresent()) {
            iEmployeeRepository.delete(employeeEntity.get());
        } else {
            throw new Exception("Record not found with id : " + empId);
        }
    }
}
