package com.myatthet.studentlistinsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String []studentArray={"Mg Mg","Su Su","Aye Aye","Wai Wai"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.student_list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.listview,studentArray);
        listView.setAdapter(arrayAdapter);
    }
}