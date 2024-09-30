// File: Ex04VerificationModeExample.java
// Package: com.coherentsolutions.advanced.java.section08

package com.coherentsolutions.advanced.java.section08;

import com.coherentsolutions.advanced.java.section08.utils.UserController;
import com.coherentsolutions.advanced.java.section08.utils.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Ex04VerificationModeExample
 *
 * This class demonstrates the use of verification modes in Mockito.
 */
@ExtendWith(MockitoExtension.class)
public class Ex04VerificationModeExample {

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    /**
     * Test method that verifies method invocation using verification modes.
     */
    @Test
    void testVerificationModes() {
        // Call the method once
        userController.findUser(1);

        // Verify that getUserById was called exactly once
        verify(userService, times(1)).getUserById(1);

        // Verify that getUserById was never called with the argument 99
        verify(userService, never()).getUserById(99);
    }
}
