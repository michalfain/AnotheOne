package com.example.anotheone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashSet;

public class AddChart extends AppCompatActivity {

    int chartId;
    public EditText etTitle, etFirstVerse, etSecondVerse, etThirdVerse;
    public static AutoCompleteTextView etchord1, etchord2, etchord3, etchord4, etchord5, etchord6, etchord7, etchord8, etchord9, etchord10, etchord11, etchord12,
            etchord13, etchord14, etchord15, etchord16, etchord17, etchord18, etchord19, etchord20, etchord21, etchord22, etchord23, etchord24,
            etchord25, etchord26, etchord27, etchord28, etchord29, etchord30, etchord31, etchord32, etchord33, etchord34, etchord35, etchord36,
            etchord37, etchord38, etchord39, etchord40, etchord41, etchord42, etchord43, etchord44, etchord45, etchord46, etchord47, etchord48;
    static String myPref = "myPref";
    static String my1 = "my1";
    public SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chart);
        etTitle = findViewById(R.id.edTitle);
        etFirstVerse = findViewById(R.id.first_verse);
        etSecondVerse = findViewById(R.id.second_verse);
        etThirdVerse = findViewById(R.id.third_verse);
        etchord1 = findViewById(R.id.chord1);
        etchord2 = findViewById(R.id.chord2);
        etchord3 = findViewById(R.id.chord3);
        etchord4 = findViewById(R.id.chord4);
        etchord5 = findViewById(R.id.chord5);
        etchord6 = findViewById(R.id.chord6);
        etchord7 = findViewById(R.id.chord7);
        etchord8 = findViewById(R.id.chord8);
        etchord9 = findViewById(R.id.chord9);
        etchord10 = findViewById(R.id.chord10);
        etchord11 = findViewById(R.id.chord11);
        etchord12 = findViewById(R.id.chord12);
        etchord13 = findViewById(R.id.chord13);
        etchord14 = findViewById(R.id.chord14);
        etchord15 = findViewById(R.id.chord15);
        etchord16 = findViewById(R.id.chord16);
        etchord17 = findViewById(R.id.chord17);
        etchord18 = findViewById(R.id.chord18);
        etchord19 = findViewById(R.id.chord19);
        etchord20 = findViewById(R.id.chord20);
        etchord21 = findViewById(R.id.chord21);
        etchord22 = findViewById(R.id.chord22);
        etchord23 = findViewById(R.id.chord23);
        etchord24 = findViewById(R.id.chord24);
        etchord25 = findViewById(R.id.chord25);
        etchord26 = findViewById(R.id.chord26);
        etchord27 = findViewById(R.id.chord27);
        etchord28 = findViewById(R.id.chord28);
        etchord29 = findViewById(R.id.chord29);
        etchord30 = findViewById(R.id.chord30);
        etchord31 = findViewById(R.id.chord31);
        etchord32 = findViewById(R.id.chord32);
        etchord33 = findViewById(R.id.chord33);
        etchord34 = findViewById(R.id.chord34);
        etchord35 = findViewById(R.id.chord35);
        etchord36 = findViewById(R.id.chord36);
        etchord37 = findViewById(R.id.chord37);
        etchord38 = findViewById(R.id.chord38);
        etchord39 = findViewById(R.id.chord39);
        etchord40 = findViewById(R.id.chord40);
        etchord41 = findViewById(R.id.chord41);
        etchord42 = findViewById(R.id.chord42);
        etchord43 = findViewById(R.id.chord43);
        etchord44 = findViewById(R.id.chord44);
        etchord45 = findViewById(R.id.chord45);
        etchord46 = findViewById(R.id.chord46);
        etchord47 = findViewById(R.id.chord47);
        etchord48 = findViewById(R.id.chord48);





        String [] chords = {"C", "Cm", "Cdim", "Caug","Cmaj7", "C7", "Cm7", "CmMaj7", "Cm7b5", "Cdim7",
                "Cb", "Cbm", "Cbdim", "Cbaug","Cbmaj7", "Cb7", "Cbm7", "CbmMaj7", "Cbm7b5", "Cbdim7",
                "C#", "C#m", "C#dim", "C#aug","C#maj7", "C#7", "C#m7", "C#mMaj7", "C#m7b5", "C#dim7",
                "D", "Dm", "Ddim", "Daug","Dmaj7", "D7", "Dm7", "DmMaj7", "Dm7b5", "Ddim7",
                "Db", "Dbm", "Dbdim", "Dbaug","Dbmaj7", "Db7", "Dbm7", "DbmMaj7", "Dbm7b5", "Dbdim7",
                "D#", "D#m", "D#dim", "D#aug","D#maj7", "D#7", "D#m7", "D#mMaj7", "D#m7b5", "D#dim7",
                "E", "Em", "Edim", "Eaug","Emaj7", "E7", "Em7", "EmMaj7", "Em7b5", "Edim7",
                "Eb", "Ebm", "Ebdim", "Ebaug","Ebmaj7", "Eb7", "Ebm7", "EbmMaj7", "Ebm7b5", "Ebdim7",
                "E#", "E#m", "E#dim", "E#aug","E#maj7", "E#7", "E#m7", "E#mMaj7", "E#m7b5", "E#dim7",
                "F", "Fm", "Fdim", "Faug","Fmaj7", "F7", "Fm7", "FmMaj7", "Fm7b5", "Fdim7",
                "Fb", "Fbm", "Fbdim", "Fbaug","Fbmaj7", "Fb7", "Fbm7", "FbmMaj7", "Fbm7b5", "Fbdim7",
                "F#", "F#m", "#Fdim", "F#aug","F#maj7", "F#7", "F#m7", "F#mMaj7", "F#m7b5", "F#dim7",
                "G", "Gm", "Gdim", "Gaug","Gmaj7", "G7", "Gm7", "GmMaj7", "Gm7b5", "Gdim7",
                "Gb", "Gbm", "Gbdim", "Gbaug","Gbmaj7", "Gb7", "Gbm7", "GbmMaj7", "Gbm7b5", "Gbdim7",
                "G#", "G#m", "G#dim", "G#aug","G#maj7", "G#7", "G#m7", "G#mMaj7", "G#m7b5", "G#dim7",
                "A", "Am", "Adim", "Aaug","Amaj7", "A7", "Am7", "AmMaj7", "Am7b5", "Adim7",
                "Ab", "Abm", "Abdim", "Abaug","Abmaj7", "Ab7", "Abm7", "AbmMaj7", "Abm7b5", "Abdim7",
                "A#", "A#m", "A#dim", "A#aug","A#maj7", "A#7", "A#m7", "A#mMaj7", "A#m7b5", "A#dim7",
                "B", "Bm", "Bdim", "Baug","Bmaj7", "B7", "Bm7", "BmMaj7", "Bm7b5", "Bdim7",
                "Bb", "Bbm", "Bbdim", "Bbaug","Bbmaj7", "Bb7", "Bbm7", "BbmMaj7", "Bbm7b5", "Bbdim7",
                "B#", "B#m", "B#dim", "B#aug","B#maj7", "B#7", "B#m7", "B#mMaj7", "B#m7b5", "B#dim7"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, chords);
        etchord1.setThreshold(1);
        etchord1.setAdapter(adapter);
        etchord2.setThreshold(1);
        etchord2.setAdapter(adapter);
        etchord3.setThreshold(1);
        etchord3.setAdapter(adapter);
        etchord4.setThreshold(1);
        etchord4.setAdapter(adapter);
        etchord5.setThreshold(1);
        etchord5.setAdapter(adapter);
        etchord6.setThreshold(1);
        etchord6.setAdapter(adapter);
        etchord7.setThreshold(1);
        etchord7.setAdapter(adapter);
        etchord8.setThreshold(1);
        etchord8.setAdapter(adapter);
        etchord9.setThreshold(1);
        etchord9.setAdapter(adapter);
        etchord10.setThreshold(1);
        etchord10.setAdapter(adapter);
        etchord11.setThreshold(1);
        etchord11.setAdapter(adapter);
        etchord12.setThreshold(1);
        etchord12.setAdapter(adapter)
        ;etchord13.setThreshold(1);
        etchord13.setAdapter(adapter);
        etchord14.setThreshold(1);
        etchord14.setAdapter(adapter);
        etchord15.setThreshold(1);
        etchord15.setAdapter(adapter);
        etchord16.setThreshold(1);
        etchord16.setAdapter(adapter);
        etchord17.setThreshold(1);
        etchord17.setAdapter(adapter);
        etchord18.setThreshold(1);
        etchord18.setAdapter(adapter);
        etchord19.setThreshold(1);
        etchord19.setAdapter(adapter);
        etchord20.setThreshold(1);
        etchord20.setAdapter(adapter);
        etchord21.setThreshold(1);
        etchord21.setAdapter(adapter);
        etchord22.setThreshold(1);
        etchord22.setAdapter(adapter);
        etchord23.setThreshold(1);
        etchord23.setAdapter(adapter);
        etchord24.setThreshold(1);
        etchord24.setAdapter(adapter);
        etchord25.setThreshold(1);
        etchord25.setAdapter(adapter);
        etchord26.setThreshold(1);
        etchord26.setAdapter(adapter);
        etchord27.setThreshold(1);
        etchord27.setAdapter(adapter);
        etchord28.setThreshold(1);
        etchord28.setAdapter(adapter);
        etchord29.setThreshold(1);
        etchord29.setAdapter(adapter);
        etchord30.setThreshold(1);
        etchord30.setAdapter(adapter);
        etchord31.setThreshold(1);
        etchord31.setAdapter(adapter);
        etchord32.setThreshold(1);
        etchord32.setAdapter(adapter);
        etchord33.setThreshold(1);
        etchord33.setAdapter(adapter);
        etchord34.setThreshold(1);
        etchord34.setAdapter(adapter);
        etchord35.setThreshold(1);
        etchord35.setAdapter(adapter);
        etchord36.setThreshold(1);
        etchord36.setAdapter(adapter);
        etchord37.setThreshold(1);
        etchord37.setAdapter(adapter);
        etchord38.setThreshold(1);
        etchord38.setAdapter(adapter);
        etchord39.setThreshold(1);
        etchord39.setAdapter(adapter);
        etchord40.setThreshold(1);
        etchord40.setAdapter(adapter);
        etchord41.setThreshold(1);
        etchord41.setAdapter(adapter);
        etchord42.setThreshold(1);
        etchord42.setAdapter(adapter);
        etchord43.setThreshold(1);
        etchord43.setAdapter(adapter);
        etchord44.setThreshold(1);
        etchord44.setAdapter(adapter);
        etchord45.setThreshold(1);
        etchord45.setAdapter(adapter);
        etchord46.setThreshold(1);
        etchord46.setAdapter(adapter);
        etchord47.setThreshold(1);
        etchord47.setAdapter(adapter);
        etchord48.setThreshold(1);
        etchord48.setAdapter(adapter);

        Intent intent = getIntent();
        String myTittle = getIntent().getStringExtra("tittle");
        String myc1 = getIntent().getStringExtra("c1");
        chartId = intent.getIntExtra("chartId", -1);
        if(chartId != -1){
            etTitle.setText(ViewCharts.charts.get(chartId));
//            etchord1.setText(ViewCharts.charts.get(chartId));
        }else {
            ViewCharts.charts.add("");
            chartId = ViewCharts.charts.size() - 1;
            ViewCharts.arrayAdapter.notifyDataSetChanged();
        }

