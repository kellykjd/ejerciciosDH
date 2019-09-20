package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class SenderActivity extends AppCompatActivity {

    private EditText sendActivity_EditTextNombre;
    private EditText sendActivity_EditTextApellido;
    private EditText sendActivity_EditTextEdad;
    private Button sendActivity_ButtonMandar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        sendActivity_EditTextNombre = findViewById(R.id.SenderActivity_EditTextNombre);
        sendActivity_EditTextApellido = findViewById(R.id.SenderActivity_EditTextApellido);
        sendActivity_EditTextEdad = findViewById(R.id.SenderActivity_EditTextEdad);
        sendActivity_ButtonMandar = findViewById(R.id.SenderActivity_ButtonMandar);

        sendActivity_ButtonMandar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarAActivityReceptor();
            }
        });
    }


    public void cambiarAActivityReceptor(){
        String nombre =sendActivity_EditTextNombre.getText().toString();
        String apellido =sendActivity_EditTextApellido.getText().toString();
        Integer edad =parseInt(sendActivity_EditTextEdad.getText().toString());
        Intent intent = new Intent(this,ReceptorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(ReceptorActivity.NOMBRE, nombre);
        bundle.putString(ReceptorActivity.APELLIDO, apellido);
        bundle.putInt(ReceptorActivity.EDAD, edad);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}

