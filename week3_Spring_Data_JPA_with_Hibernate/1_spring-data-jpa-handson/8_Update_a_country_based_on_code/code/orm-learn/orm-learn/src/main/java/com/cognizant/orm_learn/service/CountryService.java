package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Update country name by code
    @Transactional
    public void updateCountry(String code, String newName) throws CountryNotFoundException {
        Optional<Country> optionalCountry = countryRepository.findById(code);
        if (optionalCountry.isPresent()) {
            Country country = optionalCountry.get();
            country.setName(newName);
            countryRepository.save(country);
        } else {
            throw new CountryNotFoundException("Country with code " + code + " not found.");
        }
    }

    // Other existing methods (like findByCode, addCountry, etc.)
}
