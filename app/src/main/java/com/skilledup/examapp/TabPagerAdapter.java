package com.skilledup.examapp;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by User on 4/5/2017.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

    Fragment screen[];
    Context context;
    public TabPagerAdapter(android.support.v4.app.FragmentManager fm, Context context, Fragment ... screen) {
        super(fm);
        this.screen = screen;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return screen[position];
    }

    @Override
    public int getCount() {
        return screen.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Home";

            case 1:
                return "Other";
        }
        return null;
    }
}
