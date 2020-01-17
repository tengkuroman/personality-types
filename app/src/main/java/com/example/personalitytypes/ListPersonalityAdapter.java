package com.example.personalitytypes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListPersonalityAdapter extends RecyclerView.Adapter<ListPersonalityAdapter.ListViewHolder> {

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView coverPhoto, detailPhoto;
        TextView personalityName, coverDescription, detailDescription;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            coverPhoto = itemView.findViewById(R.id.tv_cover_photo);
            personalityName = itemView.findViewById(R.id.tv_personality_name);
            coverDescription = itemView.findViewById(R.id.tv_cover_description);

        }
    }
}
