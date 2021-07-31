package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class result extends AppCompatActivity {
   ImageView img ;
   Button tryAgain ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        img=findViewById(R.id.imgR);
        tryAgain=findViewById(R.id.trya);
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity= new Intent (getApplicationContext(),play.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}