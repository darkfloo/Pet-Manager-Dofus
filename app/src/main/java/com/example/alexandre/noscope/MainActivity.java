package com.example.alexandre.noscope;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

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
}


