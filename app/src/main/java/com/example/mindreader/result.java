package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.mindreader.play;

public class result extends AppCompatActivity {
   ImageView img ;
   Button tryAgain ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        img=findViewById(R.id.imgR);
        tryAgain=findViewById(R.id.trya);
        int res=play.x ;
        switch (res){
            case 0 :
                img.setImageResource(R.drawable.res1);
                break;
            case 1 :
                img.setImageResource(R.drawable.res2);
                break;
            case 2 :
                img.setImageResource(R.drawable.res3);
                break;
            case 3 :
                img.setImageResource(R.drawable.res4);
                break;
            case 4 :
                img.setImageResource(R.drawable.res5);
                break;
            case 5 :
                img.setImageResource(R.drawable.res6);
                break;
            case 6 :
                img.setImageResource(R.drawable.res7);
                break;
        }


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