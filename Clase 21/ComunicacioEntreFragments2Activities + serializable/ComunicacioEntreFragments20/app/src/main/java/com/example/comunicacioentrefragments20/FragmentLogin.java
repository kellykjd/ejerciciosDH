package com.example.comunicacioentrefragments20;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private EditText editTextUsername;
    private EditText editTextPass;
    private Button buttonLogin;

    private NotificadorActivity listener;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_login, container, false);
        
        editTextUsername = vistaDelFragment.findViewById(R.id.fragmentLogin_username);
        editTextPass = vistaDelFragment.findViewById(R.id.fragmentLogin_pasword);
        buttonLogin = vistaDelFragment.findViewById(R.id.fragmentLogin_buttonLogin);
        
        
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPass.getText().toString();
                Usuario user = new Usuario(username,password);
                listener.recibirMensaje(user);

            }
        });
        
        
        
        
        return vistaDelFragment;
    }



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.listener = (NotificadorActivity) context;
    }

    public interface NotificadorActivity{

        public void recibirMensaje(Usuario user);
    }
}
