package com.example.uzzal.recyclerviewatifsir_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

     // create to constructer
    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parrent, int viewType) {

        // convert xml to view object.......

        View v = LayoutInflater.from(parrent.getContext()).inflate(R.layout.model,null);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
          // bind data to our view
        holder.mTitleTv.setText(models.get(position).getTitle());
        holder.mDescrTv.setText(models.get(position).getDescription());
        holder.mImageIv.setImageResource(models.get(position).getImg());

        //animation
        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
