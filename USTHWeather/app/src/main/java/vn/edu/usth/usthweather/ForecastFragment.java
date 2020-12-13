package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.graphics.Color;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(Color.parseColor("#20FF0000"));
        return view;
    }
}
