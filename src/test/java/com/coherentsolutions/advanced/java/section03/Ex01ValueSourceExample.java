// File: Ex01ValueSourceExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex01ValueSourceExample
 *
 * This class demonstrates the use of the @ValueSource annotation to provide
 * different parameter values for a single test method.
 */
public class Ex01ValueSourceExample {

    /**
     * Test method that runs multiple times with different string inputs.
     *
     * The @ValueSource annotation provides different values for each test run.
     */
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    void testWithStringValues(String fruit) {
        // Test to ensure the provided string is not empty
        assertTrue(fruit.length() > 0);
    }
}
