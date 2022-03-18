package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
{
    ImageButton info,arlet, save,share;
    private View.OnClickListener imageButtonListener = new View.OnClickListener()
    {

        @Override
        public void onClick(View view)
        {
            if(view.getId()==R.id.info)
            {
                Toast.makeText(getApplicationContext(),"info button clicked",Toast.LENGTH_LONG).show();

            }
            if(view.getId()==R.id.arlet)
            {
                Toast.makeText(getApplicationContext(),"arlet button clicked",Toast.LENGTH_LONG).show();
            }
            if(view.getId()==R.id.save)
            {
                Toast.makeText(getApplicationContext(),"save button",Toast.LENGTH_SHORT).show();
            }
            if(view.getId()==R.id.share)
            {
                Toast.makeText(getApplicationContext(),"share button clicked",Toast.LENGTH_LONG).show();
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        info = findViewById(R.id.info);
        arlet =findViewById(R.id.arlet);
        save= findViewById(R.id.save);
        share = findViewById(R.id.share);


        info.setOnClickListener(imageButtonListener);
        arlet.setOnClickListener(imageButtonListener);

        save.setOnClickListener(imageButtonListener);

        share.setOnClickListener(imageButtonListener);

    }
}