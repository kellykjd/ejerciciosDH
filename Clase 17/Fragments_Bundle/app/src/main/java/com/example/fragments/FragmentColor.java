package com.example.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentColor extends Fragment {

    public static final String CLAVE_COLOR = "claveColor";

    public FragmentColor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_fragment_color, container, false);

        //agarrar el bundle
        Bundle bundle = getArguments();
        //agarrar la info del bundle
        Integer color = bundle.getInt(CLAVE_COLOR);
        //encontrar vista
        FrameLayout frameLayout = vistaDelFragment.findViewById(R.id.FrameLayout_fragmentColor);
        //modifico la vista
        frameLayout.setBackgroundColor(color);




        return vistaDelFragment;
    }

}
