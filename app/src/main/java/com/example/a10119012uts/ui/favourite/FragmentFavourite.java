package com.example.a10119012uts.ui.favourite;
/*
NIM : 10119012
NAMA : DAMAI SAPUTRA LAOLI
KELAS : IF-1
E-MAIL : damailaoli123@gmail.com
 */
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119012uts.R;

import java.util.ArrayList;

public class FragmentFavourite extends Fragment {
    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<ModelFavourite> favouriteModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_favourite, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        favouriteModel = new ArrayList<>();

        ModelFavourite music1 = new ModelFavourite(R.drawable.whatamangottado, "What A Man Gotta Do", "Jonas Brothers");
        favouriteModel.add(music1);
        ModelFavourite music2 = new ModelFavourite(R.drawable.sucker, "Sucker", "Jonas Brothers");
        favouriteModel.add(music2);
        ModelFavourite music3 = new ModelFavourite(R.drawable.cool, "Cool", "Jonas Brothers");
        favouriteModel.add(music3);
        ModelFavourite music4 = new ModelFavourite(R.drawable.whatloversdo, "What Lovers Do", "Maroon 5 ft. SZA");
        favouriteModel.add(music4);
        ModelFavourite music5 = new ModelFavourite(R.drawable.memories, "Memories", "Maroon 5");
        favouriteModel.add(music5);
        ModelFavourite music6 = new ModelFavourite(R.drawable.girlslikeyou, "Girls Like You", "Girls Like You ft. Cardi B");
        favouriteModel.add(music6);
        ModelFavourite music7 = new ModelFavourite(R.drawable.beautifulmistake, "Beautiful Mistake", "Maroon 5");
        favouriteModel.add(music7);

        recyclerViewMusic.setAdapter(new AdapterFavourite(favouriteModel));




        return root;
    }
}
