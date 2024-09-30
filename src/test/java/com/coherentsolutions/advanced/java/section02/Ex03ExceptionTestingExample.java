// File: Ex03ExceptionTestingExample.java
// Package: com.coherentsolutions.advanced.java.section02

package com.coherentsolutions.advanced.java.section02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex03ExceptionTestingExample
 *
 * Demonstrates exception testing using assertThrows.
 */
public class Ex03ExceptionTestingExample {

    /**
     * A simple method that throws an IllegalArgumentException for negative input.
     */
    int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Test method to verify that an exception is thrown for invalid input.
     */
    @Test
    void testExceptionThrown() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> divide(10, 0));

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
