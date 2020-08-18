package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);


        }

    public void openSecond(View v){
        Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("n1", editTextNumber.getText().toString());
        intent.putExtra("n2", editTextNumber2.getText().toString());

//Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        /*Toast toast1;
        Context context = getApplicationContext();
        CharSequence text = "this navigate to activity 2";
        int duration = Toast.LENGTH_SHORT;
        toast1= Toast.makeText(this,"", duration);
        toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast1.show();

         */

        startActivity(intent);
    }






}