package com.example.mobileumkm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class login_page extends AppCompatActivity {
    // Deklarasikan elemen-elemen UI, seperti outletEditText dan karyawanEditText, di sini
    private EditText outletEditText;
    private EditText karyawanEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        // Inisialisasi elemen UI, seperti outletEditText dan karyawanEditText, di sini
        outletEditText = findViewById(R.id.etUsernameReg);
        karyawanEditText = findViewById(R.id.karyawan);

        Button masukButton = findViewById(R.id.btnMasuk);
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dapatkan nilai outlet dan karyawan dari input pengguna
                String outlet = outletEditText.getText().toString();
                String karyawan = karyawanEditText.getText().toString();

                // Lakukan verifikasi outlet dan karyawan (sesuai logika aplikasi Anda)

                // Contoh sederhana verifikasi
                boolean verifikasiBerhasil = (outlet.equals("outlet yang benar") && karyawan.equals("karyawan yang benar"));

                // Jika verifikasi berhasil, pindahkan pengguna ke halaman kasir_page
                if (verifikasiBerhasil) {
                    Intent intent = new Intent(login_page.this, kasir_page.class);
                    startActivity(intent);
                }
            }
        });
    }
}