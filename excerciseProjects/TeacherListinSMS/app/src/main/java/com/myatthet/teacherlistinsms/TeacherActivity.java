package com.myatthet.teacherlistinsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TeacherActivity extends AppCompatActivity {
    ListView listView;
    String []teacherArray={"Mg","Su","Aye","Wai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_activity_main);
        listView=(ListView)findViewById(R.id.teacher_list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.teacher_listview,teacherArray);
        listView.setAdapter(arrayAdapter);
    }
}