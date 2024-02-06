package com.example.GeeksChatSpringBootBackend.repository;

import com.example.GeeksChatSpringBootBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
