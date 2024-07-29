package com.app.employeeManagement.service;

import com.app.employeeManagement.dto.Employee;
import com.app.employeeManagement.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {


    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        // check if email exists
        if(!employeeRepository.existsByEmail(employee.getEmail())){
            return employeeRepository.save(employee);
        }

       throw new RuntimeException("Email Already Exist");
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
}
