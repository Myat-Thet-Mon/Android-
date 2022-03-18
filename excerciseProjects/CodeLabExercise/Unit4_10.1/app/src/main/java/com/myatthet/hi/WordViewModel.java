package com.myatthet.hi;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private Repository repository;
    private LiveData<List<Entity>> wordList;

    public WordViewModel(@NonNull Application application) {
        super(application);
        this.repository=new Repository(application);
        wordList=repository.getAllWords();
    }

    LiveData<List<Entity>> getWordList(){
        return wordList;
    }

    public void insert(Entity word){
        repository.insert(word);
    }
}
