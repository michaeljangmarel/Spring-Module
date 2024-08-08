package org.example.webuiapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.webuiapp.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/web-ui")
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/")
    public String listCustomers(Model model) {
        model.addAttribute("customers",
                customerService.getCustomers());
        return "customers";
    }
}
