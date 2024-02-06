package com.example.GeeksChatSpringBootBackend.repository;

import com.example.GeeksChatSpringBootBackend.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {


}
