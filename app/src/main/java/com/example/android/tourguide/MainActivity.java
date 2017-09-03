package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button es = (Button) findViewById(R.id.educational_sites);
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, educational_sites.class);
                startActivity(i);
            }
        });

        Button rp = (Button) findViewById(R.id.religious_places);
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, religious_places.class);
                startActivity(i);
            }
        });

        Button lg = (Button) findViewById(R.id.lakes);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, lakes.class);
                startActivity(i);
            }
        });


        Button fw = (Button) findViewById(R.id.falls);
        fw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, falls.class);
                startActivity(i);
            }
        });

    }
}