package com.skilledup.examapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.InterpolatorRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by User on 4/5/2017.
 */

public class SplashActivity extends AppCompatActivity {

    public final int SPLASHTIMEOUT= 3000;
    public boolean viewClicke = false;
    public boolean closed = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.main_content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewClicke = true;
                newActivity();
            }
        });

        Runnable myrunnable = new Runnable() {
            @Override
            public void run() {
                if(viewClicke)return;
                if(closed)return;
                newActivity();
            }
        };

        Handler myHandler = new Handler();
        myHandler.postDelayed(myrunnable, SPLASHTIMEOUT);
    }

/*     }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, SPLASHTIMEOUT);
    }*/

    public void newActivity() {
        Intent i = new Intent(getApplicationContext(), ActivityRegister.class);
        startActivity(i);
        finish();
    }

}
