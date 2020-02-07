package com.example.pomodoro.model;

import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "tasklist")
    private String title;
    private String content;

    @CreatedBy
    private String taskCreatedBy;

    public Task(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
