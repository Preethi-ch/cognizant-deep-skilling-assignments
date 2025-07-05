package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Search by keyword 'ou':");
        List<Country> countries1 = countryService.searchCountries("ou");
        countries1.forEach(System.out::println);

        System.out.println("\nSearch by keyword 'ou' sorted:");
        List<Country> countries2 = countryService.searchCountriesSorted("ou");
        countries2.forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z':");
        List<Country> countries3 = countryService.getCountriesByStartingAlphabet("Z");
        countries3.forEach(System.out::println);
    }
}
