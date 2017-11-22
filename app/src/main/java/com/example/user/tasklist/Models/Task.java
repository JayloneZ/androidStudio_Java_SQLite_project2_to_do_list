package com.example.user.tasklist.Models;

/**
 * Created by user on 19/11/2017.
 */

public class Task {

    private int id;
    private String name;
    private String description;
    private boolean completed;


    public Task() {
    }

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean bool) {
        this.completed = bool;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
