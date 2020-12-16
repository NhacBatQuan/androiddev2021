package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(Color.WHITE);
        LinearLayout liLay = view.findViewById(R.id.lilay);
        liLay.setOrientation(LinearLayout.VERTICAL);
        TextView tevi = new TextView(getContext());
        tevi.setText("Thursday");
        ImageView imvi = new ImageView(getContext());
        imvi.setImageResource(R.drawable.nuppercase_hat);
        liLay.addView(tevi);
        liLay.addView(imvi);
        return view;
    }
}
