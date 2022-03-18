package com.myatthet.hi;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView wordText;

    public ViewHolder(View itemView){
        super(itemView);
        wordText=itemView.findViewById(R.id.textView);
    }
}
