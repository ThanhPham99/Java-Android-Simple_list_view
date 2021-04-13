package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView context = findViewById(R.id.moevuive);
        arr.add("Moe");
        arr.add("Cho");
        arr.add("Ga");
        arr.add("Lon");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        context.setAdapter(adapter);
        context.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,arr.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("data", arr.get(position));
                startActivity(intent);
            }
        });
    }
}