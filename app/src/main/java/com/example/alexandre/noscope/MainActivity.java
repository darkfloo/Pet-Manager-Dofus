package com.example.alexandre.noscope;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    boolean start=true;
    public void chro(View view) {

                if( start==true) {
                    startchro(view);


                }
                else if(start==false){
                    stopchro(view);
                }


    }


   public void startchro(View view) {
        ((Chronometer) findViewById(R.id.chronometer0)).start();
        start=false;
    }

    public void stopchro(View view) {
        ((Chronometer) findViewById(R.id.chronometer0)).stop();
        start=true;
    }
    */
   public void countdown(View view) {

       TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(R.string.essai1);



    }
}


