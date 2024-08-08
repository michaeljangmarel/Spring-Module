package org.example.webuiapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customers {

    private List<Customer> customers=
            new LinkedList<Customer>();

    public Customers(List<Customer> customers){
        this.customers = customers;
    }
}
