package com.example.comunicacionentrefragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private ActivityListener activityListener;

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    public FragmentLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflo la vista del fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_login, container, false);

        //encuentro los componentes de la vista
        //el find view by id se lo hago a la vista del fragment que infle
        editTextUsername = vistaDelFragment.findViewById(R.id.fragmentLogin_username);
        editTextPassword = vistaDelFragment.findViewById(R.id.fragmentLogin_pasword);
        buttonLogin = vistaDelFragment.findViewById(R.id.fragmentLogin_buttonLogin);

        //creo el listener del boton
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //le paso a quien sea que este escuchando el contenido del username en el onclick
                activityListener.notificarActivity(editTextUsername.getText().toString());
            }
        });


        return vistaDelFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //casteo el contecto a listener asi el fragment lo puedo utilizar en cualquier activity
        //basicamente le digo que donde este fragment se pegue lo va a estar escuchando
        activityListener = (ActivityListener) context;
    }


    //creo la interface que indica el protocolo de comunicacion que va a tener con esta activity
    public interface ActivityListener{
        public void notificarActivity(String username);
    }

}
