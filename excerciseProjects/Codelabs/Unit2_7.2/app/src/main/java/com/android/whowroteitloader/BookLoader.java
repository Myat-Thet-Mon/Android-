package com.android.whowroteitloader;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {
    private String mQueryString;


    public BookLoader(@NonNull Context context,String queryString) {
        super(context);
        this.mQueryString=queryString;
    }


    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        super.forceLoad();
    }
}
