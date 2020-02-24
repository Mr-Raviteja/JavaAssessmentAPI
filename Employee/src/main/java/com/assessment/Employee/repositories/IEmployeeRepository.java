package com.assessment.Employee.repositories;

import com.assessment.Employee.entities.EmployeeDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeDetailsEntity, Long> {
}
