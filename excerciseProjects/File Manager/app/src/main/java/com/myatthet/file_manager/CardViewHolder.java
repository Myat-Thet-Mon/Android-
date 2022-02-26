package com.myatthet.file_manager;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder{
    public ImageView extIcon;
    public TextView name;
    public TextView text1;
    public TextView text2;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        extIcon = itemView.findViewById(R.id.extIcon);
        name = itemView.findViewById(R.id.name);
        text1 = itemView.findViewById(R.id.txt);
        text2 = itemView.findViewById(R.id.txt2);
    }
}
