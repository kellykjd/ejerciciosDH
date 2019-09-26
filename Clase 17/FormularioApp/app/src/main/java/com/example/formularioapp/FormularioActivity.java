package com.example.formularioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEdad;
    private EditText editTextCarrera;
    private EditText editTextEmail;
    private CheckBox checkBoxTorneos;
    private CheckBox checkBoxMeetUps;
    private CheckBox checkBoxAsados;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encontrarVistas();

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chequearCampos()){
                    irAActivityResultado();
                }

            }
        });
    }



    private Boolean chequearCampos() {
        Boolean todoOK = true;
        if(editTextNombre.getText().toString().length() <=2){
            Toast.makeText(this, "no completaste el nombre", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }

        String edadTexto = editTextEdad.getText().toString();
        Integer edadInteger = Integer.parseInt(edadTexto);
        if (edadInteger < 18){
            Toast.makeText(this, "el usuario no es mayor de edad", Toast.LENGTH_SHORT).show();
            todoOK = false;
        }



        return todoOK;
    }


    private void encontrarVistas(){
        editTextNombre = findViewById(R.id.FormularioActivity_editText_nombre);
        editTextApellido = findViewById(R.id.FormularioActivity_editText_apellido);
        editTextEdad = findViewById(R.id.FormularioActivity_editText_edad);
        editTextCarrera = findViewById(R.id.FormularioActivity_editText_carrera);
        editTextEmail = findViewById(R.id.FormularioActivity_editText_email);
        checkBoxAsados = findViewById(R.id.FormularioActivity_checkBox_asados);
        botonEnviar = findViewById(R.id.FormularioActivity_button_enviar);
    }

    private Bundle crearBundle(){
        Bundle bundle = new Bundle();
        bundle.putString(ResultActivity.CLAVE_NOMBRE,editTextNombre.getText().toString());
        bundle.putString(ResultActivity.CLAVE_APELLIDO, editTextApellido.getText().toString());

        String edadTexto = editTextEdad.getText().toString();
        Integer edadInteger = Integer.parseInt(edadTexto);

        bundle.putInt(ResultActivity.CLAVE_EDAD,edadInteger);

        Boolean quiereAsado = checkBoxAsados.isChecked();
        bundle.putBoolean(ResultActivity.CLAVE_ASADO,quiereAsado);


        return bundle;

    }

    private void irAActivityResultado(){
        Intent intent = new Intent(FormularioActivity.this,ResultActivity.class);
        Bundle bundle = crearBundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
