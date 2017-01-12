package com.example.fragger.delhitourbooklet;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private int SPLASH_TIME_OUT=3000; //IN MILLISECONDS



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,Login.class);
                startActivity(i);

                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
