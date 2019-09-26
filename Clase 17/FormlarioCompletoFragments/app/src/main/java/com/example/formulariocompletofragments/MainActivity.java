package com.example.formulariocompletofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button botonComenzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonComenzar = findViewById(R.id.MainActivity_bttnComenzar);

        botonComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarFragmentFormulario();
            }
        });
    }

    private void cambiarDeFragment(Fragment unFragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragments,unFragment,null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void llamarFragmentFormulario(){
        FormularioFragment formularioFragment = new FormularioFragment();
        cambiarDeFragment(formularioFragment);
    }
}
