package com.ruzle.ehatawtesting3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterr extends RecyclerView.Adapter<Adapterr.MyViewHolder> {

    Context context;

    ArrayList<UserData> list;

    public Adapterr(Context context, ArrayList<UserData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        UserData user = list.get(position);
        holder.VideoTitle.setText(user.getVideoTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView VideoTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            VideoTitle = itemView.findViewById(R.id.userList);
        }
    }
}
