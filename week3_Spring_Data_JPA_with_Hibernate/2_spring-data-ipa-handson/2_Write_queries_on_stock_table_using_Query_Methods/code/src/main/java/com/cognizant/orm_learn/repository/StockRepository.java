package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByStCodeAndStDateBetween(String code, Date startDate, Date endDate);

    List<Stock> findByStCloseGreaterThan(float price);

    List<Stock> findTop3ByOrderByStVolumeDesc();

    List<Stock> findByStCodeOrderByStCloseAsc(String code);
}
