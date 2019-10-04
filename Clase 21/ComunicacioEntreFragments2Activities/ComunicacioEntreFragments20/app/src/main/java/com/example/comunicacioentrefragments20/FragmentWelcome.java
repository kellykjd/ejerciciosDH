package com.example.comunicacioentrefragments20;


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

    public static final String CLAVE_USERNAME = "userName";
    public static final String CLAVE_PASSWORD = "password";

    private TextView textViewUser;

    public FragmentWelcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_welcome, container, false);

        textViewUser = vistaDelFragment.findViewById(R.id.fragmentWelcome_User);

        Bundle bundle = getArguments();

        String username = bundle.getString(CLAVE_USERNAME);
        String password = bundle.getString(CLAVE_PASSWORD);

        textViewUser.setText(username + " " + password);


        return vistaDelFragment;
    }

}
