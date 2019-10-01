package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    //pongo como atributos la actividad lo nuevos componentes de material design

    //lo que rodea el edit text
    private TextInputLayout textInputLayoutNombre;
    //el nuevo edit text
    private TextInputEditText textInputEditTextNombre;
    //el boton circular
    private FloatingActionButton floatingActionButton;
    //el nevo layout
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        //el add text change listener escucha cambios en el edit text
        textInputEditTextNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            //el on text changed se corre cada vez que hay un cambio en el edit text
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //el charSequence es la cadena de texto que hay en el edit text
                if(charSequence.length() < 3){
                    //le seteo el mensaj de error al text imput layout
                    textInputLayoutNombre.setError("Nombre muy corto");
                }
                else {
                    //le borro el mensaje de error cuando el contenido este bien
                    textInputLayoutNombre.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });








        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textInputEditTextNombre.getText().toString().length() < 3){
                    textInputLayoutNombre.setError("el nombre tiene que contener mas de 3 caracteres");
                }
                else {
                    textInputLayoutNombre.setError(null);
                    //el snackBar aparece si el login fue exitoso
                    Snackbar.make(coordinatorLayout,"Login exitoso",Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }




    private void encontrarVistas(){
        textInputLayoutNombre= findViewById(R.id.textinput_nombre);
        textInputEditTextNombre = findViewById(R.id.textinputEditTextNombre);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);
    }

}
