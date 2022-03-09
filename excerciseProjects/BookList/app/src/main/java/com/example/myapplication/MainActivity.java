package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private ArrayList<Book> arrayList;
    private EditText editText;
    private Button btn;
//    private String data="exo";
    private BookAsyn bookAsyn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt);
//        String txt=editText.getText().toString();
        btn=findViewById(R.id.btn);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList = new ArrayList<>();
        itemAdapter = new ItemAdapter(this, arrayList);
        recyclerView.setAdapter(itemAdapter);
        bookAsyn = new BookAsyn(itemAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookAsyn.execute(editText.getText().toString());

            }
        });
//        btn.setOnClickListener();

    }
}