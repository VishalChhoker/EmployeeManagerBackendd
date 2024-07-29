package com.app.employeeManagement.repository;

import com.app.employeeManagement.dto.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email,Long> {
}
