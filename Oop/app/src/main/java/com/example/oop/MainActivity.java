package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user =  new User("Emre", "Özdemir", "Computer Engineer");
        System.out.println("Name: " + user.getName() + " Surname : " + user.getSurname() + " Job : " + user.getJob());

        Musician musician = new Musician("Tuğçe", "Guitar" , 22);
        System.out.println(musician.getName());
        musician.setName("Emre","değiştir");
        System.out.println(musician.getName());

        SuperMusician superMusician = new SuperMusician("Sevilay", "Guitar" , 51);
        System.out.println(superMusician.sing());
        System.out.println("deneme");

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(3 ,5));
        System.out.println(mathematics.sum(3, 5,7));
    }
}