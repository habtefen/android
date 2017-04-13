package com.skilledup.examapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.skilledup.examapp.utils.FragmentTest;

/**
 * Created by User on 4/5/2017.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView textView = (TextView) findViewById(R.id.menu_home);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeMenu();
            }
        });
    }

    public void homeMenu(){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
