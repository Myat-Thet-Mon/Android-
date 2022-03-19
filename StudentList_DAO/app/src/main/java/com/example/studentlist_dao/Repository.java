package com.example.studentlist_dao;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Repository {
    private StudentDao studentDao;
    private LiveData<List<StudentEntity>> studentList;

    public Repository(Application application) {
        this.studentDao = studentDao;
        this.studentList = studentList;
    }
}
