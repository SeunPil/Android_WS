package com.example.wsapplication;

import android.widget.Button;

public class PhRecyclerItem {
    private int img_id;
    private String Tv_name2;
    private String title_text;


    public PhRecyclerItem(int a_img_id, String a_text, String a_title) {
        img_id = a_img_id;
        Tv_name2 = a_text;
        title_text = a_title;
    }

    public String getTitle_text() {
        return title_text;
    }

    public int getImg_id() {
        return img_id;
    }

    public String getTv_name2() {
        return Tv_name2;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public void setTv_name2(String Tv_name2) {
        this.Tv_name2 = Tv_name2;
    }

    public void setTitle_text(String title_text) {
        this.title_text = title_text;
    }
}


