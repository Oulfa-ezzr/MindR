package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class play extends AppCompatActivity {
    private Button returne ,tap ;
    private ImageView img ;
    public static int x ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        returne=findViewById(R.id.btn) ;
        tap= findViewById(R.id.result);
        img=findViewById(R.id.img);
        Random rand = new Random(); //instance of random class

        //generate random values from 0-6
        x = rand.nextInt(7);
        switch (x){
            case 0 :
                img.setImageResource(R.drawable.img1);
                break;
            case 1 :
                img.setImageResource(R.drawable.img2);
                break;
            case 2 :
                img.setImageResource(R.drawable.img3);
                break;
            case 3 :
                img.setImageResource(R.drawable.img4);
                break;
            case 4 :
                img.setImageResource(R.drawable.img5);
                break;
            case 5 :
                img.setImageResource(R.drawable.img6);
                break;
            case 6 :
                img.setImageResource(R.drawable.img7);
                break;
        }
        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity= new Intent (getApplicationContext(),result.class);
                startActivity(otherActivity);
                finish();
            }
        });
        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity= new Intent (getApplicationContext(),howtoplay.class);
                startActivity(otherActivity);
                finish();

            }
        });
    }
}