package com.myatthet.hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListHolder> {
    private final LinkedList<String> wordList;

    public WordListAdapter(LinkedList<String> wordList) {
        this.wordList = wordList;
    }



    @NonNull
    @Override
    public WordListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.word_list, parent, false);
        return new WordListHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListHolder holder, int position) {
        if (wordList != null && position < wordList.size()) {
            String word = wordList.get(position);
            holder.textView.setText(word);
        }
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }
}
