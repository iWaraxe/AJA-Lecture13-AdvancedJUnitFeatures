// File: Ex02MockingStaticFinalExample.java
// Package: com.coherentsolutions.advanced.java.section08

package com.coherentsolutions.advanced.java.section08;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex02MockingStaticFinalExample
 *
 * This class demonstrates how to mock static and final classes using Mockito.
 */
@ExtendWith(MockitoExtension.class)
public class Ex02MockingStaticFinalExample {

    /**
     * A utility class with a static method.
     */
    static class UtilityClass {
        static String getSystemMessage() {
            return "System Message";
        }
    }

    /**
     * Test method that mocks a static method using Mockito.
     */
    @Test
    void testMockStaticMethod() {
        try (MockedStatic<UtilityClass> mockedStatic = mockStatic(UtilityClass.class)) {
            // Define the behavior of the static method
            mockedStatic.when(UtilityClass::getSystemMessage).thenReturn("Mocked Message");

            // Call the static method
            String result = UtilityClass.getSystemMessage();

            // Verify the result
            assertEquals("Mocked Message", result);
        }
    }
}
