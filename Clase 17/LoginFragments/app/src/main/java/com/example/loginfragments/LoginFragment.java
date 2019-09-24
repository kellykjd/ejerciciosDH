package com.example.loginfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private TextView username;
    public static final String CLAVE_USUARIO = "usuario";


    public LoginFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_login, container, false);
        Bundle bundle = getArguments();
        String usuario = bundle.getString(CLAVE_USUARIO);
        username = vistaDelFragment.findViewById(R.id.SegundaActivity_TextView_Username);
        username.setText("Welcome "+usuario+"!!!");
        return vistaDelFragment;
    }

}
