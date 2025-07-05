package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        System.out.println("Inside main");
        testGetAllCountries(context); 
    }

    public static void testGetAllCountries(ApplicationContext context) {
        System.out.println("Start");

        CountryService countryService = context.getBean(CountryService.class);
        List<Country> countries = countryService.getAllCountries();

        for (Country country : countries) {
            System.out.println(country.getCode() + " - " + country.getName());
        }

        System.out.println("End");
    }
}
