package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE="com.myatthet.hi.extra_MESSAGE";
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        textView=findViewById(R.id.text_message_reply);
        editText=findViewById(R.id.editText_main);
        button=findViewById(R.id.button_main);
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


    public void launchSecondActivity(View view){
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent=new Intent(this,SecondActivity.class);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }


}