package com.example.mobileumkm;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.widget.TextView;

import android.os.Bundle;

public class laporan_keuangan_page extends AppCompatActivity {

    private CardView cardViewHariIni;
    private CardView cardViewMingguIni;
    private CardView cardViewBulanIni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan_keuangan_page);

        cardViewHariIni = findViewById(R.id.cardViewHariIni);
        cardViewMingguIni = findViewById(R.id.cardViewMingguIni);
        cardViewBulanIni = findViewById(R.id.cardViewBulanIni);

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
    }
}