package com.example.nbarestspringboot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_times")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String conference;

    public Team() {
    }

    public Team(String name, String conference) {
        this.name = name;
        this.conference = conference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }
}