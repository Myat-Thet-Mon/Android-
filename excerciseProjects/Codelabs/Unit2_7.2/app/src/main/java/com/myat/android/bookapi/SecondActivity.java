package com.myat.android.bookapi;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.whowroteit.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Book> bookArrayList;
    private BookAdapter bookAdapter;
    private String data = "exo";
    private ArrayList<Book> arrayList;
    private BookAsyn bookAsyn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mRecyclerView =findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList=new ArrayList<>();
        bookAdapter=new BookAdapter(this,arrayList);
        mRecyclerView.setAdapter(bookAdapter);
       bookAsyn= new BookAsyn(bookAdapter);
       bookAsyn.execute(data);


    }


}

