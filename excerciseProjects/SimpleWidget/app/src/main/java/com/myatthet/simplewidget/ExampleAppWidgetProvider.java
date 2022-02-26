package com.myatthet.simplewidget;

import static com.myatthet.simplewidget.ExampleAppWidgetConfig.KEY_BUTTON_TEXT;
import static com.myatthet.simplewidget.ExampleAppWidgetConfig.SHARED_PRES;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;

public class ExampleAppWidgetProvider extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId:appWidgetIds){
            Intent intent=new Intent(context,MainActivity.class);
            PendingIntent pendingIntent=PendingIntent.getActivity(context,0,intent,0);
            SharedPreferences prefs=context.getSharedPreferences(SHARED_PRES,Context.MODE_PRIVATE);
            String  buttonText=prefs.getString(KEY_BUTTON_TEXT+appWidgetId,"Press Me");

            RemoteViews remoteViews=new RemoteViews(context.getPackageName(),R.layout.example_layout);
            remoteViews.setOnClickPendingIntent(R.id.example_widget_button,pendingIntent);
            remoteViews.setCharSequence(R.id.example_widget_button,"set Text",buttonText);
            appWidgetManager.updateAppWidget(appWidgetId,remoteViews);
        }
    }
}
