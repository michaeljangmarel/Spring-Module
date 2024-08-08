package org.example.apibackendapp.service;

import lombok.RequiredArgsConstructor;
import org.example.apibackendapp.dao.CustomerDao;
import org.example.apibackendapp.entity.Customers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerDao customerDao;

    public Customers listCustomers() {
        return new Customers(customerDao.findAll());
    }


}
