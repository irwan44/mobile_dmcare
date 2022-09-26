package com.example.dmcareandroid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.dmcareandroid.Notification.ActivityNotification;
import com.example.dmcareandroid.datarsfktp.DataRSActivity;
import com.example.dmcareandroid.hssi.HssiActivity;
import com.example.dmcareandroid.peserta.PesertaanActivity;
import com.example.dmcareandroid.profile.SettingsActivity;
import com.example.dmcareandroid.raimurse.RaimurseActivity;
import com.example.dmcareandroid.scan.Scanner;

import org.jetbrains.annotations.Nullable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void transparentStatusBar() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            );
        }
        window.setStatusBarColor(Color.TRANSPARENT);
    }
    @Override
    public void onBackPressed() {
    }
    public void profile (View view) {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
    public void notiv (View view) {
        Intent intent = new Intent(MainActivity.this, ActivityNotification.class);
        startActivity(intent);
    }
    public void peserta (View view) {
        Intent intent = new Intent(MainActivity.this, PesertaanActivity.class);
        startActivity(intent);
    }
    public void raimurse (View view) {
        Intent intent = new Intent(MainActivity.this, RaimurseActivity.class);
        startActivity(intent);
    }
    public void hssi (View view) {
        Intent intent = new Intent(MainActivity.this, HssiActivity.class);
        startActivity(intent);
    }
    public void datars (View view) {
        Intent intent = new Intent(MainActivity.this, DataRSActivity.class);
        startActivity(intent);
    }
    public void scanner (View view) {
        Intent intent = new Intent(MainActivity.this, Scanner.class);
        startActivity(intent);
    }

    }

