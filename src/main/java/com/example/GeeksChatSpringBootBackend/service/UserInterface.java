package com.example.GeeksChatSpringBootBackend.service;

import com.example.GeeksChatSpringBootBackend.model.User;

import java.util.List;

public interface UserInterface {

    public User createUser(User user);
    public User findUserById(String userID);
    public List<User> findAllUsers();
}
