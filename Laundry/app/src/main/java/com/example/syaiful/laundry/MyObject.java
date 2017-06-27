package com.example.syaiful.laundry;

/**
 * Created by AKNS08 on 4/15/2017.
 */

public class MyObject {

    private String text;
    private int imageUrl;

    public MyObject(String text, int imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
