package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = this.getSharedPreferences("com.example.myapplication", Context.MODE_PRIVATE);
        editText = findViewById(R.id.ageText);
        textView = findViewById(R.id.showAge);

        int storedAge = sharedPreferences.getInt("StoredAge" , 0);

        if (storedAge == 0){
            textView.setText("Your age : ");
        }
        else{
            textView.setText("Your age : " + storedAge);
        }

    }



    public void save(View view){
        if (!editText.getText().toString().equals("")){
            int age = Integer.parseInt(editText.getText().toString());
            textView.setText("Your age :" + age);

            sharedPreferences.edit().putInt("StoredAge", age).apply();
        }
    }

    public void delete(View view){
        int storedData = sharedPreferences.getInt("StoredAge",0);
        if (storedData != 0) {
            sharedPreferences.edit().remove("StoredAge").apply();
            textView.setText("Your Age : ");
        }
    }
}