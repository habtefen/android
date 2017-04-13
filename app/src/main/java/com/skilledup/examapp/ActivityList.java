package com.skilledup.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.skilledup.examapp.model.News;

import java.util.ArrayList;

/**
 * Created by User on 4/6/2017.
 */

public class ActivityList extends AppCompatActivity {

    public ArrayList<News> news = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));
        news.add(new News("This is title","This is discription for the news list above as a tiltle"));


        final ListView listView = (ListView) findViewById(R.id.my_list_view);

        NewsAdapter adapter = new NewsAdapter(this, news);
        listView.setAdapter(adapter);
//listView.setTag(news);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // News news1 = (News) view.getTag();
                //Toast.makeText(ActivityList.this, news1.getNewsTitle(), Toast.LENGTH_LONG).show();
                /*Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);*/
            }
        });
    }
}
