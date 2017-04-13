package com.skilledup.examapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by User on 4/5/2017.
 */

public class SharedPreferance {

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    public static final String PREF_NAME = "examapp_prefs";

    public SharedPreferance(Context context) {
        prefs = context.getSharedPreferences(PREF_NAME, context.MODE_PRIVATE);
    }

    public void setBoolean(String key, boolean val){
        if(editor == null)
            editor = prefs.edit();
        editor.putBoolean(key, val);
        editor.apply();
    }

    public boolean getBoolean(String key){

        return prefs.getBoolean(key, false);
    }
}
