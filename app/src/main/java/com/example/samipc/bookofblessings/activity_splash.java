package com.example.samipc.bookofblessings;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.rabia.nestedrecyclerview.R;

import java.util.Locale;

public class activity_splash extends AppCompatActivity {

    private final int DURACION_SPLASH = 3000;

    RelativeLayout rlSplash;
    private int backgroundResource;
    private String lg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        rlSplash = findViewById(R.id.splashimg);
        lg = Locale.getDefault().getLanguage();



        if(lg=="es") {
            rlSplash.setBackgroundResource(R.drawable.coverblessingsbooksp);

        } else {
            rlSplash.setBackgroundResource(R.drawable.coverblessingsbooken);
           
        }



        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(activity_splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}

