package com.example.ui1.ui.inde;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ui1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);
    }

    long time = 0;

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis()-time > 2000){
            Toast.makeText(getApplicationContext(),"退出",Toast.LENGTH_SHORT).show();
            time = System.currentTimeMillis();
        }else {
            finish();
            System.exit(0);
        }
    }
}