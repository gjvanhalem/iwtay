package com.app.model;

import java.sql.Timestamp;

public class Thought {

    private Long id;
    //the one that does the thinking
    private String thinker;
    //the subject/person that the thinker is thinking about
    private String subject;
    //when did the thinking happen
    private Timestamp timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThinker() {
        return thinker;
    }

    public void setThinker(String thinker) {
        this.thinker = thinker;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
