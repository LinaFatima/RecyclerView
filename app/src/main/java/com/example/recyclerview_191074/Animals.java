package com.example.recyclerview_191074;

import android.widget.ImageView;

public class Animals {
    int imgid;
    String Name,Price;

    public Animals() {
    }

    public Animals(int imgid, String name, String price) {
        this.imgid = imgid;
        Name = name;
        Price = price;
    }

    public int getImgid() {
        return imgid;
    }


    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }



}
