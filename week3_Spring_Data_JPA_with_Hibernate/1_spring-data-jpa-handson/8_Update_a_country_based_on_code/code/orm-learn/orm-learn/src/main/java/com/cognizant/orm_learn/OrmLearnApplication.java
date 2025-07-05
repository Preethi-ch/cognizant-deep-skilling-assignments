package com.cognizant.orm_learn;

import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testUpdateCountry();
    }

    void testUpdateCountry() {
        try {
            System.out.println("Updating country with code 'IN'...");
            countryService.updateCountry("IN", "Bharat");
            System.out.println("Country updated successfully.");
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
