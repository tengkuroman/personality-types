package com.example.personalitytypes;

import android.app.Person;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPersonalityAdapter extends RecyclerView.Adapter<ListPersonalityAdapter.ListViewHolder> {
    private ArrayList<Personality> listPersonality;

    public ListPersonalityAdapter(ArrayList<Personality> list) {
        this.listPersonality = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Personality data);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_personality_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Personality personality = listPersonality.get(position);
        Glide.with(holder.itemView.getContext())
                .load(personality.getCoverPhoto())
                .apply(new RequestOptions().override(70, 70))
                .into(holder.coverPhoto);
        holder.personalityName.setText(personality.getPersonalityName());
        holder.coverDescription.setText(personality.getCoverDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPersonality.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPersonality.size();
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
