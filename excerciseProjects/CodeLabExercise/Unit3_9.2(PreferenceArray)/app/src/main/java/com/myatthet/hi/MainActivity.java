package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "extra.MESSAGE";
    private String orderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, orderMessage);
                startActivity(intent);
            }
        });
        PreferenceManager.setDefaultValues(this,
                R.xml.pref_general, false);
        PreferenceManager.setDefaultValues(this,
                R.xml.pref_notification, false);
        PreferenceManager.setDefaultValues(this,
                R.xml.pref_account, false);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String marketPref = sharedPref.getString("sync_frequency", "-1");
        displayToast(marketPref);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_order:
                Intent intent = new Intent(MainActivity.this,
                        OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, orderMessage);
                startActivity(intent);
                return true;
            case R.id.action_settings:
                Intent settingsIntent = new Intent(this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                return true;
            case R.id.action_favorites:
                displayToast(getString(R.string.action_favorites_message));
                return true;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                return true;
            default:
                // Do nothing
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void showDonutOrder(View view) {
        orderMessage = getString(R.string.donut_order_message);
        displayToast(orderMessage);
    }
    public void showIceCreamOrder(View view) {
        orderMessage = getString(R.string.ice_cream_order_message);
        displayToast(orderMessage);
    }
    public void showFroyoOrder(View view) {
        orderMessage = getString(R.string.froyo_order_message);
        displayToast(orderMessage);
    }
}