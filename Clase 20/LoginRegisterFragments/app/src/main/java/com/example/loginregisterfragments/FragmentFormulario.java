package com.example.loginregisterfragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFormulario extends Fragment {
    private ListenerDeLogin listenerDeLogin;
    private EditText editText_username;
    private Button button_login;


    public FragmentFormulario() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_formulario, container, false);
        encontrarVistas(view);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    listenerDeLogin.seLogueo(editText_username.getText().toString());
            }
        });
        return view;
    }

    private void encontrarVistas(View view){
        editText_username = view.findViewById(R.id.FragmentFormulario_EditText_username);
        button_login = view.findViewById(R.id.FragmentFormulario_Button_Login);
    }

    public interface ListenerDeLogin{
        public void seLogueo(String usuario);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.listenerDeLogin = (ListenerDeLogin) context;
    }
}
