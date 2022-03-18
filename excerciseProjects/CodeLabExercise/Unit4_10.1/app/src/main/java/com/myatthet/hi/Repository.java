package com.myatthet.hi;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class Repository {
    private DAO wordDao;
    private LiveData<List<Entity>> allWords;

    public Repository(Application application){
        allWords=wordDao.getAllWords();
    }
    LiveData<List<Entity>> getAllWords(){
        return allWords;
    }

    public void insert(Entity word){
        new insertAsyncTask(wordDao).execute(word);

    }

    private static class insertAsyncTask extends AsyncTask<Entity, Void, Void> {

        private DAO mAsyncTaskDao;

        insertAsyncTask(DAO dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Entity... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }

    }
}
