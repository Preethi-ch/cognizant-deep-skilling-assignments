package com.example.service;

import org.springframework.stereotype.Service; // ✅ THIS IS MISSING

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
}
