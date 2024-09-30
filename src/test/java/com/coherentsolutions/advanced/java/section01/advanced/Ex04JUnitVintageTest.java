// File: Ex04JUnitVintageExample.java
// Package: com.coherentsolutions.advanced.java.section01.advanced

package com.coherentsolutions.advanced.java.section01.advanced;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Ex04JUnitVintageTest
 *
 * This class demonstrates a JUnit 4 test that can be run on the JUnit 5 platform using the JUnit Vintage engine.
 */
public class Ex04JUnitVintageTest {

    /**
     * Test method to verify a simple condition.
     *
     * Uses JUnit 4's @Test annotation and assertTrue assertion.
     */
    @Test
    public void junit4TestExample() {
        // Asserting that the condition is true
        assertTrue("This test runs using JUnit Vintage on JUnit 5 platform", true);
    }
}
