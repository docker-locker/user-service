package com.dockerworld.service;

import com.dockerworld.contract.response.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        User user1 = new User("id1", "Ajay", "Divakaran");
        User user2 = new User("id2", "Jon", "Doe");
        User user3 = new User("id3", "Deb", "Kumar");
        return Arrays.asList(user1, user2, user3);
    }

}
