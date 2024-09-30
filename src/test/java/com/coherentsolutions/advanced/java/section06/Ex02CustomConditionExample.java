// File: Ex02CustomConditionExample.java
// Package: com.coherentsolutions.advanced.java.section06

package com.coherentsolutions.advanced.java.section06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex02CustomConditionExample
 *
 * This class demonstrates custom conditions for enabling or disabling tests.
 */
public class Ex02CustomConditionExample {

    /**
     * Test that only runs if a specific system property is set.
     */
    @Test
    @EnabledIf("isDebugMode")
    void testOnlyInDebugMode() {
        System.out.println("Running in debug mode");
        assertTrue(true);
    }

    /**
     * Static method that determines whether to run the test based on a system property.
     *
     * @return true if the system property "debug" is set to "true"
     */
    static boolean isDebugMode() {
        return "true".equals(System.getProperty("debug"));
    }
}
