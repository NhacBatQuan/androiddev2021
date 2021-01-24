package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Created", "onCreate");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        PagerAdapter adapter = new WeatherAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        tabLayout.setupWithViewPager(pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
    }
}
