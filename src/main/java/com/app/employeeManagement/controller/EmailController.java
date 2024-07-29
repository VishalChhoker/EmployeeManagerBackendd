package com.app.employeeManagement.controller;

import com.app.employeeManagement.dto.Email;
import com.app.employeeManagement.dto.Employee;
import com.app.employeeManagement.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmailController {
    private EmailService emailService;

    @PostMapping("/api/send/email")
    public ResponseEntity<Email> sendEmail(@RequestBody Email email){
        return new ResponseEntity<>(emailService.sendEmail(email), HttpStatus.OK);

    }

    @GetMapping("/api/get/all/email")
    public ResponseEntity<List<Email>> getAllEmails(){
        return new ResponseEntity<>(emailService.getAllEmails(), HttpStatus.OK);

    }
}
