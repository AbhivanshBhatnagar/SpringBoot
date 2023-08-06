package com.learn.jpahibernate.jdbc;

public class Course {
    int id;
    String name;
    String author;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String course) {
        this.name = course;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", course=" + name + ", author=" + author + "]";
    }

    public Course(int id, String course, String author) {
        super();
        this.id = id;
        this.name = course;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}
