package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textInputLayoutNombre;
    private TextInputEditText textInputEditTextNombre;
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

/* validación de error  mediante el floactingActionButton
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textInputEditTextNombre.getText().toString().length()<3){
                    textInputLayoutNombre.setError("El nombre es muy corto");
                }else{
                    textInputLayoutNombre.setError(null);
                }
                Snackbar.make(coordinatorLayout,"Login exitoso",Snackbar.LENGTH_LONG).show();
            }
        });*/

        textInputEditTextNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Estos métodos deben quedarse obligatoriamente así no se usen
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length()<3){
                    textInputLayoutNombre.setError("El nombre es muy corto");
                }else{
                    textInputLayoutNombre.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Estos métodos deben quedarse obligatoriamente así no se usen
            }
        });



    }

    private void encontrarVistas() {
        textInputLayoutNombre = findViewById(R.id.TextInput_nombre);
        textInputEditTextNombre = findViewById(R.id.TextInputEditText_nombre);
        floatingActionButton = findViewById(R.id.FloatingAction_Button);
        coordinatorLayout = findViewById(R.id.MainActivityCoordinatorLayout);
    }
}
