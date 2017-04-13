package com.skilledup.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.skilledup.examapp.model.News;

/**
 * Created by User on 4/8/2017.
 */

public class ActivityRegister extends AppCompatActivity {

    EditText name;// = (EditText) findViewById(R.id.fname);
    EditText lname; // = (EditText) findViewById(R.id.lname);
    Button reg; // = (Button) findViewById(R.id.name_btn);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        reg = (Button) findViewById(R.id.name_btn);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                News news1 = new News("First Title", "First Description");
                //String firstname = name.getEditableText().toString().trim();
                //String lastname = lname.getEditableText().toString().trim();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("News1", news1);
                //intent.putExtra("lastName", lastname);
                startActivity(intent);
            }
        });
    }

}
