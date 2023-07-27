package com.example.latihan4_dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment f = null;

            if(item.getItemId() == R.id.menu_home) {
                f = new FragmentHome();
            }
            else if(item.getItemId() == R.id.menu_cart) {
                f = new FragmentCart();
            }
            else if(item.getItemId() == R.id.menu_notification) {
                f = new FragmentNotif();
            }
            else if(item.getItemId() == R.id.menu_person) {
                f = new FragmentPerson();
            }

            assert f != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, f).commit();
            return true;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}