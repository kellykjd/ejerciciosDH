package com.example.loginfragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private Button buttonRegister;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaDelFragment = inflater.inflate(R.layout.fragment_register, container, false);

        editTextUsername = vistaDelFragment.findViewById(R.id.RegisterActivityEditText_Username);
        editTextPassword = vistaDelFragment.findViewById(R.id.RegisterActivityEditText_Password);
        editTextConfirmPassword = vistaDelFragment.findViewById(R.id.RegisterActivityEditText_ConfirmPassword);
        buttonRegister = vistaDelFragment.findViewById(R.id.RegisterActivityButton_Register);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarAMainFragment();
            }
        });
           return vistaDelFragment;
    }

    private void cambiarAMainFragment(){

        if (TextUtils.isEmpty(editTextUsername.getText()) || TextUtils.isEmpty(editTextPassword.getText())){
            Toast.makeText(getActivity(), "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
        }else if(!editTextPassword.getText().toString().equals(editTextConfirmPassword.getText().toString())){
            Toast.makeText(getActivity(), "Las contraseña no coinciden!!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intentMain = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(intentMain);
        }
    }

}
