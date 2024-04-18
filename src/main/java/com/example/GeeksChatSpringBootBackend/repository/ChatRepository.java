package com.example.GeeksChatSpringBootBackend.repository;

import com.example.GeeksChatSpringBootBackend.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findChatBy();


}
