package com.example.travelio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travelio.MainActivity;
import com.example.travelio.R;

public class SplashActivity extends AppCompatActivity {
    private Animation fadeIn;
    private ImageView appIcon;
    private TextView appName;
    private TextView appMotto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        appIcon = findViewById(R.id.icon);
        appName = findViewById(R.id.app_name);
        appMotto = findViewById(R.id.app_motto);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        appIcon.startAnimation(fadeIn);
        appName.startAnimation(fadeIn);
        appMotto.startAnimation(fadeIn);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah activity
                Intent goToHome = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(goToHome);
                finish();
            }
        }, 2000);//2000 ms
    }
}
