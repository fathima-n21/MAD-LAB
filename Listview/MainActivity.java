package com.sam.array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String courseList[]={"C-Programming","Data Structure","Database","Python","Java",
            "Operating System", "Compiler Design","Android Development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>
                (this,R.layout.item_view,R.id.textview,courseList);
        listview.setAdapter(arrayAdapter);
    }
}