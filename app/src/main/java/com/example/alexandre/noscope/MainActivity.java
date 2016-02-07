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
    boolean start=true;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();



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
    public void countdown() {
       TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(dateFormat.format(date));



    }
}


