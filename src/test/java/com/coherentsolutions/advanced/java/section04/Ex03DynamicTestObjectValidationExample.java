// File: Ex03DynamicTestObjectValidationExample.java
// Package: com.coherentsolutions.advanced.java.section04

package com.coherentsolutions.advanced.java.section04;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Ex03DynamicTestObjectValidationExample
 *
 * This class demonstrates the creation of dynamic tests for validating
 * User objects' properties.
 */
public class Ex03DynamicTestObjectValidationExample {

    // Sample User class
    static class User {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * TestFactory method that generates dynamic tests for validating User objects.
     *
     * @return a collection of DynamicTest objects.
     */
    @TestFactory
    Collection<DynamicTest> dynamicTestsForUserObjects() {
        // Data set: list of User objects
        User[] users = {
                new User("Alice", 30),
                new User("Bob", 17),
                new User("Charlie", 22)
        };

        // Generating dynamic tests for each User object
        return Arrays.asList(
                dynamicTest("Test User: Alice", () -> {
                    assertTrue(users[0].getAge() > 18, "User Alice should be over 18");
                }),
                dynamicTest("Test User: Bob", () -> {
                    assertTrue(users[1].getAge() > 18, "User Bob should be over 18");
                }),
                dynamicTest("Test User: Charlie", () -> {
                    assertTrue(users[2].getAge() > 18, "User Charlie should be over 18");
                })
        );
    }
}
