package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView team1Score;
    private TextView team2Score;
    private int team1=0;
    private int team2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1Score=findViewById(R.id.team1Score);
        team2Score=findViewById(R.id.team2Score);
    }
//    public void onClick(View view){
//
//        switch (view.getId()){
//            case R.id.team1Plus:
//                team1Score.setText(team1++);break;
//            case R.id.team1Minus:
//                team1Score.setText(team1--);break;
//                case R.id.team2Plus:
//                team2Score.setText(team2++);break;
//            case R.id.team2Minus:
//                team2Score.setText(team2--);break;
//            default:break;
//        }
//    }
public void increaseScore(View view){
    switch (view.getId()){

        case R.id.team1Plus:
            team1Score.setText(String.valueOf(++team1));
            break;
        case R.id.team2Plus:
            team2Score.setText(String.valueOf(++team2));
            break;
        default:break;
    }
}

    public void decreaseScore(View view){
        switch (view.getId()){

            case R.id.team1Minus:
                team1Score.setText(String.valueOf(--team1));
                break;
            case R.id.team2Minus:
                team2Score.setText(String.valueOf(--team2));
                break;
            default:break;
        }
    }
}