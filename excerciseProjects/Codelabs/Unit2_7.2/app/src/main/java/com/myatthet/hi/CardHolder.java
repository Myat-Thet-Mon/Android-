package com.myatthet.hi;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;
    public TextView title;
    public TextView author;
//    public TextView text2;

    public CardHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.titleText);
        author = itemView.findViewById(R.id.authorText);
//        text2 = itemView.findViewById(R.id.txt2);
    }
}
