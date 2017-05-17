package com.example.bullen.shakeoftheday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "DagensShakeApp";


        public void init(){
        Button knapp = (Button) findViewById(R.id.knapp);
        knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shake = new Intent(MainActivity.this, Shaket.class);
                startActivity(shake);
                Log.i(TAG, "Det här är dagens shake!");
                Toast.makeText(getApplicationContext(), "Här har du ditt shake!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
ss
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
}}
