package com.myatthet.file_manager;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class CardRecyclerViewAdapter extends RecyclerView.Adapter<CardViewHolder> {
    public List<FileData> fileDataList;

    public CardRecyclerViewAdapter(List<FileData> fileDataList) {
        this.fileDataList = fileDataList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new CardViewHolder(layoutView);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        if (fileDataList != null && position < fileDataList.size()) {
            FileData data = fileDataList.get(position);
            holder.name.setText(data.name);
            holder.text1.setText(data.date);
            holder.text2.setText(data.size);
            if (data.type.equals("folder")) {
                holder.extIcon.setImageResource(R.drawable.ic_folder);
            } else if (data.type.equals("txt")) {
                holder.extIcon.setImageResource(R.drawable.ic_txt);
            } else if (data.type.equals("pdf")) {
                holder.extIcon.setImageResource(R.drawable.ic_pdf);
            } else if (data.type.equals("jpg")) {
                holder.extIcon.setImageResource(R.drawable.ic_jpg);
            } else if (data.type.equals("mp3")) {
                holder.extIcon.setImageResource(R.drawable.ic_music);

            }

        }
    }

    @Override
    public int getItemCount() {
        return fileDataList.size();
    }
}
