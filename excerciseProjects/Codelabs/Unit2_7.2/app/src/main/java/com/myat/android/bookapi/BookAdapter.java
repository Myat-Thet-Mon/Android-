package com.myat.android.bookapi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.whowroteit.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class BookAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private List<Book> bookList;
    private Context mContext;


    public BookAdapter(Context context, List<Book> bookList) {
        this.bookList = bookList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new CardViewHolder(layoutView);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        if (bookList != null && position < bookList.size()) {
            Book data = bookList.get(position);
//            try {
//                URL imageUrl = new URL(data.getImageUrl());
//                Bitmap image = BitmapFactory.decodeStream(imageUrl.openConnection().getInputStream());
//                holder.image.setImageBitmap(image);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            holder.title.setText(data.getTitle());
            holder.author.setText(data.getAuthor());
            holder.date.setText(data.getDate());

        }
    }
    public void addJsonBookList(List<Book> bookList){
        this.bookList.clear();
        this.bookList.addAll(bookList);
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

}
