package com.example.model;

import jakarta.persistence.*;

@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String room;
    private String type;
    private String description;
    private String status;

    public Complaint() {}

    public Complaint(String name, String room, String type, String description) {
        this.name = name;
        this.room = room;
        this.type = type;
        this.description = description;
        this.status = "Pending";
    }

    // getters & setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getRoom() { return room; }
    public String getType() { return type; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}