package com.example.randomgot;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewPersonaje;
    private TextView textViewPersonaje;
    private Button botonDescubrirPersonaje;
    private List<Integer> imagenes= new ArrayList<>();
    private Random rnd= new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewPersonaje = findViewById(R.id.mainActivity_imageViewPersonaje);
        textViewPersonaje = findViewById(R.id.mainActivity_textViewPersonaje);
        botonDescubrirPersonaje = findViewById(R.id.mainActivity_botonDescubrirPersonaje);

        imagenes.add(R.drawable.cersei);
        imagenes.add(R.drawable.nightking);
        imagenes.add(R.drawable.daenerys);
        imagenes.add(R.drawable.jonsnow);
        imagenes.add(R.drawable.tyrion);

        botonDescubrirPersonaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer rndInt = rnd.nextInt(5);
                String tag = getResources().getResourceEntryName(imagenes.get(rndInt));

                imageViewPersonaje.setImageResource(imagenes.get(rndInt));
                textViewPersonaje.setText(tag);


            }
        });



    }

}
