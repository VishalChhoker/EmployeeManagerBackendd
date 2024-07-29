package com.app.employeeManagement.controller;

import com.app.employeeManagement.dto.Employee;
import com.app.employeeManagement.dto.Vendor;
import com.app.employeeManagement.service.EmployeeService;
import com.app.employeeManagement.service.VendorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class VendorController {

    private VendorService vendorService;

    @PostMapping("/api/create/vendor")
    public ResponseEntity<Vendor> createEmployee(@RequestBody Vendor vendor){
        return new ResponseEntity<>(vendorService.saveVendor(vendor), HttpStatus.CREATED);
    }

    @GetMapping("/api/get/vendor")
    public ResponseEntity<List<Vendor>> getAllVendors(){
        return ResponseEntity.ok(vendorService.getAllVendors());
    }

    @GetMapping("/api/get/vendor/{email}")
    public ResponseEntity<Vendor> getVendorByEmail(@PathVariable(name = "email") String email){
        return ResponseEntity.ok(vendorService.getVendorByEmail(email));
    }

}
