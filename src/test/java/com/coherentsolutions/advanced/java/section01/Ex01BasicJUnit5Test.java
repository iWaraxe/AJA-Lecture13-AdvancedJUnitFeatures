// File: BasicJUnit5Test.java
// Package: com.coherentsolutions.advanced.java.section01

package com.coherentsolutions.advanced.java.section01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex01BasicJUnit5Test
 *
 * This class demonstrates a basic JUnit 5 test case.
 * It includes a simple test method that verifies the addition of two integers.
 */
public class Ex01BasicJUnit5Test {

    /**
     * Test method to verify the addition of two integers.
     *
     * This test uses the @Test annotation from JUnit Jupiter to indicate a test method.
     * The assertEquals assertion checks if the sum of 2 and 3 equals 5.
     */
    @Test
    void additionTest() {
        int sum = 2 + 3;
        // Asserting that the sum of 2 and 3 is 5
        assertEquals(5, sum, "2 + 3 should equal 5");
    }
}
