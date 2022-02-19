package com.example.ui1.tool;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

public class ImageLoad extends ImageLoader {
    @Override
    public void displayImage(Context context, Object o, ImageView imageView) {
        Glide.with(context).load(Net.ip+o).into(imageView);
    }
}
