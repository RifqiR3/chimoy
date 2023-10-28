package com.example.mobileumkm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
public class MoneyFragment extends Fragment {
    private CardView cardViewHariIni;
    private CardView cardViewMingguIni;
    private CardView cardViewBulanIni;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_laporan_keuangan_page, container, false);

        cardViewHariIni = view.findViewById(R.id.cardViewHariIni);
        cardViewMingguIni = view.findViewById(R.id.cardViewMingguIni);
        cardViewBulanIni = view.findViewById(R.id.cardViewBulanIni);

        cardViewHariIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewHariIni.setCardBackgroundColor(getResources().getColor(R.color.kuningJadi));
                cardViewMingguIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
                cardViewBulanIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
            }
        });

        cardViewMingguIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewHariIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
                cardViewMingguIni.setCardBackgroundColor(getResources().getColor(R.color.kuningJadi));
                cardViewBulanIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
            }
        });

        cardViewBulanIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewHariIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
                cardViewMingguIni.setCardBackgroundColor(getResources().getColor(R.color.kuningPucat));
                cardViewBulanIni.setCardBackgroundColor(getResources().getColor(R.color.kuningJadi));
            }
        });

        return view;
    }
}