package com.myatthet.hi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.myattet.hi.extra.MESSAGE";

    private TextView textView1;
    private EditText editText1;
    private Button button1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textView1=findViewById(R.id.textView2);
        editText1=findViewById(R.id.editText2);
        button1=findViewById(R.id.button2);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView1.setText(message);

    }
    public void replyToMainActivity(View view){
        Intent intent=new Intent(this,MainActivity.class);
        String message=editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}

