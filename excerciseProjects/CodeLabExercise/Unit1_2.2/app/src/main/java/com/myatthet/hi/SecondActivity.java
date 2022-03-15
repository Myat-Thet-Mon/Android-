package com.myatthet.hi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY="com.myatthet.hi.extra_MESSAGE";
    private TextView textView;
    private EditText editText;
    private Button button;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.second_activity);
        textView=findViewById(R.id.text_message);
        editText=findViewById(R.id.editText_second);
        button=findViewById(R.id.button_second);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);
    }

    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");

    }


    public void launchMainActivity(View view){
        Intent intent=new Intent(this,SecondActivity.class);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_REPLY,message);
        startActivity(intent);
        Log.d(LOG_TAG, "End SecondActivity");


    }
}
