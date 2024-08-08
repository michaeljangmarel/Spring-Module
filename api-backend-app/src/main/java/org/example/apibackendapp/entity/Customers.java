package org.example.apibackendapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
public class Customers {
    private List<Customer> customers=
            new LinkedList<Customer>();

    public Customers(List<Customer> customers){
        this.customers = customers;
    }
}
