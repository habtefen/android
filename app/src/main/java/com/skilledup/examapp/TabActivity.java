package com.skilledup.examapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

/**
 * Created by User on 4/5/2017.
 */

public class TabActivity extends AppCompatActivity {

    HomeFragment homeFragment;
    OtherFragment otherFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        homeFragment = new HomeFragment();
        otherFragment = new OtherFragment();
        ViewPager viewPager = (ViewPager) findViewById(R.id.my_view_pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.my_tab);
        tabLayout.setupWithViewPager(viewPager);
        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager(), this, homeFragment,otherFragment);
        viewPager.setAdapter(adapter);
    }
}
