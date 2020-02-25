package com.example.anotheone;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ivAddChart, ivViewCharts, ivContactUs;
    TextView tvAddChart, tvViewCharts, tvContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        ivAddChart = findViewById(R.id.ivAddChart);
//        tvAddChart = findViewById(R.id.tvAddChart);
        ivViewCharts = findViewById(R.id.ivViewCharts);
        tvViewCharts = findViewById(R.id.tvViewChart);
        ivContactUs = findViewById(R.id.ivContact);
        tvContactUs = findViewById(R.id.tvContact);

//        ivAddChart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, com.example.anotheone.AddChart.class);
//                startActivity(intent);
//            }
//        });
//
//        tvAddChart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, com.example.anotheone.AddChart.class);
//                startActivity(intent);
//            }
//        });

        ivViewCharts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.anotheone.ViewCharts.class);
                startActivity(intent);
            }
        });

        tvViewCharts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.anotheone.ViewCharts.class);
                startActivity(intent);
            }
        });

        ivContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.anotheone.ContactUs.class);
                startActivity(intent);
            }
        });

        tvContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.anotheone.ContactUs.class);
                startActivity(intent);

            }
        });





    }
}
