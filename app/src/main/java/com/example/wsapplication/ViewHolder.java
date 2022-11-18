package com.example.wsapplication;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public Button button;

    ViewHolder(Context context, View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_1);
    }
}
