package com.myatthet.tutorialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton1, toggleButton2;
    private Button buttonSubmit;
    CheckBox pizza,coffe,burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        //Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
      //  addListenerOnButtonClick();

        //testing custom toast

       //Creating the LayoutInflater instance
//        LayoutInflater li = getLayoutInflater();
//        //Getting the View object as defined in the customtoast.xml file
//        View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));
//        //Creating the Toast object
//        Toast toast = new Toast(getApplicationContext());
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//        toast.setView(layout);//setting the view of custom toast layout
//        toast.show();

        //testing check box
       // addListenerOnButtonClick();

        //testing activity cycle
       // Log.d("lifecycle","onCreate invoked");
        //onStart();
        //onPause();
       // onRestart();
        //onDestroy();
        onStop();
    }


//Testing Toggle Button
//    public void addListenerOnButtonClick() {
//        //Getting the ToggleButton and Button instance from the layout xml file
//        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
//        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
//        buttonSubmit = (Button) findViewById(R.id.button);
//
//        //Performing action on button click
//        buttonSubmit.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                StringBuilder result = new StringBuilder();
//                result.append("ToggleButton1 : ").append(toggleButton1.getText());
//                result.append("\nToggleButton2 : ").append(toggleButton2.getText());
//                //Displaying the message in toast
//                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
//            }
//
//        });
//
//    }

    // testing checkbox

//    public void addListenerOnButtonClick(){
//        //Getting instance of CheckBoxes and Button from the activty_main.xml file
//        pizza=(CheckBox)findViewById(R.id.checkBox);
//        coffe=(CheckBox)findViewById(R.id.checkBox2);
//        burger=(CheckBox)findViewById(R.id.checkBox3);
//        buttonOrder=(Button)findViewById(R.id.button);
//
//        //Applying the Listener on the Button click
//        buttonOrder.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                int totalamount=0;
//                StringBuilder result=new StringBuilder();
//                result.append("Selected Items:");
//                if(pizza.isChecked()){
//                    result.append("\nPizza 100Rs");
//                    totalamount+=100;
//                }
//                if(coffe.isChecked()){
//                    result.append("\nCoffe 50Rs");
//                    totalamount+=50;
//                }
//                if(burger.isChecked()){
//                    result.append("\nBurger 120Rs");
//                    totalamount+=120;
//                }
//                result.append("\nTotal: "+totalamount+"Rs");
//                //Displaying the message on the toast
//                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
//            }
//
//        });
//    }

    //testing activity cycle

    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }

}
