package com.skilledup.examapp.database;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 4/8/2017.
 */

public class DatabaseController {

    private static DatabaseController databaseController;
    private static DatabaseHelper databaseHelper;
    private static SQLiteDatabase db;



    public static synchronized SQLiteDatabase openDatabae(){
        if(db == null)
            db = databaseHelper.getWritableDatabase();
        return db;
    }
}
