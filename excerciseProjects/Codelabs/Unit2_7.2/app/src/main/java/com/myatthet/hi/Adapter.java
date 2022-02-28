package com.myatthet.hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<CardHolder> {
    public List<FetchBook> dataList;

    public Adapter(MainActivity mainActivity, List<FetchBook> dataList) {
        this.dataList = dataList;
    }

    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new CardHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        if (dataList != null && position < dataList.size()) {
            FetchBook data = dataList.get(position);
//            holder.imageView.findViewById(data.)
//            holder.title.setText(data.mTitleText);
//            holder.author.setText(data.);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
