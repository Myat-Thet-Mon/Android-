package com.myatthet.hi;

import android.net.Uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private static final String BOOK_URL = "https://www.googleapis.com/books/v1/volumes?";
    private static final String search_key = "q";
    private static final String max_result = "maxResults";
    private static final String search_type = "printType";

    public static String getBookInfo(String bookString) {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String bookJSONString = null;
        try {
            Uri uri=Uri.parse(BOOK_URL).buildUpon()
                    .appendQueryParameter(search_key,bookString)
                    .appendQueryParameter(max_result,"10")
                    .appendQueryParameter(search_type,"books")
                    .build();
            URL requestURL = new URL(uri.toString());

            urlConnection = (HttpURLConnection) requestURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream=urlConnection.getInputStream();
            reader=new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }

            if (builder.length() == 0) {
                return null;
            }

            bookJSONString = builder.toString();

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bookJSONString;
    }


}
