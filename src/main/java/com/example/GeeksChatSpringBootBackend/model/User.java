package com.example.GeeksChatSpringBootBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ChatUsers")
public class User {

    @Id
    private String userHandle;
    private String firstname;
    private String lastname;
    private String email;
    private LocalTime lastSeen;

    public void setLastSeen() {
        this.lastSeen = lastSeen.now();
    }
}
