package com.example.digitalhouse.floatbuttonbase;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

import static com.example.digitalhouse.floatbuttonbase.MensajeActivity.CLAVE_MENSAJE;
import static com.example.digitalhouse.floatbuttonbase.MensajeActivity.CLAVE_REGALOS;


/**
 * A simple {@link Fragment} subclass.
 */
public class MensajeFragment extends Fragment {
    ActivityReceptor activityReceptor;
    private TextView textViewMensaje;
    private TextView textViewRegalos;
    private CoordinatorLayout coordinatorLayoutMensaje;

    public MensajeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mensaje, container, false);


        encontrarVistas(view);
        Bundle bundle = getArguments();
        String mensaje = bundle.getString(CLAVE_MENSAJE);
        String regalos = bundle.getString(CLAVE_REGALOS);
        textViewMensaje.setText(mensaje);
        textViewRegalos.setText(regalos);
        Snackbar.make(coordinatorLayoutMensaje,"Mensaje enviado",Snackbar.LENGTH_LONG).show();


        return view;

    }

    private void encontrarVistas(View view){

        textViewMensaje = view.findViewById(R.id.MensajeFragment_TextView_mensaje);
        textViewRegalos = view.findViewById(R.id.MensajeFragment_TextView_regalos);
        coordinatorLayoutMensaje = view.findViewById(R.id.coordinatorLayoutMensaje);
    }

    public interface ActivityReceptor{
        public void recibirActivity(String mensaje, String regalos);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activityReceptor = (ActivityReceptor) context;
    }


}
