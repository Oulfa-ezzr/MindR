package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class play extends AppCompatActivity {
    Button returne ,tap ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        returne=findViewById(R.id.btn) ;
        tap= findViewById(R.id.result);
        img=findViewById(R.id.img);
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