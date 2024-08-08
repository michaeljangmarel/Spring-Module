package org.example.apibackendapp;

import lombok.RequiredArgsConstructor;
import org.example.apibackendapp.dao.CustomerDao;
import org.example.apibackendapp.entity.Customer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiBackendAppApplication {
    private final CustomerDao customerDao;

    @Bean @Profile("dev")
    public ApplicationRunner applicationRunner(){
        return args -> {
            List.of(
                    new Customer("John", "Doe","john@gmail.com","55-555-55"),
                    new Customer("John", "William","johnwilliam@gmail.com","55-555-56"),
                    new Customer("Thomas", "Hardy","thomashardy@gmail.com","55-555-57"),
                    new Customer("Charles", "Dickens","charles@gmail.com","55-555-58")
            ).forEach(customerDao::save);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiBackendAppApplication.class, args);
    }

}
