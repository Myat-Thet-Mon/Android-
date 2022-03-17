package com.myatthet.hi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

public class JobSchedule extends JobService {
    private NotificationManager notificationManager;
    private static final String PRIMARY_ID="Primary_Id";
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        createNotificationChannel();
        PendingIntent contentPendingIntent = PendingIntent.getActivity
                (this, 0, new Intent(this, MainActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,PRIMARY_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText("JOb Notification")
                .setContentTitle("Do your job")
                .setDefaults(NotificationCompat.DEFAULT_ALL);
        notificationManager.notify(0,builder.build());
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public void createNotificationChannel(){
        notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=new NotificationChannel(PRIMARY_ID,"Job Service Noti",NotificationManager.IMPORTANCE_DEFAULT);
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
        }

    }
}
