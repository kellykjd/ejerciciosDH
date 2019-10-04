package com.example.comunicacioentrefragments20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentLogin.NotificadorActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegarFragment(new FragmentLogin());


    }

    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivity_contenedorDeFragments,fragment,null)
                .commit();
    }

    @Override
    public void recibirMensaje(Usuario user) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentWelcome.CLAVE_USUARIO,user);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
