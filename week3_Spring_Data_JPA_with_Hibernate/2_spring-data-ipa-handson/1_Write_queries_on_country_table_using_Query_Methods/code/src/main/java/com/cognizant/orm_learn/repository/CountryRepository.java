package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    
    List<Country> findByNameContainingIgnoreCase(String keyword);

   
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String keyword);

    List<Country> findByNameStartingWithIgnoreCase(String prefix);
}
