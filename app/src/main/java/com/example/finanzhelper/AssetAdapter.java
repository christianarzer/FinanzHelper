package com.example.finanzhelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AssetAdapter extends RecyclerView.Adapter<AssetHolder> {

    Context context;
    ArrayList<AssetModel> models;

    public AssetAdapter(Context context, ArrayList<AssetModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public AssetHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assetes_row, null);
        return new AssetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssetHolder assetHolder, int position) {
        assetHolder.mTitle.setText(models.get(position).getTitle());
        assetHolder.mDescription.setText((models.get(position).getDescription()));
        assetHolder.mImageView.setImageResource(models.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
