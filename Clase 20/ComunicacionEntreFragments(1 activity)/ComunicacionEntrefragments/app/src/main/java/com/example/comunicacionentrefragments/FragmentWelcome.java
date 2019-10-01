package com.example.comunicacionentrefragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWelcome extends Fragment {

    public static final String CLAVE_USERNAME = "claveUsuario";

    private TextView textViewUsername;

    public FragmentWelcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_welcome, container, false);

        //encuentro el componente
        textViewUsername = vistaDelFragment.findViewById(R.id.fragmentWelcome_username);

        //agarro el bundle que me vino de la activity
        Bundle bundle = getArguments();

        //agarro el username del bundle
        String username = bundle.getString(CLAVE_USERNAME);

        //se lo cargo al esit text
        textViewUsername.setText("Welcome " + username);


        return vistaDelFragment;
    }

}
