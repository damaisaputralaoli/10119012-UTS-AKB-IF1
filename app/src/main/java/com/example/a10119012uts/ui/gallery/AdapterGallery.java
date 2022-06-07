package com.example.a10119012uts.ui.gallery;
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

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119012uts.R;

import java.util.ArrayList;

public class AdapterGallery extends RecyclerView.Adapter<AdapterGallery.myviewholder> {
    ArrayList<ModelGallery> modelGallery;

    public AdapterGallery(ArrayList<ModelGallery> modelGallery) {
        this.modelGallery = modelGallery;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoGallery.setImageResource(modelGallery.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return modelGallery.size();
    }
    static class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoGallery = itemView.findViewById(R.id.logo_gallery);
        }
    }
}
