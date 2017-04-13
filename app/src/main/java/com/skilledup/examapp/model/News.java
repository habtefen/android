package com.skilledup.examapp.model;

import java.io.Serializable;

/**
 * Created by User on 4/6/2017.
 */

public class News implements Serializable{

    public String newsTitle;
    public String newsDesc;

    public News(String newsTitle, String newsDesc) {
        this.newsTitle = newsTitle;
        this.newsDesc = newsDesc;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDesc() {
        return newsDesc;
    }
}
