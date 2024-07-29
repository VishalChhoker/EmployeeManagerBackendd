package com.app.employeeManagement.repository;

import com.app.employeeManagement.dto.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
    Boolean existsByEmail(String email);
    Vendor findByEmail(String email);
}
