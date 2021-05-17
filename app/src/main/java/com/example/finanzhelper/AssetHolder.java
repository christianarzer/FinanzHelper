package com.example.finanzhelper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AssetHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle, mDescription;

    public AssetHolder(@NonNull  View view){
        super(view);

        this.mImageView=view.findViewById(R.id.asset_image);
        this.mTitle=view.findViewById(R.id.asset_title);
        this.mDescription=view.findViewById(R.id.asset_description);
    }
}
