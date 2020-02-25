package com.example.anotheone;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class ChartIt extends AppCompatActivity {

    TextView chartIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_it);

        chartIt = findViewById(R.id.chartIt);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        chartIt.startAnimation(animation);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(ChartIt.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }


}
