package com.myatthet.studentlist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
    String[] studentArray = {"Xiumin"," Yixing","Suho","Baekhyun",
            "Chanyeol","Kyungsoo","Jongin","Sehun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, studentArray);

        ListView listView = (ListView) findViewById(R.id.studentList);
        listView.setAdapter(adapter);
    }
}
