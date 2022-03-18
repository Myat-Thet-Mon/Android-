package com.myatthet.hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Entity> wordList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(wordList!=null){
            Entity currentWord=wordList.get(position);
            holder.wordText.setText(currentWord.getWord());
        }else{
            holder.wordText.setText("No word");
        }
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }
}
