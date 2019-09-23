package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

        pegarfragment(new FragmentVerde());

        botonCambiarVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pegarfragment(new FragmentVerde());
            }
        });

        botonCambiarRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciar el Fragment
                FragmentRojo fragmentRojo = new FragmentRojo();
                //llamo al metodo pegar fragment donde agrupe el comportamiento de hacer una transactiopn
                pegarfragment(fragmentRojo);
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
}
