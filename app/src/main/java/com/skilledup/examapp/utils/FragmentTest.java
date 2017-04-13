package com.skilledup.examapp.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.skilledup.examapp.HomeFragment;
import com.skilledup.examapp.R;

/**
 * Created by User on 4/5/2017.
 */

public class FragmentTest extends AppCompatActivity {

    HomeFragment homefragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder);
        //homefragment = new HomeFragment();

/*        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager(homefragment);
            }
        });*/
    }

    /*public void fragmentManager(Fragment fr){
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_holder, fr);
        ft.commit();
    }*/
}
