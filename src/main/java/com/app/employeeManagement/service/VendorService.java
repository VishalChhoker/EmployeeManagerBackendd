package com.app.employeeManagement.service;

import com.app.employeeManagement.dto.Employee;
import com.app.employeeManagement.dto.Vendor;
import com.app.employeeManagement.repository.VendorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VendorService {
    private VendorRepository vendorRepository;

    public Vendor saveVendor(Vendor vendor) {
        // check existing email
        if(!vendorRepository.existsByEmail(vendor.getEmail())){
            return vendorRepository.save(vendor);
        }
        throw new RuntimeException("Email Already Exist");
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Vendor getVendorByEmail(String email) {
        return vendorRepository.findByEmail(email);
    }
}
