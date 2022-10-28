package com.niit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci fibonacci;
    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fibonacciSeries() {
        int n = 0;
       // Assertions.assertEquals(0,fibonacci.fibonacciSeries());
        Assertions.assertEquals(13,fibonacci.fibonacciSeries(5));
    }
}
