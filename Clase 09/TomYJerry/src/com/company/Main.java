package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Raton> ratones =new ArrayList<>();

        Gato miGato = new Gato("TOM");
        Raton raton1 = new Raton("Jerry",0.20);
        Raton raton2 = new Raton("Pepito",0.10);
        Raton raton3 = new Raton("Lucas",0.15);
        Raton raton4 = new Raton("Mickey",0.05);

        ratones.add(raton1);
        ratones.add(raton2);
        ratones.add(raton3);
        ratones.add(raton4);

    miGato.comerRaton(raton1);
    miGato.comerRaton(ratones);
    miGato.correr(5);
    System.out.println(miGato.meConvieneComerA(raton1,5));

    }
}
