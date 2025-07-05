package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Stock;
import com.cognizant.orm_learn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       
        Calendar cal = Calendar.getInstance();
        cal.set(2019, Calendar.JANUARY, 1);
        Date startDate = cal.getTime();
        cal.set(2019, Calendar.SEPTEMBER, 30);
        Date endDate = cal.getTime();

        System.out.println("Stocks for FB between Jan 1 and Sep 30, 2019:");
        List<Stock> list1 = stockRepository.findByStCodeAndStDateBetween("FB", startDate, endDate);
        list1.forEach(s -> System.out.println(s.getStCode() + " " + s.getStDate()));

       
        System.out.println("\nStocks with closing price > 1250:");
        List<Stock> list2 = stockRepository.findByStCloseGreaterThan(1250f);
        list2.forEach(s -> System.out.println(s.getStCode() + " " + s.getStClose()));

       
        System.out.println("\nTop 3 stocks by volume:");
        List<Stock> list3 = stockRepository.findTop3ByOrderByStVolumeDesc();
        list3.forEach(s -> System.out.println(s.getStCode() + " " + s.getStVolume()));

       
        System.out.println("\nNFLX stocks sorted by closing price ascending:");
        List<Stock> list4 = stockRepository.findByStCodeOrderByStCloseAsc("NFLX");
        list4.forEach(s -> System.out.println(s.getStCode() + " " + s.getStClose()));
    }
}
