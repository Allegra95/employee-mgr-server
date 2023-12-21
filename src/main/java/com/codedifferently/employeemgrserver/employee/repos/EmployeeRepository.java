package com.codedifferently.employeemgrserver.employee.repos;


import com.codedifferently.employeemgrserver.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}

