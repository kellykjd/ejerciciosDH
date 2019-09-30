package com.example.loginregisterfragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.loginregisterfragments.WelcomeActivity.CLAVE_USUARIO;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWelcome extends Fragment {
private MuestraDeLogin muestraDeLogin;
private TextView textView_username;


    public FragmentWelcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        encontrarVistas(view);
        Bundle bundle = getArguments();
        String usuario = bundle.getString(CLAVE_USUARIO);
        textView_username.setText("¡Welcome "+usuario+"!");

        return view;
    }

    public interface MuestraDeLogin{
        public void mostrarLogin(String usuario);
    }

    private void encontrarVistas(View view){
        textView_username = view.findViewById(R.id.FragmentWelcome_TextView_username);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.muestraDeLogin = (MuestraDeLogin) context;
    }
}
