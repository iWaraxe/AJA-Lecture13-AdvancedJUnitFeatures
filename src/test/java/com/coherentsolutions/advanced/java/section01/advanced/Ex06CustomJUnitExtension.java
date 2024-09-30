// File: Ex06CustomJUnitExtension.java
// Package: com.coherentsolutions.advanced.java.section01.advanced

package com.coherentsolutions.advanced.java.section01.advanced;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Ex06CustomJUnitExtension
 *
 * This class demonstrates the creation and usage of a custom JUnit 5 extension.
 * The custom extension initializes a resource before each test.
 */

/**
 * Custom extension that initializes a resource before each test.
 */
class ResourceInitializerExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        // Initialize a resource or perform setup before each test
        System.out.println("Custom Extension: Initializing resource for " + context.getDisplayName());
    }
}

/**
 * Test class that uses the custom extension.
 */
@ExtendWith(ResourceInitializerExtension.class)
public class Ex06CustomJUnitExtension {

    /**
     * Test method to verify that the resource is initialized.
     */
    @Test
    void testResourceInitialization() {
        String resource = "Initialized Resource";
        assertNotNull(resource, "Resource should be initialized by the custom extension");
    }
}
