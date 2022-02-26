package com.myatthet.whattapp;

import android.content.res.Resources;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WhatsAppData {
    public static final String TAG= WhatsAppData.class.getSimpleName();
    public final int img;
    public final String name;
    public final String text1 ;
    public final String text2;

    public WhatsAppData(int img, String name, String text1, String text2) {
        this.img = img;
        this.name = name;
        this.text1 = text1;
        this.text2=text2;
    }

    public static List<WhatsAppData> whatsAppsList(Resources resources) {
        InputStream inputStream = resources.openRawResource(R.raw.whats_app);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try{
            Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            int pointer;
            while ((pointer = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, pointer);
            }
        } catch (IOException exception) {
            Log.e(TAG, "Error writing/reading from the JSON file.", exception);

        }finally {
            try {
                inputStream.close();
            } catch (IOException exception) {
                Log.e(TAG, "Error closing the input stream.", exception);
            }
        }
        String jsonProductsString = writer.toString();
        Gson gson = new Gson();
        Type productListType = new TypeToken<ArrayList<WhatsAppData>>() {
        }.getType();
        return gson.fromJson(jsonProductsString, productListType);
    }
}
