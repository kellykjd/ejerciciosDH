package com.example.holaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonTexto = findViewById(R.id.boton_texto);

        botonTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Patron de diseño observer
                Toast.makeText(MainActivity.this, "Hola, Christian", Toast.LENGTH_LONG).show();;
            }
        });


/*
        botonTexto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });*/
    }
}
