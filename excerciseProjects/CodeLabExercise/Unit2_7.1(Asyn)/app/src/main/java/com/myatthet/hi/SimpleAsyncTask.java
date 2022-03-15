package com.myatthet.hi;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
    private TextView textView;

    public SimpleAsyncTask(TextView textView) {
        this.textView = textView;
    }


    @Override
    protected String doInBackground(Void... voids) {
        Random random = new Random();
        int num = random.nextInt();
        int milliSecond = num * 1000;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Awake at " + num;
    }

    @Override
    protected void onPostExecute(String result) {
        textView.setText(result);
    }
}


