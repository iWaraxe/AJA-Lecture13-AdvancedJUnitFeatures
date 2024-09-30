// File: Ex01TimeoutExample.java
// Package: com.coherentsolutions.advanced.java.section07

package com.coherentsolutions.advanced.java.section07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex01TimeoutExample
 *
 * This class demonstrates the use of the @Timeout annotation in JUnit 5.
 */
public class Ex01TimeoutExample {

    /**
     * Test that should complete within 500 milliseconds.
     */
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testWithTimeout() throws InterruptedException {
        // Simulate some processing with a sleep
        Thread.sleep(300);  // Adjust the value to test timeout behavior
        assertTrue(true);
    }

    /**
     * Test that intentionally fails due to exceeding the timeout.
     */
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testThatFailsDueToTimeout() throws InterruptedException {
        // Simulate a long operation that exceeds the timeout
        Thread.sleep(2000);  // This will exceed the timeout and cause the test to fail
        assertTrue(true);
    }
}
