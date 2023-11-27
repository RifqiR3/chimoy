package com.example.mobileumkm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class kasir_page extends AppCompatActivity {
    FloatingActionButton tambah;
    AdapterMenu adapterMenu;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    ArrayList<ModelMenu> listMneu;
    RecyclerView tv_listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasir_page);

        tambah = findViewById(R.id.btn_tambahdata);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kasir_page.this, TambahMenu.class));
            }
        });
        tv_listmenu = findViewById(R.id.tv_listmenu);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        tv_listmenu.setLayoutManager(mLayout);
        tv_listmenu.setItemAnimator(new DefaultItemAnimator());

        tampilData();
    }

    private void tampilData() {
        database.child("Menu").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listMneu = new ArrayList<>();
                for (DataSnapshot item : snapshot.getChildren()){
                    ModelMenu menu = item.getValue(ModelMenu.class);
                    menu.setKey(item.getKey());
                    listMneu.add(menu);
                }
                adapterMenu = new AdapterMenu(listMneu, kasir_page.this);
                tv_listmenu.setAdapter(adapterMenu);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}

