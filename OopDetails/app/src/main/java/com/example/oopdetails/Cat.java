package com.example.oopdetails;

public class Cat implements Education{

    private  String name;
    private String eyeColor;
    private  String featherColor;

    public static final String  kind  = "Felis";

    public Cat() {

    }

    public Cat(String name, String eyeColor, String featherColor) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.featherColor = featherColor;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public static void talkStatic(){
        System.out.println("Benim Türüm : " + kind);
    }

    public void talk(){
        System.out.println("Benim ismim : " + this.name+ " Benim Türüm : " + kind);
    }

    @Override
    public boolean takeEducation() {
        return false;
    }
}
