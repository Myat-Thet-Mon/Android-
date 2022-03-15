package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String ACTION_CUSTOM_BROADCAST=BuildConfig.APPLICATION_ID+"ACTION_CUSTOM_BROADCAST";
    private CustomBroadCastReceiver customBroadCastReceiver=new CustomBroadCastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter=new IntentFilter();
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        this.registerReceiver(customBroadCastReceiver,filter);

        LocalBroadcastManager.getInstance(this).registerReceiver(customBroadCastReceiver,new IntentFilter(ACTION_CUSTOM_BROADCAST));
    }
    public void sendCustomBroadcast(View view){
        Intent intent=new Intent(ACTION_CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(customBroadCastReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(customBroadCastReceiver);
        super.onDestroy();
    }
}