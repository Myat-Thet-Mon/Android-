package com.example.studentlist_dao;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface StudentDao {

    LiveData<List<StudentEntity>> getAlphabetizedWords();

    void insert(StudentEntity student);

    void deleteAll();
}
