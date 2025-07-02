package com.example.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestExample {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 7, 12",
        "10, -2, 8",
        "0, 0, 0"
    })
    public void testAddParameterized(int a, int b, int expected) {
        assertEquals(expected, calculatorService.add(a, b));
    }
}
