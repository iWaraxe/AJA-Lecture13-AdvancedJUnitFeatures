// File: Ex04CustomExtensionUsage.java
// Package: com.coherentsolutions.advanced.java.section07

package com.coherentsolutions.advanced.java.section07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex04CustomExtensionUsage
 *
 * This class demonstrates how to apply a custom extension to a test class using @ExtendWith.
 */
@ExtendWith(Ex03CustomExtension.class)
public class Ex04CustomExtensionUsage {

    /**
     * Simple test method to demonstrate custom extension behavior.
     */
    @Test
    void testMethodOne() {
        System.out.println("Executing test method one");
        assertTrue(true);
    }

    /**
     * Another test method to demonstrate custom extension behavior.
     */
    @Test
    void testMethodTwo() {
        System.out.println("Executing test method two");
        assertTrue(true);
    }
}
