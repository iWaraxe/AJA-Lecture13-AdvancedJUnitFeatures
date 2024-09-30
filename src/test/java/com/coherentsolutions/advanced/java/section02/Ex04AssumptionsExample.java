// File: Ex04AssumptionsExample.java
// Package: com.coherentsolutions.advanced.java.section02

package com.coherentsolutions.advanced.java.section02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex04AssumptionsExample
 *
 * Demonstrates the use of assumptions to conditionally skip tests.
 */
public class Ex04AssumptionsExample {

    /**
     * Test method that runs only if a certain system property is set.
     */
    @Test
    void testOnlyOnDevEnvironment() {
        assumeTrue("dev".equals(System.getProperty("env")), "Test skipped: Not in development environment");

        // Test logic that should only run in the development environment
        assertEquals(2, 1 + 1);
    }

    /**
     * Test method that runs only if the OS is not Windows.
     */
    @Test
    void testSkipOnWindows() {
        assumeFalse(System.getProperty("os.name").startsWith("Windows"), "Test skipped: Running on Windows");

        // Test logic that should not run on Windows
        assertTrue(5 > 3);
    }
}
