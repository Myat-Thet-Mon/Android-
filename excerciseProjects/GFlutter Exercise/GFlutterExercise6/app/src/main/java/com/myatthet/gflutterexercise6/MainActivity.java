package com.myatthet.gflutterexercise6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b1;
    String password = "1376";
    String name = "Mtm98";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editTxt1);
        et2 = findViewById(R.id.editTxt2);
        b1 = findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pw = et2.getText().toString();
                String nm = et1.getText().toString();
                if (pw.equals(password) && nm.equals(name) ) {
                    Toast.makeText(MainActivity.this, "Log In successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect name and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}