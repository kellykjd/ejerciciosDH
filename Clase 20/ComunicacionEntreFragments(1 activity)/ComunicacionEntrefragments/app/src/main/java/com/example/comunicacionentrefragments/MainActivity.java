package com.example.comunicacionentrefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentLogin.ActivityListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegarFragment(new FragmentLogin());
    }


    //creo el metodo para pegar fragment
    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivity_contenedorDeFragments,fragment)
                .addToBackStack(null)
                .commit();
    }


    //creo el metodo que le avisa a la activity que el fragment se esta comunicando
    //basicamente le elijo el comportamiento que quiero que tenga cuando el fragment se comunica
    //entonces dos activities pueden estar usando el mismo fragment pero actuar diferente cuando se comunica
    @Override
    public void notificarActivity(String username) {
        //creo el fragment
        FragmentWelcome fragmentWelcome = new FragmentWelcome();
        //le creo un bundle
        Bundle bundle = new Bundle();
        //le pongo la info que me paso el fragment
        bundle.putString(FragmentWelcome.CLAVE_USERNAME,username);
        fragmentWelcome.setArguments(bundle);
        //lo pego
        pegarFragment(fragmentWelcome);

    }
}
