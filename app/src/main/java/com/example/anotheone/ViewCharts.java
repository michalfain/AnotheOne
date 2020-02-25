package com.example.anotheone;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static com.example.anotheone.AddChart.etchord1;
import static com.example.anotheone.AddChart.my1;
import static com.example.anotheone.AddChart.myPref;

public class ViewCharts extends AppCompatActivity {
   static Map<String,AddChart> charts = new HashMap<String,AddChart>();
    static ArrayAdapter arrayAdapter;
//    EditText etTitle, etchord1;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_charts);

        ListView lvCharts = (ListView) findViewById(R.id.lvCharts);
//        etTitle = findViewById(R.id.edTitle);
//        etchord1 = findViewById(R.id.chord1);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.anotheone"
                , Context.MODE_PRIVATE);
        HashSet<String> set = (HashSet<String>)sharedPreferences.getStringSet("charts", null);
        if(set == null){
            charts.put("Example chart",new AddChart());

        }else {
            charts = new HashMap<String,AddChart>();
        }


        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, charts);
        lvCharts.setAdapter(arrayAdapter);

        lvCharts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), AddChart.class);
//                String tittle = etTitle.getText().toString().trim();
//                intent.putExtra("tittle", tittle);
//                String myc1 = etchord1.toString().trim();
                intent.putExtra("chartId", position);
//                SharedPreferences sharedPreferences = getSharedPreferences("info", MODE_PRIVATE);
//                etTitle.setText(sharedPreferences.getString(tittle, null));
//                etchord1.setText(sharedPreferences.getString(myc1,null));

//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                if(etTitle.getText().length() > 0 || etchord1.getText().length() > 0){
//                    editor.putString(tittle, etTitle.getText().toString());
//                    editor.putString(myc1, etchord1.getText().toString());
//                    editor.commit();
//                }

                startActivity(intent);
//                retrive();
            }
        });


        lvCharts.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                new AlertDialog.Builder(ViewCharts.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want to delete this chart?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                charts.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.anotheone"
                                        ,Context.MODE_PRIVATE);
                                Map<String,AddChart> chartsMap = new HashMap<>(ViewCharts.charts);
                                sharedPreferences.edit().putStringSet("charts", chartsMap.keySet()).apply();
                            }
                        })
                        .setNegativeButton("NO!", null)
                        .show();
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.add_chart:
                Intent intent = new Intent(getApplicationContext(), AddChart.class);
                startActivity(intent);
                return true;
        }
        return false;

    }

}
