package com.example.concatenador;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText texto1;
    private EditText texto2;
    private TextView textoConcatenado;
    private Button botonConcatenar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.mainActivity_texto1);
        texto2 = findViewById(R.id.mainActivity_texto2);
        textoConcatenado = findViewById(R.id.mainActivity_textViewConcatenado);
        botonConcatenar = findViewById(R.id.mainActivity_botonConcatenador);

        botonConcatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textoConcatenado.setText(texto1.getText()+" "+texto2.getText());
            }
        });

    }

}

