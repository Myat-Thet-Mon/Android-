package com.myatthet.hi;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.MenuItem;

public class NotificationPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_notification);
        setHasOptionsMenu(true);
        SettingsActivity.bindPreferenceSummaryToValue(findPreference("notifications_new_message_ringtone"));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==android.R.id.home){
            startActivity(new Intent(getActivity(),SettingsActivity.class));
        return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
