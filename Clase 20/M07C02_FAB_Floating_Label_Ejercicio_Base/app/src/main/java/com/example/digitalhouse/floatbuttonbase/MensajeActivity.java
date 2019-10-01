package com.example.digitalhouse.floatbuttonbase;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MensajeActivity extends AppCompatActivity implements MensajeFragment.ActivityReceptor{
    public static final String CLAVE_MENSAJE = "mensaje";
    public static final String CLAVE_REGALOS = "regalos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        recibirActivity(obtenerMensaje(),obtenerRegalo());
    }

    @Override
    public void recibirActivity(String mensaje, String regalos) {
        Bundle bundle = new Bundle();
        bundle.putString(CLAVE_MENSAJE,mensaje);
        bundle.putString(CLAVE_REGALOS,regalos);
        MensajeFragment mensajeFragment = new MensajeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        mensajeFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.contenedorDeFragmentsMensajes,mensajeFragment);
        fragmentTransaction.commit();


    }

    private String obtenerMensaje(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String mensaje = bundle.getString(CLAVE_MENSAJE);
        return mensaje;
    }

    private String obtenerRegalo(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String regalos = bundle.getString(CLAVE_REGALOS);
        return regalos;
    }

}
