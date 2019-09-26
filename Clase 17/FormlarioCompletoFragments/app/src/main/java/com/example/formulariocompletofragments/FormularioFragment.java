package com.example.formulariocompletofragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEdad;
    private EditText editTextCarrera;
    private EditText editTextEmail;
    private CheckBox checkBoxTorneos;
    private CheckBox checkBoxMeetups;
    private CheckBox checkBoxAsados;
    private Button botonEnviar;

    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_formulario, container, false);
        encontrarVistas(view);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequearCampos()) {
                    llamarFragmentEnvio();
                }
            }
        });
        return view;
    }

    private void encontrarVistas(View view){
        editTextNombre = view.findViewById(R.id.fFormulario_editViewNombre);
        editTextApellido = view.findViewById(R.id.fFormulario_editViewApellido);
        editTextEdad = view.findViewById(R.id.fFormulario_editViewEdad);
        editTextCarrera = view.findViewById(R.id.fFormulario_editViewCarrera);
        editTextEmail = view.findViewById(R.id.fFormulario_editViewEmail);
        checkBoxTorneos = view.findViewById(R.id.fFormulario_checkBoxTorneos);
        checkBoxMeetups = view.findViewById(R.id.fFormulario_checkBoxMeetups);
        checkBoxAsados = view.findViewById(R.id.fFormulario_checkBoxAsados);
        botonEnviar = view.findViewById(R.id.fFormulario_bttnEnviar);
    }

    private Boolean chequearCampos() {
        Boolean todoOK = true;





        if(editTextNombre.getText().toString().length() <=2){
            Toast.makeText(getActivity(), "Ingresa un nombre válido", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }

         if( editTextApellido.getText().toString().length()<=2){
            Toast.makeText(getActivity(), "Ingresa un apellido válido", Toast.LENGTH_SHORT).show();
            todoOK = false;
         }

        String edadTexto = editTextEdad.getText().toString();
        Integer edadInteger = Integer.parseInt(edadTexto);

        if (edadInteger < 18 || edadInteger > 100){
            Toast.makeText(getActivity(), "Debes tener una edad válida.", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }

        if (editTextCarrera.getText().toString().length()<=5) {
            Toast.makeText(getActivity(), "Ingresa una carrera válida", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }

        String email = editTextEmail.getText().toString();

        if (!email.contains("@") || !email.contains(".")){
            Toast.makeText(getActivity(), "El e-mail es inválido", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }

        return todoOK;
    }

    private Bundle crearBundle(){
        Bundle bundle = new Bundle();
        bundle.putString(EnvioFragment.CLAVE_NOMBRE,editTextNombre.getText().toString());
        bundle.putString(EnvioFragment.CLAVE_APELLIDO,editTextApellido.getText().toString());
        Integer edadInteger = Integer.parseInt(editTextEdad.getText().toString());
        bundle.putInt(EnvioFragment.CLAVE_EDAD,edadInteger);
        bundle.putString(EnvioFragment.CLAVE_CARRERA,editTextCarrera.getText().toString());
        bundle.putString(EnvioFragment.CLAVE_EMAIL,editTextEmail.getText().toString());
        Boolean quiereTorneos = checkBoxTorneos.isChecked();
        bundle.putBoolean(EnvioFragment.CLAVE_TORNEOS,quiereTorneos);
        Boolean quiereMeetups = checkBoxMeetups.isChecked();
        bundle.putBoolean(EnvioFragment.CLAVE_MEETUPS,quiereMeetups);
        Boolean quiereAsado = checkBoxAsados.isChecked();
        bundle.putBoolean(EnvioFragment.CLAVE_ASADOS,quiereAsado);
        return bundle;
    }

    private void llamarFragmentEnvio(){
        EnvioFragment envioFragment = new EnvioFragment();
        Bundle bundle = crearBundle();
        envioFragment.setArguments(bundle);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragments,envioFragment,null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}
