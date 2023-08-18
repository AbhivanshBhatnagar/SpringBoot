package com.example.webapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String name;
    private String description;
    private LocalDate targetDate;
    private boolean completed;

    public Todo(int id, String name, String description, LocalDate targetDate, boolean completed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.targetDate = targetDate;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", targetDate=" + targetDate
                + ", completed=" + completed + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
}
