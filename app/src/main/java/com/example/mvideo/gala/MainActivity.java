package com.example.mvideo.gala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvideo.gala.R;

public class MainActivity extends AppCompatActivity {

    Button terms;
    Button about;
    Button exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        terms = (Button) findViewById(R.id.terms);
        about = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_work_plase);
                Intent intent = new Intent(MainActivity.this,terms.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,about.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }
}
