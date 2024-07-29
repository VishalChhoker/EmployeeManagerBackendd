package com.app.employeeManagement.repository;

import com.app.employeeManagement.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Boolean existsByEmail(String email);
    Employee findByEmail(String email);
}
