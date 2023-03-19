package com.example.oopdetails;

public interface Education {
    public boolean takeEducation();

    public default boolean takeEducationBody(){
        System.out.println("Eğitim Alıyoruz");
        return false;
    }
}
