package com.example.pomodoro.model;

import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "people")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "username")
    private String email;
    private String password;
    private String name;
    private String createAll;

    @CreatedBy
    private String usrCreatedBy;

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateAll() {
        return createAll;
    }

    public void setCreateAll(String createAll) {
        this.createAll = createAll;
    }

    public String getUsrCreatedBy() {
        return usrCreatedBy;
    }

    public void setUsrCreatedBy(String usrCreatedBy) {
        this.usrCreatedBy = usrCreatedBy;
    }
}
