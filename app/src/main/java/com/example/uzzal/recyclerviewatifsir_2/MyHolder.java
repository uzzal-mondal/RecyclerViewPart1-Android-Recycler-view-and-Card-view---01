package com.example.uzzal.recyclerviewatifsir_2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {

  // views
    ImageView mImageIv;
    TextView mTitleTv,mDescrTv;


    public MyHolder(@NonNull View itemView) {
        super(itemView);

        // id find
        this.mImageIv = itemView.findViewById(R.id.modelImageIv_id);
        this.mTitleTv = itemView.findViewById(R.id.modelTitleTV_id);
        this.mDescrTv = itemView.findViewById(R.id.modelDescTv_id);

    }


}
