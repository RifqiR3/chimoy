package com.example.mobileumkm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class side_bar_header extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_bar_header);

        // Data dari intent
        String karyawan = getIntent().getStringExtra("karyawan");
        String outlet = getIntent().getStringExtra("outlet");

        TextView karyawanET = findViewById(R.id.karyawan);
        TextView outletET = findViewById(R.id.outlet);

        karyawanET.setText(karyawan);
        outletET.setText(outlet);

    }
}