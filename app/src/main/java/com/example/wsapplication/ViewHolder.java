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
                switch (pos) {
                        case 1: text =  "1";
                        intent = new Intent(view.getContext(), SubActivity2.class);
                        context.startActivity(intent);
                    break;
                        case 2: text = "2";
                        intent = new Intent(view.getContext(), SubActivity3.class);
                        context.startActivity(intent);
                    break;
                    case 3: text = "3";
                        intent = new Intent(view.getContext(), SubActivity4.class);
                        context.startActivity(intent);
                        break;
                    case 4: text = "4";
                        intent = new Intent(view.getContext(), SubActivity5.class);
                        context.startActivity(intent);
                        break;
                    case 5: text = "5";
                        intent = new Intent(view.getContext(), SubActivity6.class);
                        context.startActivity(intent);
                        break;
                    case 6: text = "6";
                        intent = new Intent(view.getContext(), SubActivity7.class);
                        context.startActivity(intent);
                        break;
                    case 7: text = "7";
                        intent = new Intent(view.getContext(), SubActivity8.class);
                        context.startActivity(intent);
                        break;
                    default:
                        intent = new Intent(view.getContext(), SubActivity.class);
                        context.startActivity(intent);
                        break;

                }

            }
        });

    }
}
