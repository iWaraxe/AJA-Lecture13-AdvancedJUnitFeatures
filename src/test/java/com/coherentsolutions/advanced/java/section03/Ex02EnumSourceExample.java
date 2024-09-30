// File: Ex02EnumSourceExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex02EnumSourceExample
 *
 * This class demonstrates the use of the @EnumSource annotation to provide
 * enum constants as parameters to a test method.
 */
public class Ex02EnumSourceExample {

    /**
     * Simple enum representing days of the week.
     */
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * Test method that runs once for each enum constant in the Day enum.
     *
     * The @EnumSource annotation provides each enum constant as a parameter.
     */
    @ParameterizedTest
    @EnumSource(Day.class)
    void testWithEnumValues(Day day) {
        // Test to ensure the enum value is not null
        assertTrue(day != null);
    }
}
