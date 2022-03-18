package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText email;
    EditText password;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.editTextTextEmailAddress);
        password =findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button);

        // This is where we want to start another activity
        // We use Intents
        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                       // get email from Edit text and get the password text
                        // getText().toString()
                        if(email.getText().toString().equalsIgnoreCase("nd@gmail.com")&& password.getText().toString().equalsIgnoreCase("1234"))
                        {

                            // start a new activity. Intent
                            Intent myIntent = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(myIntent);

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"invalid login details",Toast.LENGTH_SHORT).show();

                        }



                    }
                }
        );


    }
}