package com.cognizant.orm_learn;

import com.cognizant.orm_learn.dao.ProductDAO;
import com.cognizant.orm_learn.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

       
        Map<String, Object> filters = new HashMap<>();
        filters.put("cpu", "Intel");
        filters.put("ramSize", 8);
        filters.put("os", "Windows");
        filters.put("customerReview", 4);

        
        List<Product> results = dao.searchProducts(filters);

        
        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println(" Matching Products:");
            for (Product p : results) {
                System.out.println(p.getName() + " - " + p.getCpu() + " - " + p.getRamSize() + "GB RAM");
            }
        }
    }
}
