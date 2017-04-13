package com.skilledup.examapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.skilledup.examapp.model.News;

public class MainActivity extends AppCompatActivity {


    HomeFragment homefragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homefragment = new HomeFragment();
        Button b = (Button) findViewById(R.id.my_alert_button);


        Intent intent = getIntent();

        if(intent.hasExtra("News1")){
           // String fName = intent.getStringExtra("firstName");
           // String lname = intent.getStringExtra("lastName");
            News news2 = (News) intent.getExtras().getSerializable("News1");

            Toast.makeText(getApplicationContext(), "Welcome Mr." + news2.getNewsTitle() + " " + news2.getNewsDesc(), Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Nooooooooooooooooo", Toast.LENGTH_LONG).show();

        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
                //Toast.makeText(getApplicationContext(), "sssss", Toast.LENGTH_LONG).show();
                //fragmentManager(homefragment);

            }
        });
    }

    public void fragmentManager(Fragment fr){
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.my_fragment_holder, fr);
        ft.commit();
    }

    public void logout(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are yo sure you want to exit ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Ysssss", Toast.LENGTH_LONG).show();

            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Nooooooo", Toast.LENGTH_LONG).show();
            }
        });
        builder.create();
        builder.show();
    }
}
