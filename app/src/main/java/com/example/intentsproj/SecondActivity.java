package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editTextNumber;
    EditText editTextNumber2;

    TextView sum;

    String no1;
    String no2;

    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        sum = findViewById(R.id.sum);

        Intent intent = getIntent();

        String no1 = intent.getStringExtra("n1");
        String no2 = intent.getStringExtra("n2");

        editTextNumber.setText(no1);
        editTextNumber2.setText(no2);

        n1 = Integer.parseInt(no1);
        n2 = Integer.parseInt(no2);

    }

    public void add(View v){

        sum.setText(no1 + "+" +no2 + (n1+n2));
    }

    public void substraction(View v){

        sum.setText(no1 + "-" +no2 + (n1-n2));
    }

    public void multification(View v){

        sum.setText(no1 + "*" +no2 + (n1*n2));
    }

    public void divide(View v){

        sum.setText(no1 + "/" +no2 + (n1/n2));
    }
}