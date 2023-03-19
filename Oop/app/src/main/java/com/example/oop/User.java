package com.example.oop;

public class User {
    private  String name;
    private  String surname;
    private  String job;

    public User(String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;

        System.out.println("User Created");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
