// File: Ex01AssertAllExample.java
// Package: com.coherentsolutions.advanced.java.section02

package com.coherentsolutions.advanced.java.section02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex01AssertAllExample
 *
 * Demonstrates the use of assertAll to group multiple assertions.
 */
public class Ex01AssertAllExample {

    /**
     * A simple User class to demonstrate assertions.
     */
    class User {
        String name;
        int age;
        String email;

        User(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }
    }

    /**
     * Test to validate the properties of a User object.
     */
    @Test
    void testUserProperties() {
        User user = new User("Alice", 30, "alice@example.com");

        assertAll("User Properties",
                () -> assertEquals("Alice", user.getName(), "Name should be Alice"),
                () -> assertEquals(30, user.getAge(), "Age should be 30"),
                () -> assertEquals("alice@example.com", user.getEmail(), "Email should be correct")
        );
    }
}
