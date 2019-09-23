package com.example.loginfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botonLogin;
    private Button botonRegister;
    private EditText editTextUsername;
    private EditText editTextPasw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonLogin = findViewById(R.id.Button_Login);
        botonRegister = findViewById(R.id.Button_Register);
        editTextUsername = findViewById(R.id.EditText_Username);
        editTextPasw = findViewById(R.id.EditText_Password);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarDeActivityLogin();

            }
        });

        botonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void cambiarDeActivityLogin(){
        //guardo el valor del username
        String username = editTextUsername.getText().toString();
        String password = editTextPasw.getText().toString();
        LoginFragment loginFragment = new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
        }else{
            // creo el bundle (la valija)
            Bundle bundle = new Bundle();
            // le guardo los valores al bundle (cargo la valija)
            bundle.putString(LoginFragment.CLAVE_USUARIO,username);
            //le ponemos el bundle al intent
            loginFragment.setArguments(bundle);
            //arrancamos la nueva activity
            fragmentTransaction.add(R.id.contenedorDeFragment,loginFragment,null);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
    }



}
