package org.example.apibackendapp.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.apibackendapp.entity.Customers;
import org.example.apibackendapp.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/list-customers")
    public Customers listCustomers() {
        return customerService.listCustomers();
    }
}
