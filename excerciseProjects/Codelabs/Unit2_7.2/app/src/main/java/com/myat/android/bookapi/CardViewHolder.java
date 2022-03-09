package com.myat.android.bookapi;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.whowroteit.R;

public class CardViewHolder extends RecyclerView.ViewHolder{

    public ImageView image;
    public TextView title;
    public TextView author;
    public TextView date;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.title);
        author = itemView.findViewById(R.id.author);
        date = itemView.findViewById(R.id.date);
    }

}
