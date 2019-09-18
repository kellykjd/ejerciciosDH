package com.example.loginhechoenclasebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    //creamos las constantes con las claves para que otras actividades se puedan comunicar
    public static final String CLAVE_USUARIO = "usuario";

    private TextView textViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewUsername = findViewById(R.id.SegundaActivity_TextView_Username);

        //traigo el intent
        Intent intent = getIntent();
        //traigo el bundle
        Bundle bundle = intent.getExtras();
        //le pido lo que requiero al bundle
        String username = bundle.getString(CLAVE_USUARIO);
        // le seteamos al textView el valor del username
        textViewUsername.setText("Welcome: " + username + "!!!");

    }
}