//        sharedPreferences = getSharedPreferences("info", MODE_PRIVATE);
//        etTitle.setText(sharedPreferences.getString(myTittle, null));
//        etchord1.setText(sharedPreferences.getString(my1,null));
//
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        if(etTitle.getText().length() > 0 || etchord1.getText().length() > 0){
//            editor.putString(myTittle, etTitle.getText().toString());
//            editor.putString(my1, etchord1.getText().toString());
//            editor.commit();
//        }


        //this is the previous one
        etTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ViewCharts.charts.set(chartId, String.valueOf(s));
                ViewCharts.arrayAdapter.notifyDataSetChanged();


                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.anotheone"
                        ,Context.MODE_PRIVATE);
                HashSet<String> set = new HashSet<>(ViewCharts.charts);
                sharedPreferences.edit().putStringSet("charts", set).apply();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        // this one saves the last input
       etchord1.addTextChangedListener(new TextWatcher() {
            @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                ViewCharts.charts.set(chartId, String.valueOf(s));
//                ViewCharts.arrayAdapter.notifyDataSetChanged();
//
//                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.anotheone"
//                        ,Context.MODE_PRIVATE);
//                HashSet<String> set = new HashSet<>(ViewCharts.charts);
//                sharedPreferences.edit().putStringSet("charts", set).apply();


            }

            @Override
            public void afterTextChanged(Editable s) {
               // etchord1.setText(String.valueOf(s));
            }
        });



   }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.save:
