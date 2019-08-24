package com.company;

import java.util.ArrayList;

public class Impresora {
    private ArrayList<Imprimible>listaDeImpresión  = new ArrayList<>();

    public void añadirALaListaDeImpresion(Imprimible unImprimible){
        listaDeImpresión.add(unImprimible);
    }



    public void imprimir(){

        for (int i =0; i<listaDeImpresión.size(); i++){
            Imprimible unImprimible = listaDeImpresión.get(i);
            System.out.println(listaDeImpresión.get(i));
            unImprimible.imprimir();
        }

/*        for (Imprimible unImprimible:listaDeImpresión){
            unImprimible.imprimir();
        }

        */

        }
    }
