package com.example.wsapplication;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = getAdapterPosition();
                String text = Integer.toString(pos);
                Intent intent;
                Toast.makeText(context.getApplicationContext(), text, LENGTH_SHORT).show();
                switch (pos) {
                    case 1: text =  "1";
                    intent = new Intent(view.getContext(), SubActivity.class);
                    context.startActivity(intent);
                    break;
                    case 2: text = "2";
                    intent = new Intent(view.getContext(), SubActivity2.class);
                    context.startActivity(intent);
                    break;
                }

            }
        });

    }
}
