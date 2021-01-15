package com.itvdn.json.ex001_json.entity;

public class Course {

    private String author;
    private String title;
    private String description;

    public Course(){

    }

    public Course(String author, String title, String description){
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "Author{='" +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description +
                "}";
    }
}
