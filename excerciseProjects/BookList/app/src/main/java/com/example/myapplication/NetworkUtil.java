package com.example.myapplication;

import android.net.Uri;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkUtil {

    private String link = "https://www.googleapis.com/books/v1/volumes?";
    private String q = "q";

    public String searchBookList(String bookName) {
        HttpURLConnection urlConnection = null;
        String jsonString = null;

        try {
            Uri uri = Uri.parse(link).buildUpon().appendQueryParameter(q, bookName).build();
            URL requestURL = new URL(uri.toString());

            urlConnection = (HttpURLConnection) requestURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader isReader = new InputStreamReader(inputStream);

            //Creating a BufferedReader object
            BufferedReader reader = new BufferedReader(isReader);
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
            jsonString = sb.toString();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }


}
