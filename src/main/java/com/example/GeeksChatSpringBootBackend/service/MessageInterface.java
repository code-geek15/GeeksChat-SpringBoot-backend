package com.example.GeeksChatSpringBootBackend.service;

import com.example.GeeksChatSpringBootBackend.model.Message;

import java.util.List;

public interface MessageInterface {
    public List<Message> findAllMessages();
    public Message getMessageByID(Long messageID);

}
