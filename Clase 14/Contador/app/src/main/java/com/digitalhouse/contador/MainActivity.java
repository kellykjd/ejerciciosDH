package com.digitalhouse.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textoContador;
    private Button botonSumar;
    private Button botonRestar;
    private Integer contador;
    private ImageView imageViewPersonaje;
    private List<Integer> imagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        encontrarViews();

        contador = 3000;
        updateContador();

        //Uso de imagenes

        /*imagenes = new ArrayList<>();
        imagenes.add(R.drawable.cersei);
        imagenes.add(R.drawable.jonsnow);
        imageViewPersonaje.setImageResource(R.drawable.cersei);
        imageViewPersonaje.setImageResource(imagenes.get(1));*/


        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;


                updateContador();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                updateContador();
            }
        });

    }

    private void updateContador(){
        textoContador.setText(contador.toString());
    }

    private void encontrarViews(){

        imageViewPersonaje = findViewById(R.id.mainActivity_imageViewPersonaje);
        textoContador = findViewById(R.id.mainActivity_contador);
        botonRestar = findViewById(R.id.mainActivity_botonRestar);
        botonSumar = findViewById(R.id.mainActivity_botonSumar);




    }
}
