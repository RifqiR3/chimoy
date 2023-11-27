package com.example.mobileumkm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TambahMenu extends AppCompatActivity {
    EditText ed_addmenu, ed_addharga;
    ImageView iv_addimage;
    Button btn_choseimage, btn_menubaru;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_menu);

        ed_addmenu = findViewById(R.id.ed_addmenu);
        ed_addharga = findViewById(R.id.ed_addharga);
        iv_addimage = findViewById(R.id.iv_addimage);
        btn_choseimage = findViewById(R.id.btn_choseimage);
        btn_menubaru = findViewById(R.id.btn_menubaru);

        btn_menubaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNama_menu = ed_addmenu.getText().toString().trim();
                String getNama_gambar = "url_gambar_anda"; // Gantilah dengan URL gambar yang benar
                String getHarga_menu = ed_addharga.getText().toString().trim();

                if(getNama_menu.isEmpty()){
                    ed_addmenu.setError("Masukkan nama menu baru");
                }else if(getHarga_menu.isEmpty()){
                    ed_addharga.setError("Harga menu belum di tentukan");
                }else {
                    database.child("Menu").push().setValue(new ModelMenu(getNama_menu, getNama_gambar, getHarga_menu)).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(TambahMenu.this, "Data behasil ditambahkan", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(TambahMenu.this, kasir_page.class));
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(TambahMenu.this, "Gagal menambahkan menu!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }
}