package com.example.oopdetails;

import static com.example.oopdetails.Cat.kind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Tom", "Brown", "Orange");

        Cat cat1 = new Cat();
        cat1.setName("Duman");
        System.out.println(cat.getName());
        System.out.println(cat1.getName());
        System.out.println(Cat.kind);
        cat.talk();
        Cat.talkStatic();
    }
}