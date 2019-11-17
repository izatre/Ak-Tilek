package com.example.ak_tilek;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                launchMajor();
            }
        }, SPLASH_TIME_OUT);
    }

    private void launchMajor() {
        Intent homeIntent = new Intent(MainActivity.this, MajorActivity.class);
        startActivity(homeIntent);
    }
}
