package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentFormulario.ListenerDeLogin{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llamarFragmentFormulario();

    }

    public void llamarFragmentFormulario(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentFormulario fragmentFormulario = new FragmentFormulario();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragmentsFormulario,fragmentFormulario);
        fragmentTransaction.commit();
    }

    @Override
    public void seLogueo(String usuario) {
        Bundle bundle = new Bundle();
        bundle.putString(WelcomeActivity.CLAVE_USUARIO, usuario);
        Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
