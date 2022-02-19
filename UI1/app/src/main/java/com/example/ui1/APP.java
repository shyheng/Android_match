package com.example.ui1;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.ui1.ui.g.MainActivity;
import com.example.ui1.ui.inde.IndexActivity;

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences sharedPreferences = getSharedPreferences("index",MODE_PRIVATE);

        if (sharedPreferences.getBoolean("i",false)){
            startActivity(new Intent(getApplicationContext(), IndexActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }else {
            sharedPreferences.edit().putBoolean("i",true).commit();
            startActivity(new Intent(getApplicationContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }

    }
}
