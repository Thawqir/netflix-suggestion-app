package com.example.netflixsuggestionapp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Title {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int age;
    private String titleName;
    private String description;

    public Title(){}

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", age=" + age +
                ", titleName='" + titleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
