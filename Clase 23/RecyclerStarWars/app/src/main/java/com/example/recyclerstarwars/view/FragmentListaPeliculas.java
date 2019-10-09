package com.example.recyclerstarwars.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerstarwars.R;
import com.example.recyclerstarwars.controller.PeliculaController;
import com.example.recyclerstarwars.model.Pelicula;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListaPeliculas extends Fragment {

    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_peliculas, container, false);
        recyclerView = view.findViewById(R.id.fragmentPeliculas_Recycler);
        PeliculaController peliculaController = new PeliculaController();
        List<Pelicula> peliculasDeLaLista = peliculaController.traerPeliculas();
        AdapterPeliculas adapterPeliculas = new AdapterPeliculas(peliculasDeLaLista);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapterPeliculas);
        return view;
    }

}
