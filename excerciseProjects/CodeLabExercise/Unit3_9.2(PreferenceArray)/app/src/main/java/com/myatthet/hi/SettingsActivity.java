package com.myatthet.hi;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.text.TextUtils;
import android.view.MenuItem;

import androidx.core.app.NavUtils;

import java.util.List;

public class SettingsActivity extends AppCompatPreferenceActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item){
        int id=item.getItemId();
        if(id==android.R.id.home){
            if(!super.onMenuItemSelected(featureId,item)){
                NavUtils.navigateUpFromSameTask(this);
            }
            return true;
        }
        return super.onMenuItemSelected(featureId,item);
    }

    @Override
    public void onBuildHeaders(List<Header> target){
        loadHeadersFromResource(R.xml.pref_headers,target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName){
        return PreferenceFragment.class.getName().equals(fragmentName)
                || GeneralPreferenceFragment.class.getName().equals(fragmentName)
                ||DataSyncPreferenceFragment.class.getName().equals(fragmentName)
                ||NotificationPreferenceFragment.class.getName().equals(fragmentName);
    }

    private static Preference.OnPreferenceChangeListener bindPreferenceSummaryToValueListener=
            new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object o) {
                    String stringValue=o.toString();

                    if(preference instanceof ListPreference){
                        ListPreference listPreference=(ListPreference) preference;
                        int index= listPreference.findIndexOfValue(stringValue);
                        preference.setSummary(index>=0 ? listPreference.getEntries()[index]:null);

                    } else if (preference instanceof RingtonePreference) {
                        if (TextUtils.isEmpty(stringValue)) {
                            preference.setSummary(R.string.pref_ringtone_silent);

                        } else {
                            Ringtone ringtone = RingtoneManager.getRingtone(
                                    preference.getContext(), Uri.parse(stringValue));

                            if (ringtone == null) {
                                preference.setSummary(null);
                            } else {
                                String name = ringtone.getTitle(preference.getContext());
                                preference.setSummary(name);
                            }
                        }

                    } else {
                        preference.setSummary(stringValue);
                    }
                    return true;
                }
            };
    public static void bindPreferenceSummaryToValue(Preference preference){
        preference.setOnPreferenceChangeListener(bindPreferenceSummaryToValueListener);
        bindPreferenceSummaryToValueListener.onPreferenceChange(preference, PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(),""));

    }
}
