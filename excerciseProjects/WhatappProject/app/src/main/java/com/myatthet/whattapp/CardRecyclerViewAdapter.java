package com.myatthet.whattapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CardRecyclerViewAdapter extends RecyclerView.Adapter<CardViewHolder>{
    public List<WhatsAppData> dataList;
    public String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());

    public CardRecyclerViewAdapter(List<WhatsAppData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new CardViewHolder(layoutView);
    }
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => "+c.getTime());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = df.format(c.getTime());


        if (dataList != null && position < dataList.size()) {
            WhatsAppData data = dataList.get(position);
//            holder.imageView.findViewById(data.)
            holder.name.setText(data.name);
            holder.text1.setText(data.text1);
            holder.text2.setText(formattedDate);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
