package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    public Country findCountryByCode(String code) throws CountryNotFoundException {
        return countryRepository.findById(code).orElseThrow(() ->
                new CountryNotFoundException("Country not found with code: " + code));
    }
}
