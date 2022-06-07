package com.example.a10119012uts.ui.profile;
/*
NIM : 10119012
NAMA : DAMAI SAPUTRA LAOLI
KELAS : IF-1
E-MAIL : damailaoli123@gmail.com
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a10119012uts.DialogAbout;
import com.example.a10119012uts.R;

import androidx.fragment.app.Fragment;

public class FragmentProfile extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        Instagram = root.findViewById(R.id.instagram);
        Whatsapp = root.findViewById(R.id.whatsapp);
        Telegram = root.findViewById(R.id.telegram);
        Gmail = root.findViewById(R.id.gmail);
        Github = root.findViewById(R.id.github);
        Linkedin = root.findViewById(R.id.linkedin);
        Maps = root.findViewById(R.id.maps);
        Abouts = root.findViewById(R.id.about);

        Instagram.setOnClickListener(v -> {
            Intent insta = new Intent();
            insta.setAction(Intent.ACTION_VIEW);
            insta.addCategory(Intent.CATEGORY_BROWSABLE);
            insta.setData(Uri.parse("https://www.instagram.com/anggawanridho"));
            startActivity(insta);
        });

        Whatsapp.setOnClickListener(view -> {
            Intent whatsapp = new Intent();
            whatsapp.setAction(Intent.ACTION_VIEW);
            whatsapp.addCategory(Intent.CATEGORY_BROWSABLE);
            whatsapp.setData(Uri.parse("https://wa.me/6282111114661"));
            startActivity(whatsapp);
        });

        Telegram.setOnClickListener(view -> {
            Intent telegram = new Intent();
            telegram.setAction(Intent.ACTION_VIEW);
            telegram.addCategory(Intent.CATEGORY_BROWSABLE);
            telegram.setData(Uri.parse("https://t.me/anggawanridho"));
            startActivity(telegram);
        });

        Gmail.setOnClickListener(view -> {
            Intent gmail = new Intent();
            gmail.setAction(Intent.ACTION_VIEW);
            gmail.addCategory(Intent.CATEGORY_BROWSABLE);
            gmail.setData(Uri.parse("mailto:anggawanridho@gmail.com"));
            startActivity(gmail);
        });


        Github.setOnClickListener(view -> {
            Intent github = new Intent();
            github.setAction(Intent.ACTION_VIEW);
            github.addCategory(Intent.CATEGORY_BROWSABLE);
            github.setData(Uri.parse("https://github.com/anggawanridho"));
            startActivity(github);
        });

        Linkedin.setOnClickListener(view -> {
            Intent linkedin = new Intent();
            linkedin.setAction(Intent.ACTION_VIEW);
            linkedin.addCategory(Intent.CATEGORY_BROWSABLE);
            linkedin.setData(Uri.parse("https://goo.gl/maps/YECsFawuTb1iQkEZA"));
            startActivity(linkedin);
        });

        Maps.setOnClickListener(view -> {
            Intent map = new Intent();
            map.setAction(Intent.ACTION_VIEW);
            map.addCategory(Intent.CATEGORY_BROWSABLE);
            map.setData(Uri.parse("https://goo.gl/maps/YECsFawuTb1iQkEZA"));
            startActivity(map);
        });

        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Anggawan Ridho");
        });

        return root;
    }
}
