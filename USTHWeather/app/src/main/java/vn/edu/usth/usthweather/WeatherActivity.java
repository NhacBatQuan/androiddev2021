package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Created","onCreate");
        ForecastFragment firstFrag = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,firstFrag,null).commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume","onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause" ,"onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop","onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy","onDestroy: ");
    }
}
