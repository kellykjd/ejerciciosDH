package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GuardaRopa saveTheRopa = new GuardaRopa();
        Prenda pantalon1 = new Pantalon("Levis","skiny");
        Vestido vestido1 = new Vestido("DG","black-winter");
        List<Prenda> miLista = new ArrayList<>();
        List<Prenda> miLista2 = new ArrayList<>();
        List<Prenda> miLista3 = new ArrayList<>();

        miLista.add(pantalon1);
        miLista.add(vestido1);
        miLista2.add(vestido1);
        miLista2.add(pantalon1);
        miLista3.add(vestido1);


     saveTheRopa.guardarPrendas(miLista);
     saveTheRopa.guardarPrendas(miLista2);
    saveTheRopa.guardarPrendas(miLista3);
     saveTheRopa.mostrarPrendas();
     saveTheRopa.devolverPrendas(3);

    }
}
