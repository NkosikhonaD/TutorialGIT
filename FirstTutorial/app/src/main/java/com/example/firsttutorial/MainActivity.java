package com.example.firsttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText userName;
    EditText password;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        myButton= findViewById(R.id.button1);
        userName =findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextNumberPassword);

        myButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        if(userName.getText().toString().equals("nd@gmail.com") && password.getText().toString().equals("1234"))
                        {
                            Intent myIntent = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(myIntent);
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"invalid user login",Toast.LENGTH_SHORT);
                        }
                    }
                }
        );




    }
}