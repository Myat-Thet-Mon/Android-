package com.myatthet.studentmanagementsystemsms;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class StudentActivity  extends AppCompatActivity {
    ListView listView;
    List<Student> studentList = Arrays.asList(
//      new Student(1, "Mg Mg", 20, "blahblah "),
//      new Student(2, "aa"),
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        listView =findViewById(R.id.student_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listview, studentArray);
        listView.setAdapter(arrayAdapter);
    }
}