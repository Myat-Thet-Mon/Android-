package com.myat.android.bookapi;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BookAsyn extends AsyncTask<String, Void, String> {
    private BookAdapter bookAdapter;
    public BookAsyn(BookAdapter bookAdapter){
        this.bookAdapter=bookAdapter;
    }
    @Override
    protected String doInBackground(String... strings) {
        NetworkUtil networkUtil = new NetworkUtil();
        return networkUtil.searchBookList(strings[0]);
    }

    @Override
    protected void onPostExecute(String result) {

        try {
            List<Book> bookList = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(result);
            JSONArray itemArray = jsonObject.getJSONArray("items");
            for (int i = 0; i < itemArray.length(); i++) {
                JSONObject bookJson = itemArray.getJSONObject(i);

                String title = bookJson.getJSONObject("volumeInfo").getString("title");
                String authors = bookJson.getJSONObject("volumeInfo").getJSONArray("authors").join(",");
                String date = bookJson.getJSONObject("volumeInfo").getString("publishedDate");
                String imageUrl = bookJson.getJSONObject("volumeInfo").getJSONObject("imageLinks").getString("smallThumbnail");
                Book book = new Book(imageUrl, title, authors, date);
                bookList.add(book);
            }
        bookAdapter.addJsonBookList(bookList);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
