package com.myatthet.tutorialpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText eText;
    Button btn;

    AutoCompleteTextView autocomplete;
    String[] arr = { "Paries,France", "PA,United States","Parana,Brazil",
            "Padua,Italy", "Pasadena,CA,United States"};

    //Button b1;

    ImageButton imgButton;

    CheckBox ch1,ch2;
   // Button b1,b2;

    ToggleButton tg1,tg2;
    //Button b1;

    RadioGroup rg1;
    RadioButton rb1;
   // Button b1;

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;

    Button b1;
    private ProgressDialog progress;

    private TimePicker timePicker1;
    private TextView time;
   // private String format = "";

    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //testing edit test
//        TextView txtView = (TextView) findViewById(R.id.text_id);
//        eText = (EditText) findViewById(R.id.edittext);
//        btn = (Button) findViewById(R.id.button);
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String str = eText.getText().toString();
//                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
//                msg.show();
//            }
//        });

        //Testing auto complete text
//        autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>
//                (this,android.R.layout.select_dialog_item, arr);
//        autocomplete.setThreshold(2);
//        autocomplete.setAdapter(adapter);

        //testing button
//        b1=(Button)findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
//                Toast msg = Toast.makeText(getBaseContext(),"CLICK",Toast.LENGTH_LONG);
//                msg.show();
//            }
//
//        });

        //testing image button
//        imgButton =(ImageButton)findViewById(R.id.imageButton);
//        imgButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"You download is resumed",Toast.LENGTH_LONG).show();
//            }
//        });

        //testing checkbox
//        ch1=(CheckBox)findViewById(R.id.checkBox1);
//        ch2=(CheckBox)findViewById(R.id.checkBox2);
//
//        b1=(Button)findViewById(R.id.button);
//        b2=(Button)findViewById(R.id.button2);
//        b2.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//        b1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                StringBuffer result = new StringBuffer();
//                result.append("Thanks : ").append(ch1.isChecked());
//                result.append("\nThanks: ").append(ch2.isChecked());
//                Toast.makeText(MainActivity.this, result.toString(),
//                        Toast.LENGTH_LONG).show();
//            }
//        });

        //testing toggle button
//        tg1=(ToggleButton)findViewById(R.id.toggleButton);
//        tg2=(ToggleButton)findViewById(R.id.toggleButton2);
//
//        b1=(Button)findViewById(R.id.button2);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StringBuffer result = new StringBuffer();
//                result.append("You have clicked first ON Button-:) ").append(tg1.getText());
//                result.append("You have clicked Second ON Button -:) ").append(tg2.getText());
//                Toast.makeText(MainActivity.this, result.toString(),Toast.LENGTH_SHORT).show();
//            }
//        });

        //testing radio button
//        addListenerRadioButton();
//    }
//    private void addListenerRadioButton() {
//        rg1 = (RadioGroup) findViewById(R.id.radioGroup);
//        b1 = (Button) findViewById(R.id.button2);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selected=rg1.getCheckedRadioButtonId();
//                rb1=(RadioButton)findViewById(selected);
//                Toast.makeText(MainActivity.this,rb1.getText(),Toast.LENGTH_LONG).show();
//            }
//        });


        //testing radio group
//        radioSexGroup=(RadioGroup)findViewById(R.id.radioGroup);
//
//        btnDisplay=(Button)findViewById(R.id.button);
//
//        btnDisplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selectedId=radioSexGroup.getCheckedRadioButtonId();
//                radioSexButton=(RadioButton)findViewById(selectedId);
//                Toast.makeText(MainActivity.this,radioSexButton.getText(),Toast.LENGTH_SHORT).show();
//            }
//        });


        //testing progress bar
//        b1 = (Button) findViewById(R.id.button2);
//    }
//
//    public void download(View view){
//        progress=new ProgressDialog(this);
//        progress.setMessage("Downloading Music");
//        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//        progress.setIndeterminate(true);
//        progress.setProgress(0);
//        progress.show();
//
//        final int totalProgressTime = 100;
//        final Thread t = new Thread() {
//            @Override
//            public void run() {
//                int jumpTime = 0;
//
//                while(jumpTime < totalProgressTime) {
//                    try {
//                        sleep(200);
//                        jumpTime += 5;
//                        progress.setProgress(jumpTime);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        t.start();


        //testing spinner
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//
//        // Spinner click listener
//        spinner.setOnItemSelectedListener(this);
//
//        // Spinner Drop down elements
//        List<String> categories = new ArrayList<String>();
//        categories.add("Automobile");
//        categories.add("Business Services");
//        categories.add("Computers");
//        categories.add("Education");
//        categories.add("Personal");
//        categories.add("Travel");
//
//        // Creating adapter for spinner
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
//
//        // Drop down layout style - list view with radio button
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // attaching data adapter to spinner
//        spinner.setAdapter(dataAdapter);
//    }
//
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        // On selecting a spinner item
//        String item = parent.getItemAtPosition(position).toString();
//
//        // Showing selected spinner item
//        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
//    }
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }

        //testing time picker

//        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
//        time = (TextView) findViewById(R.id.textView1);
//        calendar = Calendar.getInstance();
//
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int min = calendar.get(Calendar.MINUTE);
//        showTime(hour, min);
//    }
//
//    public void setTime(View view) {
//        int hour = timePicker1.getCurrentHour();
//        int min = timePicker1.getCurrentMinute();
//        showTime(hour, min);
//    }
//
//    public void showTime(int hour, int min) {
//        if (hour == 0) {
//            hour += 12;
//            format = "AM";
//        } else if (hour == 12) {
//            format = "PM";
//        } else if (hour > 12) {
//            hour -= 12;
//            format = "PM";
//        } else {
//            format = "AM";
//        }
//
//        time.setText(new StringBuilder().append(hour).append(" : ").append(min)
//                .append(" ").append(format));

        //testing date picker
        dateView = (TextView) findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }
}