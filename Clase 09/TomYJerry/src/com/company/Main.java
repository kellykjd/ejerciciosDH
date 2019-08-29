package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gato miGato = new Gato("Pepe");
        Raton raton1 = new Raton(0.20);
        Raton raton2 = new Raton(0.10);
        Raton raton3 = new Raton(0.15);
        Raton raton4 = new Raton(0.05);

        miGato.agregarRatones(raton1);
        miGato.agregarRatones(raton2);
        miGato.agregarRatones(raton3);
        miGato.agregarRatones(raton4);

        System.out.println(miGato.getListadoRatones());
        miGato.correr(5);
       // System.out.println(miGato.meConvieneComerA(raton1,5));

    }
}
