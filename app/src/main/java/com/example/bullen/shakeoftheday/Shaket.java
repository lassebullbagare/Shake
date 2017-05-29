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

public class Shaket extends AppCompatActivity {
    private final String TAG = "DagensShakeApp";
    public ArrayList<String> gif;
    public Random slumpaBild;
    private Date d;
    private String bild;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaket);

    }


        public Shaket() {
            gif = new ArrayList<>();
            gif.add(0, "drawable/skak.gif");
            gif.add(1, "drawable/high.gif");
            gif.add(2, "drawable/will.gif");
            gif.add(3, "drawable/cool.gif");
            gif.add(4, "drawable/kram.gif");
            gif.add(5, "drawable/kram2.gif");
            gif.add(6, "drawable/chest.gif");

            DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            d = new Date();
            bild = "drawable/cool.gif";
            Log.i(TAG, "Välkommen");
            this.getImage();

        }

        public String randomBild() {
            String bild;
            int index = slumpaBild.nextInt(gif.size());
            bild = gif.get(index);
            System.out.println("Bild " + bild);
            return bild;
        }

        public String getImage() {

            Date n = new Date();
            if (d.before(n)) {
                bild = randomBild();
                String id = "imageView";
                int resID = getResources().getIdentifier(id, "drawable", "main.res.layout");
                ImageView image = null;
                image.setImageResource(resID);
                d = n;
            }
            return bild;
        }

    }
