package com.example.mobileumkm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;
import com.example.mobileumkm.Adapter.AdapterMenu;
import com.example.mobileumkm.Adapter.GetDataProduk;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;


public class kasir_page extends AppCompatActivity {
    FloatingActionButton tambah;
    AdapterMenu adapterMenu;
    ArrayList<GetDataProduk> model;
    RecyclerView tv_listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasir_page);

        tambah = findViewById(R.id.btn_tambahdata);
        tv_listmenu = findViewById(R.id.tv_listmenu);
        load_data();
        AdapterMenu adapterMenu = new AdapterMenu(getApplicationContext(), model);
        tv_listmenu.setAdapter(adapterMenu);

    }
    void load_data(){
        model = new ArrayList<>();
        for(int i=0; i<=30; i++){
            model.add(new GetDataProduk("chimoy" +i, R.drawable.img, "5000"));

        }
    }
}