package com.example.digitalhouse.floatbuttonbase;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Created by andres on 04/10/16.
 */
public class SantaFragment extends Fragment {

    private ActivityListener activityListener;
    private TextInputLayout textInputLayoutMensaje;
    private TextInputEditText textInputEditTextMensaje;
    private TextInputEditText textInputEditTextRegalos;
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout coordinatorLayoutSanta;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.santa_fragment, container, false);
        encontrarVistas(view);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chequearCampos()) {
                    enviarInformacionActivity();

                } else {
                    textInputLayoutMensaje.setError("Por favor completa el campo mensaje");
                }
            }
        });
        return view;

    }

    private void encontrarVistas(View view){
        textInputLayoutMensaje = view.findViewById(R.id.SantaFragment_TextView_mensaje);
        textInputEditTextMensaje = view.findViewById(R.id.SantaFragment_EditText_mensaje);
        textInputEditTextRegalos = view.findViewById(R.id.SantaFragment_EditText_regalos);
        floatingActionButton = view.findViewById(R.id.floatingActionButton);
        coordinatorLayoutSanta = view.findViewById(R.id.coordinatorLayoutSanta);
    }

    private Boolean chequearCampos(){
        Boolean todoOk = true;

        if (textInputEditTextMensaje.getText().toString().length()<1){
            todoOk = false;
        }

        return todoOk;
    }

    public interface ActivityListener{
        public void notificarActivity(String mensaje, String regalos);
    }

    private void enviarInformacionActivity(){
        if (textInputEditTextRegalos.getText().toString().isEmpty()){
            activityListener.notificarActivity(textInputEditTextMensaje.getText().toString(),"No pidió regalos");
        }else{
            activityListener.notificarActivity(textInputEditTextMensaje.getText().toString(),textInputEditTextRegalos.getText().toString());}


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activityListener = (ActivityListener) context;
    }



}
