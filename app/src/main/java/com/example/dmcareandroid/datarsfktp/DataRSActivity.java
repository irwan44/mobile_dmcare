package com.example.dmcareandroid.datarsfktp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.dmcareandroid.MainActivity;
import com.example.dmcareandroid.Notification.ActivityNotification;
import com.example.dmcareandroid.R;

public class DataRSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_rsactivity);
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
    public void closenotiv (View view) {
        Intent intent = new Intent(DataRSActivity.this, MainActivity.class);
        startActivity(intent);
    }
}