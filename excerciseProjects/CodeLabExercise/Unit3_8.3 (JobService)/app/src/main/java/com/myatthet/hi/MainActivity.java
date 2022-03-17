package com.myatthet.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int JOB_ID = 0;
    private JobScheduler jobScheduler;
    private Switch idleSwitch;
    private Switch chargingSwitch;
    private SeekBar seekBar;
    private TextView seekbarProgress;
    private RadioGroup networkOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idleSwitch=findViewById(R.id.idleSwitch);
        chargingSwitch=findViewById(R.id.chargingSwitch);
        seekBar=findViewById(R.id.seekBar);
        seekbarProgress=findViewById(R.id.seekBarProgress);
        jobScheduler=(JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        networkOption=findViewById(R.id.networkOptions);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i > 0) {
                    seekbarProgress.setText(getString(R.string.seconds, i));
                } else {
                    seekbarProgress.setText("Not set");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }
    public void scheduleJob(View view){
        int selectedNetworkID = networkOption.getCheckedRadioButtonId();
        int selectedNetworkOption = JobInfo.NETWORK_TYPE_NONE;
        int seekBarProgressInt=seekBar.getProgress();
        boolean seekBarSet = seekBarProgressInt > 0;
        switch (selectedNetworkID){
            case R.id.anyNetwork:
                selectedNetworkOption=JobInfo.NETWORK_TYPE_ANY;
                break;
            case R.id.noNetwork:
                selectedNetworkOption=JobInfo.NETWORK_TYPE_NONE;
                break;
            case R.id.wifiNetwork:
                selectedNetworkOption=JobInfo.NETWORK_TYPE_UNMETERED;
                break;
        }

        ComponentName serviceName = new ComponentName(getPackageName(), JobSchedule.class.getName());
        JobInfo.Builder builder = new JobInfo.Builder(JOB_ID, serviceName)
                .setRequiredNetworkType(selectedNetworkOption)
                .setRequiresDeviceIdle(idleSwitch.isChecked())
                .setRequiresCharging(chargingSwitch.isChecked());
        if (seekBarSet) {
            builder.setOverrideDeadline(seekBarProgressInt * 1000);
        }
        boolean constraintSet = selectedNetworkOption
                != JobInfo.NETWORK_TYPE_NONE
                || chargingSwitch.isChecked()
                || idleSwitch.isChecked()
                || seekBarSet;
        if(constraintSet){
            JobInfo jobInfo=builder.build();
            jobScheduler.schedule(jobInfo);
            Toast.makeText(this, R.string.job_scheduled, Toast.LENGTH_SHORT)
                    .show();
        }else{
            Toast.makeText(this,"No constrain", Toast.LENGTH_SHORT).show();
        }
    }
    public void cancelJobs(View view) {

        if (jobScheduler != null) {
            jobScheduler.cancelAll();
            jobScheduler = null;
            Toast.makeText(this, "Cancel Job", Toast.LENGTH_SHORT).show();
        }
    }

}