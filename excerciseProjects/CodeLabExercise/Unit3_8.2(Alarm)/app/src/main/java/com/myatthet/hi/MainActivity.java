package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private NotificationManager notificationManager;
    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private static final int NOTIFICATION_ID = 0;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent=new Intent(this,AlarmReceiver.class);
        PendingIntent pendingIntent=PendingIntent.getBroadcast
                (this, NOTIFICATION_ID, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);

        boolean alarmUp = (PendingIntent.getBroadcast(this, NOTIFICATION_ID,
                intent, PendingIntent.FLAG_NO_CREATE) != null);
        toggleButton.setChecked(alarmUp);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    long repeatInterval = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
                    long triggerTime = SystemClock.elapsedRealtime() + repeatInterval;
                    if (alarmManager != null) {
                        alarmManager.setInexactRepeating
                                (AlarmManager.ELAPSED_REALTIME_WAKEUP,
                                        triggerTime, repeatInterval,
                                        pendingIntent);
                        Toast.makeText(MainActivity.this,"Alarm On",Toast.LENGTH_SHORT).show();
                    }else {
                        notificationManager.cancelAll();
                        if (alarmManager != null) {
                            alarmManager.cancel(pendingIntent);
                        }
                        Toast.makeText(MainActivity.this,"Alarm Off",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
        createNotificationChannel();


    }
    public void createNotificationChannel() {
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID, "Hi Notification", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
            toggleButton=findViewById(R.id.alarmToggle);

        }
    }

}