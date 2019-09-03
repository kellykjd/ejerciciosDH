package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GuardaRopa saveTheRopa = new GuardaRopa();

        Cliente laura = new Cliente("laura");
        Pantalon pantalon1 = new Pantalon("Levis","skiny");
        Vestido vestido1 = new Vestido("DG","black-winter");
        laura.prendas(pantalon1);
        laura.prendas(vestido1);

       // saveTheRopa.guardarPrendas(laura.getPrendas());
      //  saveTheRopa.mostrarPrendas();
     //   saveTheRopa.devolverPrendas(2);
        laura.getPrendas();

    }
}
