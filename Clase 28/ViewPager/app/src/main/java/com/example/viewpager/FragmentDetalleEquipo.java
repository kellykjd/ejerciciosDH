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

    //la clave para poner el serializable en el bundle
    public static final String CLAVE_EQUIPO = "claveEquipo";

    private TextView textViewNombre;
    private ImageView imageViewImagen;

    //fabrica de fragments
    public static FragmentDetalleEquipo dameUnFragment(EquipoDeFutbol equipo){
        //crear el fragment
        FragmentDetalleEquipo fragmentDetalleEquipo = new FragmentDetalleEquipo();
        //pasarle el bundle
        Bundle bundle = new Bundle();
        bundle.putSerializable(CLAVE_EQUIPO,equipo);
        fragmentDetalleEquipo.setArguments(bundle);
        //hacerle un return
        return fragmentDetalleEquipo;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_detalle_equipo, container, false);

        textViewNombre = vistaDelFragment.findViewById(R.id.fragmentEquipo_nombre);
        imageViewImagen = vistaDelFragment.findViewById(R.id.fragmentEquipo_imagen);

        Bundle bundle = getArguments();

        EquipoDeFutbol equipoDeFutbol = (EquipoDeFutbol) bundle.getSerializable(CLAVE_EQUIPO);

        textViewNombre.setText(equipoDeFutbol.getNombre());

        //uso glide para poder cargar una url en un image view
        Glide.with(getContext())
                //la url de la imagen
                .load(equipoDeFutbol.getUrlImagen())
                //la imagen que quiero que se muestre mientras se carga
                .placeholder(R.drawable.loading)
                //le asigno la imagen que quiero que se muestre si ocurre algun error cargando por url
                .error(R.drawable.error)
                //el image view donde quiero cargar la imagen
                .into(imageViewImagen)
                ;

        return vistaDelFragment;
    }

}
