package com.example.wsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<PhRecyclerItem> arrayList;

    public Adapter(ArrayList<PhRecyclerItem> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(context, view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PhRecyclerItem Item = arrayList.get(position);
        holder.textView.setText(Item.getTv_name2());
        holder.imageView.setImageResource(Item.getImg_id());
        holder.textView2.setText(Item.getTitle_text());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }




}


