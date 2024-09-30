// File: Ex01EffectiveTestExample.java
// Package: com.coherentsolutions.advanced.java.section09

package com.coherentsolutions.advanced.java.section09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex01EffectiveTestExample
 *
 * This class demonstrates how to write clear and maintainable tests.
 */
public class Ex01EffectiveTestExample {

    /**
     * This is a simple calculator class.
     */
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int subtract(int a, int b) {
            return a - b;
        }
    }

    Calculator calculator = new Calculator();

    /**
     * Test for the add method.
     */
    @Test
    void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    /**
     * Test for the subtract method.
     */
    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should equal 5");
    }
}
