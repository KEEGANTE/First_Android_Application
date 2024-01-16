package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editValue, editValue2; //class that helps us declare the objects
    Button btn_square; // declare class as an object by taking the id of the property
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello World App", Toast.LENGTH_LONG).show();

        //initialize views
        editValue = findViewById(R.id.editValue);
        editValue2 = findViewById(R.id.editValue2);
        btn_square = findViewById(R.id.btn_square);

        //create click listener for the button class
        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer val = Integer.parseInt (editValue.getText().toString()); // reads value in first text box
                Integer square = val * val; // after reading we want to square the value
                editValue2.setText(square.toString()); // its an it we need to covert it into string
            }
        });
    }
}