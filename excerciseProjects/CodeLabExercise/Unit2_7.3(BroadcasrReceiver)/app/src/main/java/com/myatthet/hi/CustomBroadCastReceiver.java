package com.myatthet.hi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadCastReceiver extends BroadcastReceiver {
    public static final String ACTION_CUSTOM_BROADCAST=BuildConfig.APPLICATION_ID+"ACTION_CUSTOM_BROADCAST";
    @Override
    public void onReceive(Context context, Intent intent) {
    String intentAction=intent.getAction();
    switch (intentAction){
        case Intent.ACTION_POWER_CONNECTED:
            Toast.makeText(context,"Power is connected",Toast.LENGTH_SHORT).show();break;
        case Intent.ACTION_POWER_DISCONNECTED:
            Toast.makeText(context,"Power is disconnected",Toast.LENGTH_SHORT).show();break;
        case ACTION_CUSTOM_BROADCAST:
            Toast.makeText(context,"Custom BroadCast",Toast.LENGTH_SHORT).show();break;
    }
    }
}
