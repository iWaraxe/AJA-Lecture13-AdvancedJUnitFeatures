// File: MigratedTest.java
// Package: com.coherentsolutions.advanced.java.section01

package com.coherentsolutions.advanced.java.section01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex02MigratedTest
 *
 * This class demonstrates the migration of a test class from JUnit 4 to JUnit 5.
 * It replaces JUnit 4 annotations with their JUnit 5 counterparts and updates assertions.
 */
public class Ex02MigratedTest {

    private int value;

    /**
     * Setup method to initialize the 'value' before each test.
     *
     * Replaces JUnit 4's @Before with JUnit 5's @BeforeEach.
     */
    @BeforeEach
    void setUp() {
        value = 5; // Initialize value before each test
    }

    /**
     * Teardown method to reset the 'value' after each test.
     *
     * Replaces JUnit 4's @After with JUnit 5's @AfterEach.
     */
    @AfterEach
    void tearDown() {
        value = 0; // Clean up after each test
    }

    /**
     * Test method to verify the initialization of 'value'.
     *
     * Uses JUnit 5's @Test annotation and assertEquals with a descriptive message.
     */
    @Test
    void testValue() {
        // Assert that value is correctly initialized
        assertEquals(5, value, "Value should be initialized to 5");
    }
}
