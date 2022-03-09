package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public NetworkImageView img;
    public TextView title;
    public TextView author;
    public TextView date;

    public ItemViewHolder(@NonNull View view) {
        super(view);
        img = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.title);
        author = itemView.findViewById(R.id.author);
        date = itemView.findViewById(R.id.date);
    }
}
