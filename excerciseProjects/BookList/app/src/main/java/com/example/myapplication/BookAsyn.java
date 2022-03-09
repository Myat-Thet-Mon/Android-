package com.example.myapplication;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BookAsyn extends AsyncTask<String, Void, String> {
    private ItemAdapter adapter;

    public BookAsyn(ItemAdapter itemAdapter) {
        this.adapter = itemAdapter;
    }

    @Override
    protected String doInBackground(String... strings) {
        NetworkUtil networkUtil=new NetworkUtil();
        return networkUtil.searchBookList(strings[0]);

    }

    @Override
    protected void onPostExecute(String result) {
        try {
            List<Book> bookList = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(result);
            JSONArray jsonArray = jsonObject.getJSONArray("items");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                String imgUrl = object.getJSONObject("volumeInfo").getJSONObject("imageLinks").getString("smallThumbnail");
                String title = object.getJSONObject("volumeInfo").getString("title");
                String author = object.getJSONObject("volumeInfo").getJSONArray("authors").join(",");
                String date = object.getJSONObject("volumeInfo").getString("publishedDate");
                Book book = new Book(imgUrl, title, author, date);
                bookList.add(book);
            }
            adapter.getBookList(bookList);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
