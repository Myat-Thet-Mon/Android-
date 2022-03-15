package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE="com.myattet.hi.extra.MESSAGE";
private TextView textView;
private EditText editText;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        Intent intent=getIntent();
        String replyString=intent.getStringExtra(SecondActivity.EXTRA_MESSAGE);
        textView.setText(replyString);

    }
    public void sendToSecondActivity(View view){
        Intent intent=new Intent(this,SecondActivity.class);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }

}