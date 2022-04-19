package com.example.project_tra_sua.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.example.project_tra_sua.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Home extends AppCompatActivity {
    public static ChipNavigationBar chipNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        chipNavigationBar = findViewById(R.id.menu);
        chipNavigationBar.setItemSelected(R.id.home, true);
        bottommenu();
    }
    private void bottommenu() {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.home:
                        Navigation.findNavController(Home.this, R.id.nav_host_fragment_content_main).navigate(R.id.trang_chu);
                        break;
                    case R.id.gio_hang:
                        Navigation.findNavController(Home.this, R.id.nav_host_fragment_content_main).navigate(R.id.gio_hang2);
                        break;
                    case R.id.tai_khoan:
                        Navigation.findNavController(Home.this, R.id.nav_host_fragment_content_main).navigate(R.id.tai_khoan2);
                        break;

                }
            }
        });
    }
}