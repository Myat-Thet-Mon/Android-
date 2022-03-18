package com.myatthet.hi;

import androidx.lifecycle.LiveData;

import java.util.List;


public interface DAO {
    void insert(Entity word);
    void deleteAll();
    LiveData<List<Entity>>getAllWords();
}
