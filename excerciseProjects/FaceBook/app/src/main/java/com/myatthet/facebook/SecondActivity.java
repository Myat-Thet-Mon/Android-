package com.myatthet.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button b1, b2, b3;
    EditText et1, et2;
    String email = "myatthet@gmail.com";
    String password = "123456";
    String phoneNo = "09778865";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et1 = findViewById(R.id.editTxt1);
        et2 = findViewById(R.id.editTxt2);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);

        String mail = et1.getText().toString();
        String pw = et2.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((mail.equals(email) || mail.equals(phoneNo)) && pw.equals(password)) {
                    Toast.makeText(SecondActivity.this, "Log in Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, "Incorrect mail and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}