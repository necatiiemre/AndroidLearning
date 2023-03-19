package com.example.oopdetails;

public class Dog extends Animal implements Education{
    public Dog() {
    }

    public Dog(String name, String eyeColor, String featherColor) {
        super(name, eyeColor, featherColor);
    }

    @Override
    public boolean takeEducation() {
        return true;
    }
}
