package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
Restaurante tgithursday = new Restaurante();
LimpiezaGeneral empleado1 = new LimpiezaGeneral("Luis","Rodríguez",3500.0);
LimpiezaGeneral empleado2 = new LimpiezaGeneral("Ana","Angola",4000.0);
LavadorVajilla empleado3 = new LavadorVajilla("Omar","Centeno",3500.0,4);
LavadorVajilla empleado4 = new LavadorVajilla("Carlos","Fernández",3500.0,2);

tgithursday.listaDeEmpleados(empleado1);
tgithursday.listaDeEmpleados(empleado2);
tgithursday.listaDeEmpleados(empleado3);
tgithursday.listaDeEmpleados(empleado4);

tgithursday.pagarNomina();
    }
}
