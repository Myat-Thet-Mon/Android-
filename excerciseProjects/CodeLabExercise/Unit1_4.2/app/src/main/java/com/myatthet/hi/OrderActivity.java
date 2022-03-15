package com.myatthet.hi;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }
    public void buttonClick(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.messengerService:
                Toast.makeText(getApplicationContext(),"You choose Same day messenger service",Toast.LENGTH_SHORT).show();
                break;
            case R.id.groundDeli:
                Toast.makeText(getApplicationContext(),"You choose Next day ground delivery",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pickUp:
                Toast.makeText(getApplicationContext(),"You choose pick up",Toast.LENGTH_SHORT).show();
                break;
            default:break;
        }
    }
}
