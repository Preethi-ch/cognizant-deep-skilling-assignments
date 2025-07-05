package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        CountryService countryService = context.getBean(CountryService.class);

        testAddCountry(countryService);
        testDeleteCountry(countryService);
    }

    private static void testAddCountry(CountryService countryService) {
        Country country = new Country();
        country.setCode("XY");
        country.setName("TestLand");
        countryService.addCountry(country);
        System.out.println("Country added: " + country.getName());
    }

    private static void testDeleteCountry(CountryService countryService) {
        countryService.deleteCountry("XY");
        System.out.println("Country with code XY deleted. Verify in DB.");
    }
}
