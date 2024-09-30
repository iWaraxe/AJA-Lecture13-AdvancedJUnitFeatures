package com.coherentsolutions.advanced.java.section08.utils;

/**
 * The class under test that depends on UserService.
 */
public class UserController {
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    public String findUser(int id) {
        return userService.getUserById(id);
    }
}