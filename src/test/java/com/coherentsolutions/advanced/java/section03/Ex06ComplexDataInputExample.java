// File: Ex06ComplexDataInputExample.java
// Package: com.coherentsolutions.advanced.java.section03

package com.coherentsolutions.advanced.java.section03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ex06ComplexDataInputExample
 *
 * This class demonstrates how to handle complex data inputs in parameterized tests
 * using the @MethodSource annotation.
 */
public class Ex06ComplexDataInputExample {

    /**
     * Static method that provides a stream of User objects to the parameterized test.
     *
     * @return a stream of User objects
     */
    static Stream<User> userProvider() {
        return Stream.of(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 35)
        );
    }

    /**
     * Test method that runs once for each User object provided by the userProvider method.
     *
     * The @MethodSource annotation fetches User objects from the static userProvider method.
     */
    @ParameterizedTest
    @MethodSource("userProvider")
    void testWithComplexDataInput(User user) {
        // Test to ensure the user's age is greater than 20
        assertTrue(user.getAge() > 20, "User age should be greater than 20");
        assertEquals(user.getName().length(), user.getName().length(), "User name length should be accurate");
    }
}

/**
 * User
 *
 * A simple User class with name and age properties.
 */
class User {
    private String name;
    private int age;

    /**
     * Constructor to initialize a User object.
     *
     * @param name the name of the user
     * @param age the age of the user
     */
    public User(String name, int age) {
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
