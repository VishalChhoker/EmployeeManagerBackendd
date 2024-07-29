package com.app.employeeManagement.controller;

import com.app.employeeManagement.dto.Employee;
import com.app.employeeManagement.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/api/create/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

    }

    @GetMapping("/api/get/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/api/get/employee/{email}")
    public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable(name = "email") String email){
        return ResponseEntity.ok(employeeService.getEmployeeByEmail(email));
    }
}
