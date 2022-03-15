package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.order:
                Toast.makeText(getApplicationContext(),"You selected Order.",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.status:
                Toast.makeText(getApplicationContext(),"You selected Status.",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.favourite:
                Toast.makeText(getApplicationContext(),"You selected Favourite.",Toast.LENGTH_SHORT).show();
            case R.id.contact:
                Toast.makeText(getApplicationContext(),"You seleced Contact.",Toast.LENGTH_SHORT).show();
            default:
        }
        return super.onOptionsItemSelected(item);
    }
    public void showDonut(View view){
        Toast.makeText(getApplicationContext(),"You order a donut",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,OrderActivity.class);
        startActivity(intent);
    }

    public void showIceCream(View view){
        Toast.makeText(getApplicationContext(),"You order a iceCream sandwich",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,OrderActivity.class);
        startActivity(intent);
    }
    public void showFroyo(View view){
        Toast.makeText(getApplicationContext(),"You order Froyo",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,OrderActivity.class);
        startActivity(intent);
    }

}