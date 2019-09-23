package com.example.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRojo extends Fragment {


    public FragmentRojo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //inflo la vista que va a mostrar el fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_fragment_rojo, container, false);
        //trabajo la vista agrego on click listeners y etc



        //hago un return de la vista
        return vistaDelFragment;
    }

}
