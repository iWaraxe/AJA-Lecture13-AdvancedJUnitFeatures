// File: Ex01DynamicTestExample.java
// Package: com.coherentsolutions.advanced.java.section04

package com.coherentsolutions.advanced.java.section04;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Ex01DynamicTestExample
 *
 * This class demonstrates generating dynamic tests based on a list of integers.
 * Each dynamic test checks whether a number is positive.
 */
public class Ex01DynamicTestExample {

    /**
     * TestFactory method that generates dynamic tests.
     *
     * @return a collection of DynamicTest objects.
     */
    @TestFactory
    Collection<DynamicTest> dynamicTestsForPositiveNumbers() {
        // Data set: list of numbers
        int[] numbers = {1, -2, 3, -4, 5};

        // Generating dynamic tests for each number
        return Arrays.stream(numbers)
                .mapToObj(number -> dynamicTest("Test if " + number + " is positive", () -> {
                    // Assert that the number is positive
                    assertTrue(number > 0, number + " should be positive");
                }))
                .collect(Collectors.toList());
    }
}
