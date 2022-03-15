package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView textView;
    private Calculator calculator=new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);


        add=findViewById(R.id.button1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        double num1=Double.parseDouble(editText1.getText().toString());
        double num2=Double.parseDouble(editText2.getText().toString());
               double result= calculator.add(num1,num2);
               String a=Double.toString(result);
               textView.setText(a);
            }
        });
        sub=findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(editText1.getText().toString());
                double num2=Double.parseDouble(editText2.getText().toString());
                double result=calculator.sub(num1,num2);
                String a=Double.toString(result);
                textView.setText(a);
            }
        });
        mul=findViewById(R.id.button3);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(editText1.getText().toString());
                double num2=Double.parseDouble(editText2.getText().toString());
                double result=calculator.mul(num1,num2);
                String a=Double.toString(result);
                textView.setText(a);
            }
        });

        div=findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(editText1.getText().toString());
                double num2=Double.parseDouble(editText2.getText().toString());
                double result=calculator.div(num1,num2);
                String a=Double.toString(result);
                textView.setText(a);
            }
        });
    }
}