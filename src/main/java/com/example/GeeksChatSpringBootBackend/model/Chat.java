package com.example.GeeksChatSpringBootBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chatId;

//    line 20 and 21 gave me an error thats why i commented the out
//    private List<Message> messageList;
//    private List<User> usersList;


}

