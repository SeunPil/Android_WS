package com.example.wsapplication;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ImageView imageView;
    public TextView textView2;
    public Button button;

    ViewHolder(Context context, View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.Tv_name2);
        imageView = itemView.findViewById(R.id.iv_icon);
        textView2 = itemView.findViewById(R.id.tv_title);
        button = itemView.findViewById(R.id.button);

    }

    // 클릭 이벤트



}
