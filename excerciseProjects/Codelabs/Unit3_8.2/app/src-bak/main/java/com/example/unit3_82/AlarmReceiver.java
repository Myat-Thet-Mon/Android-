//package com.example.unit3_82;
//
//import static android.content.ContentValues.TAG;
//
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//
//import androidx.core.app.NotificationCompat;
//
//public class AlarmReceiver extends BroadcastReceiver {
//    private NotificationManager mNotificationManager;
//    private static final int NOTIFICATION_ID = 0;
//    // Notification channel ID.
//    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
////        Log.d(TAG, "onReceive: alarmreceiver");
////        mNotificationManager = (NotificationManager)
////                context.getSystemService(Context.NOTIFICATION_SERVICE);
////        deliverNotification(context);
//    }
//    private void deliverNotification(Context context) {
//        // Create the content intent for the notification, which launches
//        // this activity
//        Intent contentIntent = new Intent(context, MainActivity.class);
//
//        PendingIntent contentPendingIntent = PendingIntent.getActivity
//                (context, NOTIFICATION_ID, contentIntent, PendingIntent
//                        .FLAG_UPDATE_CURRENT);
//        // Build the notification
//        NotificationCompat.Builder builder = new NotificationCompat.Builder
//                (context, PRIMARY_CHANNEL_ID)
//                .setSmallIcon(R.drawable.ic_stand_up)
//                .setContentTitle(context.getString(R.string.notification_title))
//                .setContentText(context.getString(R.string.notification_text))
//                .setContentIntent(contentPendingIntent)
//                .setPriority(NotificationCompat.PRIORITY_HIGH)
//                .setAutoCancel(true)
//                .setDefaults(NotificationCompat.DEFAULT_ALL);
//
//        // Deliver the notification
//        mNotificationManager.notify(NOTIFICATION_ID, builder.build());
//    }
//}
