package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private String sharedPrefFile = "sharedPrefFile";

    private int count = 0;
    private int color;
    private TextView countTextView;

    private final String COUNT_KEY = "count";
    private final String COLOR_KEY = "color";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextView = findViewById(R.id.count_textview);
//        color = ContextCompat.getColor(this, R.color.white);
//        sharedPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
//        count = sharedPreferences.getInt(COUNT_KEY, 0);
//        countTextView.setText(String.format("%s", count));
//        color = sharedPreferences.getInt(COLOR_KEY, color);
//        countTextView.setBackgroundColor(color);

    }

    public void changeBackground(View view) {
        int color = ((ColorDrawable) view.getBackground()).getColor();
        countTextView.setBackgroundColor(color);
        color = color;
    }

    public void countUp(View view) {
        count++;
        countTextView.setText(String.format("%s", count));
    }

    public void reset(View view) {
        count = 0;
        countTextView.setText(String.format("%s", count));
        color = ContextCompat.getColor(this, R.color.white);
        countTextView.setBackgroundColor(color);

        SharedPreferences.Editor preferencesEditor = sharedPreferences.edit();
        preferencesEditor.clear();
        preferencesEditor.apply();
    }

    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor preferencesEditor = sharedPreferences.edit();
        preferencesEditor.putInt(COUNT_KEY, count);
        preferencesEditor.putInt(COLOR_KEY, color);
        preferencesEditor.apply();
    }
}