// File: Ex05CsvFileSourceExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex05CsvFileSourceExample
 *
 * This class demonstrates the use of the @CsvFileSource annotation to provide
 * parameters from an external CSV file.
 */
public class Ex05CsvFileSourceExample {

    /**
     * Test method that runs once for each set of CSV values from an external file.
     *
     * The @CsvFileSource annotation provides multiple sets of parameters from a CSV file.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/fruits.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String fruit, int length) {
        // Test to ensure the string length matches the expected length
        assertEquals(length, fruit.length());
    }
}
