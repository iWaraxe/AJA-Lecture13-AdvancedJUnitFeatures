// File: Ex02AvoidOverMockingExample.java
// Package: com.coherentsolutions.advanced.java.section09

package com.coherentsolutions.advanced.java.section09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex02AvoidOverMockingExample
 *
 * This class demonstrates avoiding the over-mocking anti-pattern.
 */
public class Ex02AvoidOverMockingExample {

    /**
     * Simple service that relies on a utility class.
     */
    static class MathService {
        int square(int input) {
            return Utility.square(input);
        }
    }

    /**
     * Simple utility class with static methods.
     */
    static class Utility {
        static int square(int input) {
            return input * input;
        }
    }

    MathService mathService = new MathService();

    /**
     * Test that avoids mocking the utility class unnecessarily.
     */
    @Test
    void testSquare() {
        // We test the actual behavior of the method rather than mocking the utility class.
        int result = mathService.square(4);
        assertEquals(16, result, "4 squared should equal 16");
    }
}
