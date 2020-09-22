package com.example.innofiedtestbhagya.util;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.innofiedtestbhagya.R;

import androidx.databinding.BindingAdapter;

public class CustomBindingAdapter {
    @BindingAdapter("visibleGone")

    public static void showHid(View view, boolean show){
        view.setVisibility(show ? View.VISIBLE:view.GONE);
    }

    @BindingAdapter("loadImage")
    public static void loadImage(ImageView imageView, String imageUrl){
        Glide.with(imageView.getContext()).load(imageUrl).placeholder(R.mipmap.ic_launcher).into(imageView);
    }
}
