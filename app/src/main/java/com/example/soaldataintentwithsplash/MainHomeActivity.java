package com.example.soaldataintentwithsplash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainHomeActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton btnMoveFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        btnMoveFood = findViewById(R.id.btn_gofood);
        btnMoveFood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_gofood:
                Intent foodIntent = new Intent(MainHomeActivity.this, GoFood.class);
                startActivity(foodIntent);
                break;
        }
    }
}
