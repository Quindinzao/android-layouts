package com.quindinzao.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinearLayout = findViewById(R.id.btnLinearLayout);
        Button btnLoginLinearLayout = findViewById(R.id.btnLoginLinearLayout);
        Button btnConstraintLayout = findViewById(R.id.btnConstraintLayout);
        Button btnFrameLayout = findViewById(R.id.btnFrameLayout);

        btnLinearLayout.setOnClickListener(v -> {
            startActivity(new Intent(this, LinearLayoutActivity.class));
        });

        btnLoginLinearLayout.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginLinearLayoutActivity.class));
        });

        btnConstraintLayout.setOnClickListener(v -> {
            startActivity(new Intent(this, ConstraintLayoutActivity.class));
        });

        btnFrameLayout.setOnClickListener(v -> {
            startActivity(new Intent(this, FrameLayoutActivity.class));
        });
    }
}