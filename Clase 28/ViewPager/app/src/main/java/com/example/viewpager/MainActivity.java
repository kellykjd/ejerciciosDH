package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //encuentro el view Pager
        viewPager = findViewById(R.id.mainActivity_viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        //creo el adapter
        AdapterViewPagerEquipos adapter = new AdapterViewPagerEquipos(getSupportFragmentManager(),crearLista());
        //le seteo el adapter al view pager
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }







    //creo un metodo que crea la lista de fragments (uno no esta bien el url para que muestre el error
    private List<EquipoDeFutbol> crearLista(){
        List<EquipoDeFutbol> equiposDeFutbol = new ArrayList<>();

        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Riber","https://res.cloudinary.com/teepublic/image/private/s--6kuc6svW--/t_Preview/b_rgb:ffffff,c_limit,f_jpg,h_630,q_90,w_630/v1492523867/production/designs/1476719_1.jpg" ));
        equiposDeFutbol.add(new EquipoDeFutbol("Independiente","https://http2.mlstatic.com/cortante-de-galletitas-escudo-de-independiente-cookie-futbol-D_NQ_NP_514305-MLA25000660855_082016-F.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Riber","https://res.cloudinary.com/teepublic/image/private/s--6kuc6svW--/t_Preview/b_rgb:ffffff,c_limit,f_jpg,h_630,q_90,w_630/v1492523867/production/designs/1476719_1.jpg" ));
        equiposDeFutbol.add(new EquipoDeFutbol("Independiente","https://http2.mlstatic.com/cortante-de-galletitas-escudo-de-independiente-cookie-futbol-D_NQ_NP_514305-MLA25000660855_082016-F.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Riber","https://res.cloudinary.com/teepublic/image/private/s--6kuc6svW--/t_Preview/b_rgb:ffffff,c_limit,f_jpg,h_630,q_90,w_630/v1492523867/production/designs/1476719_1.jpg" ));
        equiposDeFutbol.add(new EquipoDeFutbol("Independiente","https://http2.mlstatic.com/cortante-de-galletitas-escudo-de-independiente-cookie-futbol-D_NQ_NP_514305-MLA25000660855_082016-F.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Boca","https://upload.wikimedia.org/wikipedia/commons/a/ad/Boca-Juniors.jpg"));
        equiposDeFutbol.add(new EquipoDeFutbol("Riber","https://res.cloudinary.com/teepublic/image/private/s--6kuc6svW--/t_Preview/b_rgb:ffffff,c_limit,f_jpg,h_630,q_90,w_630/v1492523867/production/designs/1476719_1.jpg" ));
        equiposDeFutbol.add(new EquipoDeFutbol("Independiente","https://http2.mlstatic.com/cortante-de-galletitas-escudo-de-independiente-cookie-futbol-D_NQ_NP_514305-MLA25000660855_082016-F.jpg"));
        return equiposDeFutbol;
    }
}
