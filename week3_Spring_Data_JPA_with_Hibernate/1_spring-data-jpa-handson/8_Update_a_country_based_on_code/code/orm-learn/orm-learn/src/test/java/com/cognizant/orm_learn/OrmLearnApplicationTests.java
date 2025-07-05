package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrmLearnApplicationTests {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryRepository countryRepository;

    @Test
    @Order(1)
    public void contextLoads() {
        Assertions.assertNotNull(countryService);
        Assertions.assertNotNull(countryRepository);
    }

    @Test
    @Order(2)
    public void testUpdateCountry() throws CountryNotFoundException {
        String code = "IN";
        String newName = "Bharat";

        Optional<Country> optional = countryRepository.findById(code);
        Assertions.assertTrue(optional.isPresent(), "Country with code 'IN' should exist before update");

     
        countryService.updateCountry(code, newName);

       
        Country updated = countryRepository.findById(code).orElseThrow();
        Assertions.assertEquals(newName, updated.getName(), "Country name should be updated to 'Bharat'");
    }
}
