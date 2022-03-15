package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private NotificationManager notificationManager;
    private static final String ACTION_UPDATE_NOTIFICATION = "ACTION_UPDATE_NOTIFICATION";
    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private static final int NOTIFICATION_ID = 0;
    private Button notifyButton;
    private Button updateButton;
    private Button cancelButton;
    private NotificationReceiver mReceiver = new NotificationReceiver();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();
        registerReceiver(mReceiver,
                new IntentFilter(ACTION_UPDATE_NOTIFICATION));

        notifyButton=findViewById(R.id.notifyMe);
        updateButton=findViewById(R.id.updateMe);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateNotification();
            }
        });
        cancelButton=findViewById(R.id.cancelMe);
    }

    public void createNotificationChannel() {
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID, "Hi Notification", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void sendNotification(View view) {
        Intent updateIntent = new Intent(ACTION_UPDATE_NOTIFICATION);
        PendingIntent updatePendingIntent = PendingIntent.getBroadcast(this,
                NOTIFICATION_ID, updateIntent, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder notifyBuilder = createNotifyBuilder();
        notifyBuilder.addAction(R.drawable.ic_update,
                getString(R.string.update), updatePendingIntent);
        notificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());



    }

    public NotificationCompat.Builder createNotifyBuilder() {
        NotificationCompat.Builder notifyBuilder = new NotificationCompat.Builder(this, PRIMARY_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_smile)
                .setContentTitle("Hi")
                .setContentText("Have a nice day")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setDefaults(NotificationCompat.DEFAULT_ALL);
        return notifyBuilder;
    }

    public  void updateNotification(){
        Bitmap androidImage = BitmapFactory.decodeResource(getResources(), R.drawable.mascot_1);

        NotificationCompat.Builder notifyBuilder = createNotifyBuilder();
            notifyBuilder.setSmallIcon(R.drawable.ic_update)
            .setContentTitle(null)
            .setContentText("You updated me");

        notifyBuilder.setStyle(new NotificationCompat.BigPictureStyle()
                .bigPicture(androidImage)
                .setBigContentTitle(("notification updated")));

        notificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());


    }
    public void cancelNotification(View view){
        notificationManager.cancel(NOTIFICATION_ID);
    }

    public class NotificationReceiver extends BroadcastReceiver {

        public NotificationReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            updateNotification();
        }
    }
}