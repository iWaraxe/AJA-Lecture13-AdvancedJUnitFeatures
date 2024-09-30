// File: Ex01ConditionalExecutionExample.java
// Package: com.coherentsolutions.advanced.java.section06

package com.coherentsolutions.advanced.java.section06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex01ConditionalExecutionExample
 *
 * This class demonstrates conditional test execution based on the operating system.
 */
public class Ex01ConditionalExecutionExample {

    /**
     * Test that only runs on Windows.
     */
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnlyOnWindows() {
        System.out.println("Running on Windows");
        assertTrue(true);
    }

    /**
     * Test that only runs on Linux.
     */
    @Test
    @DisabledOnOs(OS.LINUX)
    void testNotOnLinux() {
        System.out.println("Disabled on Linux. Running on Windows and Mac");
        assertTrue(true);
    }

    /**
     * Test that does not run on macOS.
     */
    @Test
    @DisabledOnOs(OS.MAC)
    void testNotOnMac() {
        System.out.println("Not running on macOS");
        assertTrue(true);
    }
}
