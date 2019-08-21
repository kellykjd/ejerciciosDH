package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tripode tripode = new Tripode(true, 4, 20, 7);

        tripode.definirAltura(17);
        tripode.guardar();
        tripode.listoParaGuardar();
        tripode.desplegar();
        tripode.plegar();
        tripode.usar();
        tripode.listoParaUsar();

    }
}
