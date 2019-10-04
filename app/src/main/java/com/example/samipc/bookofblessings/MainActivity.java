package com.example.samipc.bookofblessings;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.rabia.nestedrecyclerview.R;

import java.util.ArrayList;

import hotchemi.android.rate.AppRate;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    
        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(1)
                .setRemindInterval(1)
                .setShowLaterButton(true)
                .setDebug(false)

                .monitor();

        // Show a dialog if meets conditions
        AppRate.showRateDialogIfMeetsConditions(this);

        RecyclerView recyclerView=findViewById(R.id.RecyclerView);
        ArrayList<String> title=new ArrayList<>();
        title.add(getString(R.string.family));
        title.add(getString(R.string.food));
        title.add(getString(R.string.shabbat));
        title.add(getString(R.string.festivities));
        title.add(getString(R.string.various));
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        Parentadapter parentadapter=new Parentadapter(title,MainActivity.this);
        recyclerView.setAdapter(parentadapter);
    }
}
