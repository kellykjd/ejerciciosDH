package com.company;

import java.util.ArrayList;
import java.util.List;

public class Packs implements Explotables {
    //ATRIBUTOS
//Defino el array de los packs que utilizaremos en NonVivoGroup para agregar explotables tipo Packs
    private List<Explotables> listaDePacks = new ArrayList<>();

//CONSTRUCTOR

    //METODOS
//Defino el método para agregar un explotable a la listaDePacks
    public void añadirPacksExplotables(Explotables unExplotable) {
        listaDePacks.add(unExplotable);
    }

    //Defino cómo se van a explotar los packs con for each. Por cada elemento de la lista....se debe explotar
    @Override
    public void explotar() {
        for (Explotables unExplotable : listaDePacks) {
            unExplotable.explotar();

        }
    }
}


