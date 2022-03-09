package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;


import com.myatthet.hi.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private NotificationManager notificationManager;
    private static final int NOTIFICATION_ID = 0;
    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel3";
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.wish);
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent notifyIntent = new Intent(this, AlarmReceiver.class);
        PendingIntent notifyPendingIntent = PendingIntent.getBroadcast
                (this, NOTIFICATION_ID, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        MainActivity context = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                long repeatInterval = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
//                long triggerTime = SystemClock.elapsedRealtime()
//                        + repeatInterval;
//                if (alarmManager != null) {
//                    alarmManager.setInexactRepeating
//                            (AlarmManager.ELAPSED_REALTIME_WAKEUP,
//                                    triggerTime, repeatInterval, notifyPendingIntent);
//                }
                context.deliverNotification(context);
            }
        });

        createNotificationChannel();

    }

    public void createNotificationChannel() {
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel
                    (PRIMARY_CHANNEL_ID, "Wish Me notification", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Make a wish");
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
//    private void sendNotification(Context context){
//        Date date= Calendar.getInstance().getTime();
//        DateFormat dateFormat=new SimpleDateFormat("hh:mm");
//        String strDate=dateFormat.format(date);
//        Intent intent=new Intent(context,MainActivity.class);
//        PendingIntent pendingIntent=PendingIntent.getActivity
//                (context,NOTIFICATION_ID,intent,PendingIntent.FLAG_UPDATE_CURRENT);
//        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,PRIMARY_CHANNEL_ID)
//               .setSmallIcon(R.drawable.ic_wish)
//                .setContentTitle("Make a wish")
////        Date date = Calendar.getInstance().getTime();
////        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
////        String strDate = dateFormat.format(date);
//                .setContentText(strDate)
//                .setContentIntent(pendingIntent)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                .setAutoCancel(true)
//                .setDefaults(NotificationCompat.DEFAULT_ALL);
//        notificationManager.notify(NOTIFICATION_ID,builder.build());
//    }

    private void deliverNotification(Context context) {

                Date date= Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("hh:mm");
        String strDate=dateFormat.format(date);
        Intent intent=new Intent(context,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity
                (context,NOTIFICATION_ID,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,PRIMARY_CHANNEL_ID)
               .setSmallIcon(R.drawable.ic_wish)
                .setContentTitle("Make a wish")
//        Date date = Calendar.getInstance().getTime();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        String strDate = dateFormat.format(date);
                .setContentText(strDate)
                .setContentIntent(pendingIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);
        notificationManager.notify(NOTIFICATION_ID,builder.build());
    }

}