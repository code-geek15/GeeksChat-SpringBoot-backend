package com.example.GeeksChatSpringBootBackend.repository;

import com.example.GeeksChatSpringBootBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    List<User> findAllUsers();
}
