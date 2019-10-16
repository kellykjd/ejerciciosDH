package com.example.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleEquipo extends Fragment {

    private TextView textViewNombre;
    private ImageView imageViewImage;
    public static final String CLAVE_EQUIPO = "claveEquipo";

    public static FragmentDetalleEquipo dameUnFragment(EquipoDeFutbol equipoDeFutbol){
        //crear el fragment
        FragmentDetalleEquipo fragmentDetalleEquipo = new FragmentDetalleEquipo();
        //pasarle el bundle
        Bundle bundle = new Bundle();
        bundle.putSerializable(CLAVE_EQUIPO,equipoDeFutbol);
        fragmentDetalleEquipo.setArguments(bundle);
        //hacerle un return
        return fragmentDetalleEquipo;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                View view =inflater.inflate(R.layout.fragment_detalle_equipo, container, false);

    textViewNombre = view.findViewById(R.id.fragmentEquipo_nombre);
    imageViewImage = view.findViewById(R.id.fragmentEquipo_imagen);
    Bundle bundle = getArguments();
    EquipoDeFutbol equipoDeFutbol = (EquipoDeFutbol) bundle.getSerializable(CLAVE_EQUIPO);
    textViewNombre.setText(equipoDeFutbol.getNombre());
    Glide.with(getContext())
            .load(equipoDeFutbol.getUrlImagen())
          //  .placeholder(R.drawable.ic_launcher_background) para agregar imagen de la carpeta Drawable mientras se carga la imagen de la url
            //.error(R.drawable.ic_launcher_background) para agregar un drawable por si falla la carga de la imagen desde internet
            .into(imageViewImage);
    return view;
    }

}
