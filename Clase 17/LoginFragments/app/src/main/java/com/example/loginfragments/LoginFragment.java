package com.example.loginfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    public static final String CLAVE_USUARIO = "usuario";
    private TextView username;

    public LoginFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_login, container, false);

        username = vistaDelFragment.findViewById(R.id.SegundaActivity_TextView_Username);

        Bundle bundle = getArguments();
        //agarrar la info del bundle
        String usuario = bundle.getString(CLAVE_USUARIO);
        //encontrar vista
        FrameLayout frameLayout = vistaDelFragment.findViewById(R.id.FrameLayout_loginFragment);
        //modifico la vista
        username.setText("Welcome: " + username + "!!!");

        return vistaDelFragment;
    }

}
