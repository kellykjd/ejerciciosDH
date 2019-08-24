package com.company;

import java.util.ArrayList;

public class TorreDeControl {

    private ArrayList<Volable>listaDeVolable =new ArrayList<>();

    public void agregarVolador(Volable unVolable){
        listaDeVolable.add(unVolable);

    }
    public void vuelenTodos(){
        for (Integer i =0; i<listaDeVolable.size(); i++){

            Volable unVolable =listaDeVolable.get(i);
            unVolable.volar();

        }
    }

}
