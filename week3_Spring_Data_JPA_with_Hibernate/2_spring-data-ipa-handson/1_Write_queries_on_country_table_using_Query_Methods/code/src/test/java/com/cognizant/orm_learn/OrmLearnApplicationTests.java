package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OrmLearnApplicationTests {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    void testFindByNameContainingIgnoreCase() {
        List<Country> countries = countryRepository.findByNameContainingIgnoreCase("ou");
        assertFalse(countries.isEmpty());
        countries.forEach(c -> System.out.println("Match: " + c));
    }

    @Test
    void testFindByNameContainingIgnoreCaseOrderByNameAsc() {
        List<Country> countries = countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou");
        assertFalse(countries.isEmpty());
        for (int i = 1; i < countries.size(); i++) {
            assertTrue(countries.get(i - 1).getName().compareToIgnoreCase(countries.get(i).getName()) <= 0);
        }
    }

    @Test
    void testFindByNameStartingWithIgnoreCase() {
        List<Country> countries = countryRepository.findByNameStartingWithIgnoreCase("Z");
        assertFalse(countries.isEmpty());
        countries.forEach(c -> assertTrue(c.getName().toLowerCase().startsWith("z")));
    }
}
