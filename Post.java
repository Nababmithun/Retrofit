package com.androidlime.jsonplaceholderapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mithun on 1/4/2019.
 */

public class Post {
    private int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
