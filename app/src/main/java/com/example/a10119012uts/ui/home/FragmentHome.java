package com.example.a10119012uts.ui.home;
/*
NIM : 10119012
NAMA : DAMAI SAPUTRA LAOLI
KELAS : IF-1
E-MAIL : damailaoli123@gmail.com
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import com.example.a10119012uts.R;

public class FragmentHome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
