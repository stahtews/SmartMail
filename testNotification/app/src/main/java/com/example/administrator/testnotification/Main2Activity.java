package com.example.administrator.testnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    static TextView textView;
    static Button btnStatusChange;
    static  boolean flagOpen = false;
    static TextView textViewDateandTime;
    String currentDateTimeString;
    TextView etResponse;
    TextView tvIsConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle b = getIntent().getExtras();
        String someData = b.getString("someData");
        Log.i("DATAFROMNITIFICATION",someData);

        textView = (TextView) findViewById(R.id.statusImage);
        textViewDateandTime = (TextView) findViewById(R.id.statusdetail);

        currentDateTimeString = someData;


        textView.setBackgroundResource(R.drawable.mailboxopen);
        textViewDateandTime.setText( currentDateTimeString);


    }
}
