package com.patika.paycore.myProject.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String email;
    private String password;
    private LocalDateTime lastLogin;

    public User(String email, String password) {
        this.id = "";
        this.email = email;
        this.password = password;
    }
}
