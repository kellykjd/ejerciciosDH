package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity implements FragmentWelcome.MuestraDeLogin{
    public static final String CLAVE_USUARIO = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mostrarLogin(obtenerUsuario());
    }

    @Override
    public void mostrarLogin(String usuario) {
        Bundle bundleConInformacion = new Bundle();
        bundleConInformacion.putString(CLAVE_USUARIO,usuario);
        FragmentWelcome fragmentWelcome = new FragmentWelcome();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentWelcome.setArguments(bundleConInformacion);
        fragmentTransaction.add(R.id.contenedorDeFragmentsWelcome,fragmentWelcome);
        fragmentTransaction.commit();
    }

    private String obtenerUsuario(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String usuario = bundle.getString(CLAVE_USUARIO);
        return usuario;
    }

}
