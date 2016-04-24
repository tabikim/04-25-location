package edu.uw.locationdemo;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_get_loc:
                Log.v(TAG, "Get location");

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
