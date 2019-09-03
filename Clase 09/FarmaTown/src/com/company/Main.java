package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente1 = new Cliente("Luis","Paracetamol");
        Medicamento unMedicamento = new Medicamento();
        Medicamento otroMedicamento = new Medicamento();

        unMedicamento.contiene("Paracetamol");
        unMedicamento.contiene("Loratadina");
        unMedicamento.contiene("Amoxicilina");

        otroMedicamento.contiene("Ibuprofeno");
        otroMedicamento.contiene("Vitamnia E");
        otroMedicamento.contiene("sdfsdfsdf");

        unMedicamento.sePuedeVender(cliente1);
        otroMedicamento.sePuedeVender(cliente1);

    //Crear droguería
    //Crear un cliente ingresando nombre y droga al que es alergico
    //Crear un medicamento agregando una lista de drogas
    //Usar el método de droguería para saber si un medicamento contiene la droga al que es alérgico el cliente
    }
}
