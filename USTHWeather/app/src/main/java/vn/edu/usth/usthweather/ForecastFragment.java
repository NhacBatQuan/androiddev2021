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
        view.setBackgroundColor(Color.parseColor("#FFFFFF"));
        LinearLayout liLay = view.findViewById(R.id.lilay);
        liLay.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 7; i++) {
            LinearLayout.LayoutParams layliparams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, 100);
            layliparams.setMargins(40, 20, 40, 20);
            LinearLayout.LayoutParams teviParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,2f);
            LinearLayout.LayoutParams imviParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,2f);
            LinearLayout.LayoutParams texviParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,1f);
            LinearLayout layli = new LinearLayout(getContext());
            layli.setOrientation(LinearLayout.HORIZONTAL);
            liLay.addView(layli,layliparams);
            TextView tevi = new TextView(getContext());
            tevi.setText("Thursday");
            TextView texvi = new TextView(getContext());
            texvi.setText("Sunny\n35C");
            ImageView imvi = new ImageView(getContext());
            imvi.setImageResource(R.drawable.nuppercase_hat);
            layli.addView(tevi,teviParams);
            layli.addView(imvi,imviParams);
            layli.addView(texvi,texviParams);
        }
        return view;
    }
}
