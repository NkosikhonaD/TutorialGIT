package com.example.firsttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageButton warning,info,save,share;
    private View.OnClickListener imageButtonClickLister = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            if(view.getId()==R.id.imageButton5)
            {
              Toast.makeText(getApplicationContext(),
                      "Warning",Toast.LENGTH_SHORT).show();
            }
            if(view.getId()==R.id.imageButton4)
            {
                Toast.makeText(getApplicationContext(),
                        "Info",Toast.LENGTH_SHORT).show();
            }
            if(view.getId()==R.id.imageButton3)
            {
                Toast.makeText(getApplicationContext(),
                        "Save",Toast.LENGTH_SHORT).show();
            }
            if(view.getId()==R.id.imageButton2)
            {
                Toast.makeText(getApplicationContext(),
                        "share",Toast.LENGTH_SHORT).show();
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        warning = findViewById(R.id.imageButton5);
        info = findViewById(R.id.imageButton4);
        save = findViewById(R.id.imageButton3);
        share = findViewById(R.id.imageButton2);

        warning.setOnClickListener(imageButtonClickLister);
        info.setOnClickListener(imageButtonClickLister);

        save.setOnClickListener(imageButtonClickLister);
        share.setOnClickListener(imageButtonClickLister);

    }
}