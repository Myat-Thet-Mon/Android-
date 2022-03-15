package com.myatthet.hi;

import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class BookAsyn extends AsyncTask<String,Void,String> {

    private TextView title;
    private TextView author;

    public BookAsyn(TextView title, TextView author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.getBookInfo(strings[0]);
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
        try {
            JSONObject jsonObject=new JSONObject(result);
            
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
