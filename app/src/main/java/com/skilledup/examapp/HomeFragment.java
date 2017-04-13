package com.skilledup.examapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 4/5/2017.
 */

public class HomeFragment extends Fragment {

    View homefragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        homefragment = inflater.inflate(R.layout.home_fragment, container, false);
        return homefragment;
    }
}
