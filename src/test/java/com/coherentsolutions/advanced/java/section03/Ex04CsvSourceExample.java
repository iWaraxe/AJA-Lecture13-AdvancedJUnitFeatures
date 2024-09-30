// File: Ex04CsvSourceExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex04CsvSourceExample
 *
 * This class demonstrates the use of the @CsvSource annotation to provide
 * parameters in CSV format directly in the test method.
 */
public class Ex04CsvSourceExample {

    /**
     * Test method that runs once for each set of CSV values.
     *
     * The @CsvSource annotation provides multiple sets of parameters in CSV format.
     */
    @ParameterizedTest
    @CsvSource({
            "apple, 5",
            "banana, 6",
            "cherry, 6"
    })
    void testWithCsvSource(String fruit, int length) {
        // Test to ensure the string length matches the expected length
        assertEquals(length, fruit.length());
    }
}
