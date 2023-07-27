package com.example.latihan4_dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

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

        final TextView pilih_menu = findViewById(R.id.pilih_menu);
        Button btn_klik_bayar = findViewById(R.id.btn_klik_bayar);
        final TextView bayar_menu = findViewById(R.id.bayar_menu);

        btn_klik_bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String menu = pilih_menu.getText().toString();
                bayar_menu.setText("Bayar: " + menu);
            }
        });

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}