package com.example.mobileumkm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class side_bar extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_bar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home) {
                // Ganti dengan tindakan yang sesuai untuk item Home
                // Contoh: loadFragment(new HomeFragment());
            } else if (id == R.id.nav_about) {
                // Ganti dengan tindakan yang sesuai untuk item About
                // Contoh: loadFragment(new AboutFragment());
            } else if (id == R.id.nav_logout) {
                // Ganti dengan tindakan yang sesuai untuk item Logout
                // Contoh: logoutUser();
            }

            drawerLayout.closeDrawers();
            return true;
        });

        // Contoh: loadFragment(new HomeFragment()); - Load tampilan awal saat aplikasi dibuka
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    // Contoh: method logoutUser() untuk menangani logout
    private void logoutUser() {
        // Tambahkan logika logout di sini
    }
}
