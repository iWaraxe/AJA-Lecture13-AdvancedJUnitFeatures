// File: Ex01NestedTestExample.java
// Package: com.coherentsolutions.advanced.java.section05

package com.coherentsolutions.advanced.java.section05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex01NestedTestExample
 *
 * This class demonstrates the use of @Nested to organize tests hierarchically.
 */
public class Ex01NestedTestExample {

    Stack<Integer> stack;

    /**
     * Setup method for the outer class, initializing a new stack for each test.
     */
    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    /**
     * Nested class for tests related to an empty stack.
     */
    @Nested
    class WhenStackIsEmpty {

        @Test
        void stackShouldBeEmpty() {
            // Assert that the stack is initially empty
            assertTrue(stack.isEmpty(), "Stack should be empty");
        }

        @Test
        void poppingFromEmptyStackShouldThrowException() {
            // Assert that popping from an empty stack throws an exception
            assertThrows(Exception.class, stack::pop, "Should throw exception when popping empty stack");
        }
    }

    /**
     * Nested class for tests related to a stack with elements.
     */
    @Nested
    class WhenStackHasElements {

        @BeforeEach
        void addElements() {
            stack.push(42);
        }

        @Test
        void stackShouldNotBeEmpty() {
            // Assert that the stack is not empty
            assertFalse(stack.isEmpty(), "Stack should not be empty");
        }

        @Test
        void poppingShouldReturnElement() {
            // Assert that popping returns the element
            assertEquals(42, stack.pop(), "Popping should return the pushed element");
        }
    }
}
