// File: Ex03TaggingExample.java
// Package: com.coherentsolutions.advanced.java.section06

package com.coherentsolutions.advanced.java.section06;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex03TaggingExample
 *
 * This class demonstrates the use of @Tag for grouping and filtering tests.
 */
public class Ex03TaggingExample {

    /**
     * Test tagged as "fast".
     */
    @Test
    @Tag("fast")
    void fastTest() {
        System.out.println("Fast test running");
        assertTrue(true);
    }

    /**
     * Test tagged as "slow".
     */
    @Test
    @Tag("slow")
    void slowTest() {
        System.out.println("Slow test running");
        assertTrue(true);
    }

    /**
     * Test tagged as "integration".
     */
    @Test
    @Tag("integration")
    void integrationTest() {
        System.out.println("Integration test running");
        assertTrue(true);
    }
}
