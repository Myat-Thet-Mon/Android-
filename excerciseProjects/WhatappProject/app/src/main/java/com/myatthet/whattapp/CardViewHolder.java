package com.myatthet.whattapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;

public class CardViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView name;
    public TextView text1;
    public TextView text2;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img);
        name = itemView.findViewById(R.id.name);
        text1 = itemView.findViewById(R.id.txt);
        text2 = itemView.findViewById(R.id.txt2);
    }
}
