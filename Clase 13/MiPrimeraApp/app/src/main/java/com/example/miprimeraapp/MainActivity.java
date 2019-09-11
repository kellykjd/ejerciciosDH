package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

private Button botonTexto;
private EditText cajaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    botonTexto = findViewById(R.id.boton_aceptar);
    cajaTexto = findViewById(R.id.caja_texto);

    botonTexto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //String nombre = cajaTexto.getText().toString ----> también se puede hacer así.
            Toast.makeText(MainActivity.this, cajaTexto.getText(), Toast.LENGTH_LONG).show();
        }
    });





    }
}
