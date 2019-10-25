package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

//hago que el adapter extienda de fragment state adapter
public class AdapterViewPagerEquipos extends FragmentStatePagerAdapter {

    //el adapter tiene como atributo la lista de fragments
    private List<FragmentDetalleEquipo> listaDeFragments;
    private List<EquipoDeFutbol> equipos;


    //cambio el constructor de el adapter para que recciba los equipos a mostrar
    public AdapterViewPagerEquipos(@NonNull FragmentManager fm,List<EquipoDeFutbol> equiposAMostrar) {
        //uso el super para pasarle el fragment manager
        super(fm);
        //setear el atributo lista de equipos
        equipos=equiposAMostrar;
        //creo la lista
        listaDeFragments = new ArrayList<>();
        //recorro la lista de equipos
        for (EquipoDeFutbol equipo : equiposAMostrar) {
            //por cada equipo creo un fragment detalle del equipo
            FragmentDetalleEquipo fragment = FragmentDetalleEquipo.dameUnFragment(equipo);
            //lo agrego a la lista del fragments
            listaDeFragments.add(fragment);
        }
    }

    @NonNull
    @Override
    //le tengo que crear el metodo que dice que item muestra
    public Fragment getItem(int position) {
        return listaDeFragments.get(position);
    }


    @Override
    //y el metodo que te dice cuantos fragments tiene el adapter
    public int getCount() {
        return listaDeFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        EquipoDeFutbol equipoMostrado = equipos.get(position);
        return equipoMostrado.getNombre();
    }
}
