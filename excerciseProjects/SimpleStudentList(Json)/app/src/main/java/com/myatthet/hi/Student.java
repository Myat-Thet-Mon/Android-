package com.myatthet.hi;

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

public class Student {
    public static final String TAG=Student.class.getSimpleName();
    public String name;
    public String dateOfBirth;
    public String address;
    public String phNo;

    public Student(String name, String dateOfBirth, String address, String phNo) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phNo = phNo;
    }

//    public String getName() {
//        return name;
//    }

//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getPhNo() {
//        return phNo;
//    }

    public static List<Student> studentList(Resources resources) {
        InputStream inputStream = resources.openRawResource(R.raw.stludent_list);
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
        Type fileListType = new TypeToken<ArrayList<Student>>() {
        }.getType();
        return gson.fromJson(jsonProductsString, fileListType);
    }
}
