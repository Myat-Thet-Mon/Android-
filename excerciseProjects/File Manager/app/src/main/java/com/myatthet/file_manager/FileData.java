package com.myatthet.file_manager;

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

public class FileData {
    public static final String TAG= FileData.class.getSimpleName();
    public final int img;
    public final String name;
    public final String date ;
    public final String size;
    public final String type;

    public FileData(int img, String name, String text1, String text2, String type) {
        this.img = img;
        this.name = name;
        this.date = text1;
        this.size=text2;
        this.type = type;
    }

    public static List<FileData> fileList(Resources resources) {
        InputStream inputStream = resources.openRawResource(R.raw.file_manager);
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
        Type fileListType = new TypeToken<ArrayList<FileData>>() {
        }.getType();
        return gson.fromJson(jsonProductsString, fileListType);
    }
}
