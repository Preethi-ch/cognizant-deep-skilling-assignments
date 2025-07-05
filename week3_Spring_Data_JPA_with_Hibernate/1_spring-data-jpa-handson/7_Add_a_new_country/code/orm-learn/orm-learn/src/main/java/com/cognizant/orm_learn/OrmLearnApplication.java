package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.Country;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private Country countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    public void testAddCountry() throws CountryNotFoundException {
        System.out.println("Start testAddCountry");

        Country country = new Country();
        country.setCode("XY");
        country.setName("Xylon");

        countryService.addCountry(country);

        Country result = countryService.findCountryByCode("XY");
        System.out.println("Country added: " + result);

        System.out.println("End testAddCountry");
    }
}
