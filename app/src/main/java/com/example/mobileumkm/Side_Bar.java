package com.example.mobileumkm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
public class Side_Bar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar; // Tambah referensi toolbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_bar);

        Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi toolbar
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav,
                R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new kasir_frag()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
            setToolbarTitle("Kasir"); // set judul toolbar awal
        }
    }

    // set judul toolbar awal
    private void setToolbarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if  (id == R.id.nav_home){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new kasir_frag()).commit();
            setToolbarTitle("Kasir");
            return  true;
        }

        if  (id == R.id.nav_shop){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new kasir_frag()).commit();
            setToolbarTitle("Kasir");
            return  true;
        }

        if  (id == R.id.nav_history){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HistoryFragment()).commit();
            setToolbarTitle("Riwayat");
            return  true;
        }

        if  (id == R.id.nav_money){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MoneyFragment()).commit();
            setToolbarTitle("Laporan Keuangan");
            return  true;
        }

        if  (id == R.id.nav_box){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProductFragment()).commit();
            setToolbarTitle("Kasir");
            return  true;
        }

        if  (id == R.id.nav_logout){
            Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show();
            return  true;
        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}