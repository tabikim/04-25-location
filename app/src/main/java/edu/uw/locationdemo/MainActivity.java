package edu.uw.locationdemo;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LOCATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //show the given location on the screen
    public void displayLocation(Location location){
        ((TextView) findViewById(R.id.txt_lat)).setText("" + location.getLatitude());
        ((TextView) findViewById(R.id.txt_lng)).setText("" + location.getLongitude());
    }



}
