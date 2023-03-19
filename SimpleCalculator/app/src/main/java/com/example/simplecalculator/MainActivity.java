package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text,number2Text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1Text = findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultText = findViewById(R.id.resultText);


    }

    public void add(View view){

        if(number1Text.getText().toString().equals("") || number2Text.getText().toString().equals("")){
            resultText.setText("Enter a Number");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = (number1 + number2);

            resultText.setText("Result " + result);
        }

    }
    public void sub(View view){
        if(number1Text.getText().toString().equals("") || number2Text.getText().toString().equals("")){
            resultText.setText("Enter a Number");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = (number1 - number2);

            resultText.setText("Result " + result);
        }


    }
    public void multiple(View view){
        if(number1Text.getText().toString().equals("") || number2Text.getText().toString().equals("")){
            resultText.setText("Enter a Number");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = (number1 * number2);

            resultText.setText("Result " + result);
        }

    }
    public void divide(View view){
        if(number1Text.getText().toString().equals("") || number2Text.getText().toString().equals("")){
            resultText.setText("Enter a Number");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = (number1 / number2);

            resultText.setText("Result " + result);
        }

    }
}