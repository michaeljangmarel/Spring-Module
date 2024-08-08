package org.example.webuiapp.service;

import lombok.RequiredArgsConstructor;
import org.example.webuiapp.entity.Customer;
import org.example.webuiapp.entity.Customers;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private RestTemplate restTemplate;
    private static final String BASE_URL = "http://localhost:8080/customers";

//    public CustomerService() {
//        restTemplate = new RestTemplate();
//    }

    public List<Customer> getCustomers() {
        ResponseEntity<Customers> response=restTemplate
                .getForEntity(BASE_URL+"/list-customers",
                Customers.class);
        if(response.getStatusCode().is2xxSuccessful()){
            return response.getBody().getCustomers();
        }
        else
            throw new RuntimeException("Customer list is empty");
    }
}
