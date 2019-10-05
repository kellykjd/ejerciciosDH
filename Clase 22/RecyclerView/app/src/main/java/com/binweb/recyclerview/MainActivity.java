package com.binweb.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewVillanos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewVillanos = findViewById(R.id.mainActivity_recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        VillanoAdpater adapter = new VillanoAdpater((generarLista()));
        recyclerViewVillanos.setAdapter(adapter);
        recyclerViewVillanos.setLayoutManager(linearLayoutManager);

    }

    private List<Villano> generarLista(){
        List<Villano> listaVillanos = new ArrayList<>();
        listaVillanos.add(new Villano("Jose","posponer asados"));
        listaVillanos.add(new Villano("Pat","irse a lima los viernes"));
        listaVillanos.add(new Villano("Edu","Adulterar el kahoot"));
        listaVillanos.add(new Villano("Santi","hacernos sentir viejos"));
        listaVillanos.add(new Villano("Jose","posponer asados"));
        listaVillanos.add(new Villano("Pat","irse a lima los viernes"));
        listaVillanos.add(new Villano("Edu","Adulterar el kahoot"));
        listaVillanos.add(new Villano("Santi","hacernos sentir viejos"));
        listaVillanos.add(new Villano("Jose","posponer asados"));
        listaVillanos.add(new Villano("Pat","irse a lima los viernes"));
        listaVillanos.add(new Villano("Edu","Adulterar el kahoot"));
        listaVillanos.add(new Villano("Santi","hacernos sentir viejos"));



        return listaVillanos;
    }

}
