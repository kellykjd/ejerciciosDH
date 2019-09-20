package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    public static final String NOMBRE = "nombre";
    public static final String APELLIDO = "apellido";
    public static final String EDAD = "edad";
    private TextView receptorActivity_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        receptorActivity_TextView = findViewById(R.id.ReceptorActivity_TextView);

        Intent intent=getIntent();
        Bundle bundle =intent.getExtras();
        String textoAMostrar =bundle.getString(NOMBRE);
        receptorActivity_TextView.setText(textoAMostrar);
    }
}
