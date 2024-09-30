// File: Ex02DynamicTestDataDrivenExample.java
// Package: com.coherentsolutions.advanced.java.section04

package com.coherentsolutions.advanced.java.section04;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Ex02DynamicTestDataDrivenExample
 *
 * This class demonstrates data-driven testing using dynamic tests.
 * Dynamic tests are created to validate usernames based on predefined conditions.
 */
public class Ex02DynamicTestDataDrivenExample {

    /**
     * TestFactory method that generates dynamic tests for validating usernames.
     *
     * @return a stream of DynamicTest objects.
     */
    @TestFactory
    Stream<DynamicTest> dynamicTestsForUsernames() {
        // Data set: list of usernames to be validated
        List<String> usernames = Arrays.asList("alice", "bob123", "charlie99", "", "d");

        // Generating dynamic tests for each username
        return usernames.stream()
                .map(username -> dynamicTest("Testing username: " + username, () -> {
                    // Assert that the username is not empty
                    assertTrue(!username.isEmpty(), "Username should not be empty");

                    // Assert that the username has at least 3 characters
                    assertTrue(username.length() >= 3, "Username should have at least 3 characters");
                }));
    }
}
