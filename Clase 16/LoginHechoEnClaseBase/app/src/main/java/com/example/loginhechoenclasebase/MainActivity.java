package com.example.loginhechoenclasebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //componentes visuales de mi activity
    private Button botonLogin;
    private Button botonRegister;
    private EditText editTextUsername;
    private EditText editTextPasw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //busco los componentes visuales haciendo el findViewById

        botonLogin = findViewById(R.id.Button_Login);
        botonRegister = findViewById(R.id.Button_Register);
        editTextUsername = findViewById(R.id.EditText_Username);
        editTextPasw = findViewById(R.id.EditText_Password);

        //creo el escuchador del boton

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cambiarDeActivityLogin();
            }
        });

        botonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarDeActivityRegister();
            }
        });

        Intent mainInten = getIntent();

    }


    private void cambiarDeActivityLogin(){
        //guardo el valor del username
        String username = editTextUsername.getText().toString();
        // creo el intent a la nueva actividad (el pasaje)
        Intent intent = new Intent(this,SegundaActivity.class);
        // creo el bundle (la valija)
        Bundle bundle = new Bundle();
        // le guardo los valores al bundle (cargo la valija)
        bundle.putString(SegundaActivity.CLAVE_USUARIO,username);
        //le ponemos el bundle al intent
        intent.putExtras(bundle);
        //arrancamos la nueva activity
        startActivity(intent);
    }


    private void cambiarDeActivityRegister(){

        // creo el intent a la nueva actividad (el pasaje)
        Intent intentRegister = new Intent(this,RegisterActivity.class);

        //arrancamos la nueva activity
        startActivity(intentRegister);
    }


}