//                save();
//                retrive();
                Toast.makeText(this, "Chart Saved!", Toast.LENGTH_LONG).show();
                break;
            case R.id.reset:
                resetChart();
                Toast.makeText(this, "Chart Is Cleared!", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    public void resetChart(){
        etTitle.setText("");
        etFirstVerse.setText("");
        etSecondVerse.setText("");
        etThirdVerse.setText("");
        etchord1.setText("");
        etchord2.setText("");
        etchord3.setText("");
        etchord4.setText("");
        etchord5.setText("");
        etchord6.setText("");
        etchord7.setText("");
        etchord8.setText("");
        etchord9.setText("");
        etchord10.setText("");

        etchord11.setText("");
        etchord12.setText("");
        etchord13.setText("");
        etchord14.setText("");
        etchord15.setText("");
        etchord16.setText("");
        etchord17.setText("");
        etchord18.setText("");
        etchord19.setText("");
        etchord20.setText("");

        etchord21.setText("");
        etchord22.setText("");
        etchord23.setText("");
        etchord24.setText("");
        etchord25.setText("");
        etchord26.setText("");
        etchord27.setText("");
        etchord28.setText("");
        etchord29.setText("");
        etchord30.setText("");

        etchord31.setText("");
        etchord32.setText("");
        etchord33.setText("");
        etchord34.setText("");
        etchord35.setText("");
        etchord36.setText("");
        etchord37.setText("");
        etchord38.setText("");
        etchord39.setText("");
        etchord40.setText("");

        etchord41.setText("");
        etchord42.setText("");
        etchord43.setText("");
        etchord44.setText("");
        etchord45.setText("");
        etchord46.setText("");
        etchord47.setText("");
        etchord48.setText("");
    }

//    public void save(){
////        String t = etTitle.getText().toString();
////        String c1 = etchord1.getText().toString();
//        sharedPreferences = getSharedPreferences(myPref, MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(myTittle, etTitle.getText().toString());
//        editor.putString(my1, etchord1.getText().toString());
//
//    }
//    public void retrive() {
//
//        sharedPreferences = getSharedPreferences(myPref, Context.MODE_PRIVATE);
//        String vTittle = sharedPreferences.getString(myTittle, etTitle.getText().toString());
//        String vc1 = sharedPreferences.getString(my1, etchord1.getText().toString());
//        etTitle.setText(vTittle);
//        etchord1.setText(vc1);
//
////        if (sharedPreferences.contains(myTittle)) {
////            etTitle.setText(sharedPreferences.getString(myTittle, ""));
////        }
////        if(sharedPreferences.contains(my1)){
////            etchord1.setText(sharedPreferences.getString(my1, ""));
////
////        }
//    }

}
