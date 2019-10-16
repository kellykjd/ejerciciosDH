package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterViewPagerEquipos extends FragmentStatePagerAdapter {
    //private List<Fragment> listaDeFragments; Sirve para traer otros fragments

    private List<Fragment> listaDeFragments;
    public AdapterViewPagerEquipos(@NonNull FragmentManager fm, List<EquipoDeFutbol> equiposAMostrar) {
        super(fm);
        listaDeFragments = new ArrayList<>();
        for (EquipoDeFutbol equipo : equiposAMostrar) { //shorcut iter
            FragmentDetalleEquipo fragment = FragmentDetalleEquipo.dameUnFragment(equipo);
            listaDeFragments.add(fragment);
        }

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragments.size();
    }
}
