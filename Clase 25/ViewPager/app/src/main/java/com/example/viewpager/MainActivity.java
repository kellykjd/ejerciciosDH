package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.mainActivity_viewPager);
        AdapterViewPagerEquipos adapter = new AdapterViewPagerEquipos(getSupportFragmentManager(),crearLista());
        viewPager.setAdapter(adapter);
    }

    private List<EquipoDeFutbol> crearLista(){
        List<EquipoDeFutbol> equiposDeFutbol = new ArrayList<>();

        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("River","https://cdn5.dibujos.net/dibujos/pintados/201748/escudo-atletico-river-plate-deportes-escudos-de-futbol-11206687.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Huracan","https://images.all-free-download.com/images/graphiclarge/asociacion_club_sportivo_huracan_de_gobernador_gregores_132577.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("River","https://cdn5.dibujos.net/dibujos/pintados/201748/escudo-atletico-river-plate-deportes-escudos-de-futbol-11206687.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Huracan","https://images.all-free-download.com/images/graphiclarge/asociacion_club_sportivo_huracan_de_gobernador_gregores_132577.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("River","https://cdn5.dibujos.net/dibujos/pintados/201748/escudo-atletico-river-plate-deportes-escudos-de-futbol-11206687.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Huracan","https://images.all-free-download.com/images/graphiclarge/asociacion_club_sportivo_huracan_de_gobernador_gregores_132577.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("River","https://cdn5.dibujos.net/dibujos/pintados/201748/escudo-atletico-river-plate-deportes-escudos-de-futbol-11206687.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Huracan","https://images.all-free-download.com/images/graphiclarge/asociacion_club_sportivo_huracan_de_gobernador_gregores_132577.jpg"));
        return equiposDeFutbol;
    }


}
