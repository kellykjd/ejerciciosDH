package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Cliente otroCliente = new Cliente();
        ClienteIndividual unCliente = new ClienteIndividual("Pat","Ugarte",12344,3356432);
        CajaDeAhorros unaCuenta = new CajaDeAhorros(unCliente, 5);

        System.out.println(unaCuenta.getSaldo());

        unaCuenta.depositar(2000.0);

        System.out.println(unaCuenta.getSaldo());

        unaCuenta.extraer(2500.0);
        unaCuenta.extraer(1000.0);
        unaCuenta.cobrarInteres();
    }
}