// File: Ex03MethodSourceExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex03MethodSourceExample
 *
 * This class demonstrates the use of the @MethodSource annotation to provide
 * parameters from a static method.
 */
public class Ex03MethodSourceExample {

    /**
     * Static method that provides a stream of integers to the parameterized test.
     *
     * @return a stream of integers
     */
    static Stream<Integer> numberProvider() {
        return Stream.of(1, 2, 3, 4, 5);
    }

    /**
     * Test method that runs once for each integer provided by the numberProvider method.
     *
     * The @MethodSource annotation fetches values from the static numberProvider method.
     */
    @ParameterizedTest
    @MethodSource("numberProvider")
    void testWithMethodSource(Integer number) {
        // Test to ensure the number is greater than 0
        assertTrue(number > 0);
    }
}
