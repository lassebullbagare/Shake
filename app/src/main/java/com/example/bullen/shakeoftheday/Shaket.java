package com.example.bullen.shakeoftheday;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import static com.example.bullen.shakeoftheday.R.drawable.skak;

public class Shaket extends AppCompatActivity {
    private final String TAG = "DagensShakeApp";
    public ArrayList<Integer> gif;
    public Random slumpaBild;
    private Date d;
    private int bild;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaket);

    }


        public Shaket() {
            gif = new ArrayList<>();
            gif.add(R.drawable.skak);
            gif.add(R.drawable.high);
            gif.add(R.drawable.will);
            gif.add(R.drawable.cool);
            gif.add(R.drawable.kram);
            gif.add(R.drawable.kram2);
            gif.add(R.drawable.chest);

            DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            d = new Date();
            bild = R.drawable.kram;
            Log.i(TAG, "Välkommen");
            

        }

        public int randomBild() {
            int bild;
            int index = slumpaBild.nextInt(gif.size());
            bild =gif.get(index);
            System.out.println("Bild " + bild);
            return bild;
        }

        public int getImage() {

            Date n = new Date();
            if (d.before(n)) {
                bild = randomBild();
                String id = "imageView";
                int resID = getResources().getIdentifier(id, "drawable", "main.res.layout");
                ImageView image =null;
                image.setImageResource(resID);
                d = n;
            }
            return bild;
        }

    }
