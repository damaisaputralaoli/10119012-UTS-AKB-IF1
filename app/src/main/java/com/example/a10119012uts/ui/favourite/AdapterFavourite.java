package com.example.a10119012uts.ui.favourite;
/*
NIM : 10119012
NAMA : DAMAI SAPUTRA LAOLI
KELAS : IF-1
E-MAIL : damailaoli123@gmail.com
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119012uts.R;

import java.util.ArrayList;

public class AdapterFavourite extends RecyclerView.Adapter<AdapterFavourite.myviewholder> {
    ArrayList<ModelFavourite> modelMusic;

    public AdapterFavourite(ArrayList<ModelFavourite> modelMusic) {
        this.modelMusic = modelMusic;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favourite, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.musicLogo.setImageResource(modelMusic.get(position).getImage());
        holder.titleFavourite.setText(modelMusic.get(position).getTitle());
        holder.singerFavourite.setText(modelMusic.get(position).getPenyanyi());
    }

    @Override
    public int getItemCount() {
        return modelMusic.size();
    }

    static class myviewholder extends RecyclerView.ViewHolder {
        ImageView musicLogo;
        TextView titleFavourite, singerFavourite;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            musicLogo = itemView.findViewById(R.id.logo_music);
            titleFavourite = itemView.findViewById(R.id.title_favourite);
            singerFavourite = itemView.findViewById(R.id.singer_favourite);
        }
    }
}
