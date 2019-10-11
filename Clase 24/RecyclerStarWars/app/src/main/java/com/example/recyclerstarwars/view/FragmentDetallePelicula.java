package com.example.recyclerstarwars.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerstarwars.R;
import com.example.recyclerstarwars.model.Pelicula;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetallePelicula extends Fragment {

    public static final String CLAVE_PELICULA = "clavePelicula";

private TextView textViewTitulo;
private TextView textViewSinopsis;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                View view = inflater.inflate(R.layout.fragment_detalle_pelicula, container, false);

                textViewTitulo = view.findViewById(R.id.fragmentDetallePelicula_TextView_titulo);
                textViewSinopsis = view.findViewById(R.id.fragmentDetallePelicula_TextView_sinopsis);
                Bundle bundle = getArguments();
                Pelicula peliculaSeleccionada =  (Pelicula) bundle.getSerializable(CLAVE_PELICULA);
                textViewTitulo.setText(peliculaSeleccionada.getTitulo());
                textViewSinopsis.setText(peliculaSeleccionada.getSinopsis());
                return view;
    }

}
