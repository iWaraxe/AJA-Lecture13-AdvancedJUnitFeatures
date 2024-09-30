// File: Ex05JUnitJupiterAdvancedFeatures.java
// Package: com.coherentsolutions.advanced.java.section01.advanced

package com.coherentsolutions.advanced.java.section01.advanced;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex05JUnitJupiterAdvancedFeatures
 *
 * This class demonstrates advanced JUnit Jupiter features such as @DisplayName, @Nested, and @Tag.
 */
@DisplayName("JUnit Jupiter Advanced Features Test Suite")
public class Ex05JUnitJupiterAdvancedFeatures {

    /**
     * Nested test class to group related tests.
     *
     * The @Nested annotation allows for hierarchical grouping of test cases.
     */
    @Nested
    @DisplayName("Nested Test Group")
    @Tag("nested")
    class NestedTests {

        /**
         * Test method to verify string concatenation.
         *
         * Uses @DisplayName for a descriptive test name.
         */
        @Test
        @DisplayName("Test String Concatenation")
        void testStringConcatenation() {
            String hello = "Hello, ";
            String world = "World!";
            String result = hello + world;
            assertEquals("Hello, World!", result, "Strings should concatenate to 'Hello, World!'");
        }

        /**
         * Test method to verify multiplication.
         *
         * Tagged as "math" for selective test execution.
         */
        @Test
        @Tag("math")
        void testMultiplication() {
            int product = 4 * 5;
            assertEquals(20, product, "4 multiplied by 5 should equal 20");
        }
    }

    /**
     * Another nested test class to demonstrate multiple levels of nesting.
     */
    @Nested
    @DisplayName("Another Nested Test Group")
    @Tag("additional")
    class AnotherNestedTests {

        /**
         * Test method to verify subtraction.
         */
        @Test
        @DisplayName("Test Subtraction")
        void testSubtraction() {
            int difference = 10 - 3;
            assertEquals(7, difference, "10 minus 3 should equal 7");
        }
    }
}
