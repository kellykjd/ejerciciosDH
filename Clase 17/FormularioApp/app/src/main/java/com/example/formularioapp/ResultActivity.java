package com.example.formularioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class    ResultActivity extends AppCompatActivity {

    public static final String CLAVE_NOMBRE = "claveNombre";
    public static final String CLAVE_APELLIDO = "claveApellido";
    public static final String CLAVE_ASADO = "claveAsados";
    public static final String CLAVE_EDAD = "claveEdad";

    private TextView textViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResultado = findViewById(R.id.ResultActivity_textView_text);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nombre = bundle.getString(CLAVE_NOMBRE);
        Integer edad = bundle.getInt(CLAVE_EDAD);
        Boolean quiereAsado = bundle.getBoolean(CLAVE_ASADO);

        textViewResultado.setText(nombre + " " + edad + " " + quiereAsado);
    }
}
