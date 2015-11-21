package com.dockerworld.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {

    @Test
    public void shouldGetDummyUsers(){
        UserService userService = new UserService();
        assertEquals(3, userService.getUsers().size());
    }
}
