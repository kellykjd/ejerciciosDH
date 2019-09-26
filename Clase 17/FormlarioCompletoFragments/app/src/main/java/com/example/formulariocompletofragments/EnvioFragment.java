package com.example.formulariocompletofragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnvioFragment extends Fragment {

    public static final String CLAVE_NOMBRE = "nombre";
    public static final String CLAVE_APELLIDO = "apellido";
    public static final String CLAVE_EDAD ="edad";
    public static final String CLAVE_CARRERA = "carrera";
    public static final String CLAVE_EMAIL = "email";
    public static final String CLAVE_TORNEOS = "torneos";
    public static final String CLAVE_MEETUPS = "meetups";
    public static final String CLAVE_ASADOS = "asado";

    private TextView nombreApellidoRecibido;
    private TextView edadRecibida;
    private TextView carreraRecibida;
    private TextView emailRecibido;
    private TextView opcionesRecibidas;
    private String opciones = "";

    public EnvioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_envio, container, false);

        encontrarVistas(view);

        mostrarInformacion();
        return view;
    }

    private void encontrarVistas(View view){
        nombreApellidoRecibido = view.findViewById(R.id.fEnvio_textView_nombreApellidoRecibido);
        edadRecibida = view.findViewById(R.id.fEnvio_textView_edadRecibida);
        carreraRecibida = view.findViewById(R.id.fEnvio_textView_carreraRecibida);
        emailRecibido = view.findViewById(R.id.fEnvio_textView_emailRecibido);
        opcionesRecibidas = view.findViewById(R.id.fEnvio_textView_opcionesRecibidas);
    }


    private void mostrarInformacion(){
        Bundle bundle= getArguments();
        String nombre=bundle.getString(CLAVE_NOMBRE);
        String apellido=bundle.getString(CLAVE_APELLIDO);
        Integer edad = bundle.getInt(CLAVE_EDAD);
        String carrera = bundle.getString(CLAVE_CARRERA);
        String email = bundle.getString(CLAVE_EMAIL);
        Boolean torneos = bundle.getBoolean(CLAVE_TORNEOS);
        Boolean meetups = bundle.getBoolean(CLAVE_MEETUPS);
        Boolean asados = bundle.getBoolean(CLAVE_ASADOS);

        nombreApellidoRecibido.setText(nombre+", "+apellido);
        edadRecibida.setText(edad.toString());
        carreraRecibida.setText(carrera);
        emailRecibido.setText(email);


        if (torneos){opciones = opciones + " Torneos ";}
        if (meetups){opciones = opciones + " Meetups ";}
        if (asados) {opciones = opciones + " Asados ";}

        opcionesRecibidas.setText(opciones);
    }

}
