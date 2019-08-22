package com.example.soaldataintentwithsplash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashIntiMain extends AppCompatActivity {
    // 5000 = 5 sec

    private int waktu_loading = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(SplashIntiMain.this, MainHomeActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }
}
