package com.myatthet.hi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordListHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView textView;


    public WordListHolder(@NonNull View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.word);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        textView.setText ("Clicked! "+ textView.getText());
    }
}
