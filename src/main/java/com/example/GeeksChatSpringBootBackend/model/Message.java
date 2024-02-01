package com.example.GeeksChatSpringBootBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    @ManyToOne
    @JoinColumn(name="SenderID")
    private User sender;
    @ManyToOne
    @JoinColumn(name="ReceiverID")
    private User receiver;
    private String messageContent;
    private LocalDateTime messageTime;
    private boolean isRead;
    private boolean isReceived;
}
