package com.example.loginhechoenclasebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextUsername = findViewById(R.id.RegisterActivityEditText_Username);
        editTextPassword = findViewById(R.id.RegisterActivityEditText_Password);
        editTextConfirmPassword = findViewById(R.id.RegisterActivityEditText_ConfirmPassword);
        buttonRegister = findViewById(R.id.RegisterActivityButton_Register);

        //traigo el intent
        Intent intentRegister = getIntent();
        //le pido lo que requiero al bundle
        // le seteamos al textView el valor del username

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarAMainActivity();
            }
        });
    }


    private void cambiarAMainActivity(){

        if (TextUtils.isEmpty(editTextUsername.getText()) || TextUtils.isEmpty(editTextPassword.getText())){
            Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
        }else if(!editTextPassword.getText().toString().equals(editTextConfirmPassword.getText().toString())){
            Toast.makeText(this, "Las contraseña no coinciden!!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
                }
    }
}
