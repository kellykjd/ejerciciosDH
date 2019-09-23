package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonCambiarVerde;
    private Button botonCambiarRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCambiarRojo = findViewById(R.id.Boton_pegarRojo);
        botonCambiarVerde = findViewById(R.id.Boton_pegarVerde);


        botonCambiarVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pegarFragmentColor(Color.GREEN);
            }
        });

        botonCambiarRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciar el Fragment
                pegarFragmentColor(Color.RED);
            }
        });


    }

    private void pegarfragment(Fragment fragment){
        //busco el fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //creo una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //especifico los detalles de la transaccion
        fragmentTransaction.add(R.id.contenedorDeFragments,fragment,null);
        //recuerde la transaccion para poder ir para atras
        fragmentTransaction.addToBackStack(null);
        //comiteo la transaccion
        fragmentTransaction.commit();
    }

    private void pegarFragmentColor(Integer color){
        //creo el fragment color
        FragmentColor fragmentColor = new FragmentColor();
        //creo el bundle
        Bundle bundle = new Bundle();
        //le agrego el color al bundle
        bundle.putInt(FragmentColor.CLAVE_COLOR,color);
        //le doy el bungle al fragment
        fragmentColor.setArguments(bundle);
        //pego el fragment
        pegarfragment(fragmentColor);
    }




}
