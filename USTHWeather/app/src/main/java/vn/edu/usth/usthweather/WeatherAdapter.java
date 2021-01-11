package vn.edu.usth.usthweather;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 3;
    private final String titles[] = new String[]{"Hanoi", "KienGiang", "HaiPhong"};

    public WeatherAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public WeatherAndForecastFragment getItem(int page) {
        switch (page) {
            case 0:
                return WeatherAndForecastFragment.newInstance(titles[0]);
            case 1:
                return WeatherAndForecastFragment.newInstance(titles[1]);
            case 2:
                return WeatherAndForecastFragment.newInstance(titles[2]);
            default:
                return new WeatherAndForecastFragment();
        }
    }
    public CharSequence getPageTiltle(int page){
        return titles[page];
    }
}
