// File: Ex03CustomExtension.java
// Package: com.coherentsolutions.advanced.java.section07

package com.coherentsolutions.advanced.java.section07;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Ex03CustomExtension
 *
 * This class demonstrates a custom extension that logs messages before all tests
 * and after each test in a test class.
 */
public class Ex03CustomExtension implements BeforeAllCallback, AfterEachCallback {

    /**
     * Method that runs before all tests in a class.
     *
     * Logs a message before all tests start.
     */
    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println("Before all tests in class: " + context.getTestClass().orElse(null).getName());
    }

    /**
     * Method that runs after each test.
     *
     * Logs a message after each test method completes.
     */
    @Override
    public void afterEach(ExtensionContext context) {
        System.out.println("After test method: " + context.getTestMethod().orElse(null).getName());
    }
}
