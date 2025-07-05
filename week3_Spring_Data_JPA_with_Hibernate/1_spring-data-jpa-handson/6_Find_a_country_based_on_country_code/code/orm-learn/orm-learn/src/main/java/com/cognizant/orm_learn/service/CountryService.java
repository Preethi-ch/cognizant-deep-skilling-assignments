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

    private CountryRepository countryRepository;

    public CountryService(@Autowired CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Transactional
    public Country findCountryByCode( String code ) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(code);

        if(!result.isPresent())
            throw new CountryNotFoundException();

        return result.get();
    }
}