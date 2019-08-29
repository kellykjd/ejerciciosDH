package com.company;

import java.util.ArrayList;

public class TorreDeControl {
    //Atributos
    private ArrayList<Volable>listaDeVolable =new ArrayList<>();

    //Metodos

    public void agregarVolador(Volable unVolable){
        listaDeVolable.add(unVolable);
    }


    public void vuelenTodos(){
        for (Integer i =0; i<listaDeVolable.size(); i++){

            Volable nuevoVolable =listaDeVolable.get(i);
            nuevoVolable.volar();

        }
    }

}
