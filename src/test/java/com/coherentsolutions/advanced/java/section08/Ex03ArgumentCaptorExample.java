// File: Ex03ArgumentCaptorExample.java
// Package: com.coherentsolutions.advanced.java.section08

package com.coherentsolutions.advanced.java.section08;

import com.coherentsolutions.advanced.java.section08.utils.UserController;
import com.coherentsolutions.advanced.java.section08.utils.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Ex03ArgumentCaptorExample
 *
 * This class demonstrates how to use ArgumentCaptor in Mockito.
 */
@ExtendWith(MockitoExtension.class)
public class Ex03ArgumentCaptorExample {

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    /**
     * Test method that captures the argument passed to the mock method.
     */
    @Test
    void testArgumentCaptor() {
        ArgumentCaptor<Integer> argumentCaptor = ArgumentCaptor.forClass(Integer.class);

        // Call the method under test
        userController.findUser(42);

        // Capture the argument passed to the getUserById method
        verify(userService).getUserById(argumentCaptor.capture());

        // Assert that the captured argument is what we expect
        assertEquals(42, argumentCaptor.getValue());
    }
}
