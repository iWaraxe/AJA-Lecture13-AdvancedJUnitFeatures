// File: Ex02RepeatedTestExample.java
// Package: com.coherentsolutions.advanced.java.section07

package com.coherentsolutions.advanced.java.section07;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex02RepeatedTestExample
 *
 * This class demonstrates the use of the @RepeatedTest annotation in JUnit 5.
 */
public class Ex02RepeatedTestExample {

    /**
     * Test that runs 5 times.
     *
     * Each repetition prints the repetition number.
     */
    @RepeatedTest(5)
    void testRepeatedFiveTimes() {
        System.out.println("Running repeated test");
        assertTrue(true);  // The actual test logic remains the same for all repetitions
    }
}
