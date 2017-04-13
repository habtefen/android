package com.skilledup.examapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.skilledup.examapp.model.News;

import java.util.ArrayList;

/**
 * Created by User on 4/6/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

   private ArrayList<News> newNews = new ArrayList<>();
   private Activity activity;

    public NewsAdapter(Activity activity, ArrayList<News>news) {
        super(activity, R.layout.layout_list_view, news);

        this.activity = activity;
        this.newNews = news;
    }

    private static class viewHolder{
        TextView titleNews;
        TextView descNews;
        ImageView newsImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        News news = getItem(position);
        viewHolder viewHolder;

        if(convertView == null){

            viewHolder = new viewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.layout_list_view, parent, false);

            viewHolder.titleNews = (TextView) convertView.findViewById(R.id.title);
            viewHolder.descNews = (TextView) convertView.findViewById(R.id.desc);
            viewHolder.newsImg = (ImageView) convertView.findViewById(R.id.icon);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (viewHolder) convertView.getTag();
        }

        viewHolder.titleNews.setText(news.getNewsTitle());
        viewHolder.descNews.setText(news.getNewsDesc());
        return convertView;
    }
}
