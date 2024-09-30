// File: Ex01BasicMockitoExample.java
// Package: com.coherentsolutions.advanced.java.section08

package com.coherentsolutions.advanced.java.section08;

import com.coherentsolutions.advanced.java.section08.utils.UserController;
import com.coherentsolutions.advanced.java.section08.utils.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Ex01BasicMockitoExample
 *
 * This class demonstrates basic Mockito setup and usage in JUnit 5.
 */
@ExtendWith(MockitoExtension.class)
public class Ex01BasicMockitoExample {

    @Mock
    UserService userService; // Mock the UserService

    @InjectMocks
    UserController userController; // Inject the mock into the UserController

    /**
     * Test method that mocks the behavior of the UserService.
     */
    @Test
    void testFindUser() {
        // Mock the behavior of getUserById
        when(userService.getUserById(1)).thenReturn("Alice");

        // Call the method under test
        String result = userController.findUser(1);

        // Verify that the mock method was called and check the result
        assertEquals("Alice", result);
        verify(userService).getUserById(1);
    }
}
