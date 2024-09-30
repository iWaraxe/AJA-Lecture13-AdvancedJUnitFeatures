// File: Ex02TestInterfaceExample.java
// Package: com.coherentsolutions.advanced.java.section05

package com.coherentsolutions.advanced.java.section05;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex02TestInterfaceExample
 *
 * This example demonstrates the use of test interfaces with default methods to
 * share common test logic across multiple test classes.
 */
interface StackTest {

    /**
     * Abstract method to be implemented by test classes to provide the stack instance.
     *
     * @return the stack instance to be tested
     */
    Stack<Integer> getStack();

    /**
     * Default method that tests whether the stack is initially empty.
     */
    @Test
    default void stackShouldBeEmptyInitially() {
        Stack<Integer> stack = getStack();
        // Assert that the stack is empty at the start
        assertTrue(stack.isEmpty(), "Stack should be empty initially");
    }

    /**
     * Default method to test if pushing an element to the stack works correctly.
     */
    @Test
    default void pushingElementShouldAddToStack() {
        Stack<Integer> stack = getStack();
        stack.push(42);
        // Assert that the stack contains the element
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing");
        assertEquals(42, stack.peek(), "Top of the stack should be the pushed element");
    }
}

/**
 * Ex02TestInterfaceExample
 *
 * This class implements the StackTest interface to inherit common test behavior.
 */
public class Ex02TestInterfaceExample implements StackTest {

    @Override
    public Stack<Integer> getStack() {
        // Return a new instance of Stack for each test
        return new Stack<>();
    }
}
