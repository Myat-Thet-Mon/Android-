package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private List<Book> bookList;
    private Context mContext;
    private ImageRequester imageRequester;


    public ItemAdapter(Context mainActivity, ArrayList<Book> arrayList) {
        this.mContext = mainActivity;
        this.bookList = arrayList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        if (bookList != null && position < bookList.size()) {
            Book bookData = bookList.get(position);
//            holder.img.setImageBitmap();
//            Uri uri = Uri.parse(bookData.getUrl()).buildUpon().build();
//            holder.img.setImageURI(uri);
//            imageRequester.setImageFromUrl( holder.img, bookData.getUrl());

            holder.title.setText(bookData.getTitle());
            holder.author.setText(bookData.getAuthor());
            holder.date.setText(bookData.getDate());
        }
    }

    public void getBookList(List<Book> bookList) {
        this.bookList.clear();
        for (int i = 0; i < bookList.size(); i++) {
            this.bookList.add(bookList.get(i));
        }
        this.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
