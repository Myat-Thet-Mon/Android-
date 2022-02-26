package com.myatthet.mystudentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] array = {"Xiumin","Yixing","Suho","Baekhyun","Chanyeol","Kyungsoo","KAI","Sehun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.student_list);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this,R.layout.listview,array);
        listView.setAdapter(arrayAdapter);
    }
}