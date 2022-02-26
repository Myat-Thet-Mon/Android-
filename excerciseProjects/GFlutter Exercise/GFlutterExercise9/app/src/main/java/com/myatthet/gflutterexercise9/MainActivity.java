package com.myatthet.gflutterexercise9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    TextView tv;
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb=findViewById(R.id.pgb);
        tv=findViewById(R.id.txt);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                startProgress();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
        thread.start();;
    }

    int i=0;
    private void startProgress() {
        for(i=0;i<100;i++){
            try {
                Thread.sleep(50);
                pb.setProgress(i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tv.setText(String.valueOf(i +" %"));
                }
            });
        }
    }
}