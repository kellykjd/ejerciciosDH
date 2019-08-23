package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Cliente otroCliente = new Cliente();
        ClienteIndividual unCliente = new ClienteIndividual("Pat","Ugarte",12344,3356432);
        CajaDeAhorros unaCuentaDeAhorros = new CajaDeAhorros(unCliente, 5);
        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(unCliente,2000.0);
        Cheque unCheque = new Cheque(7500.0,"Banco BBVA", "23/08/2019");

        //PRUEBAS CON CAJA DE AHORROS
        unaCuentaDeAhorros.depositar(2000.0);
        System.out.println(unaCuentaDeAhorros.getSaldo());
        unaCuentaDeAhorros.extraer(2500.0);
        unaCuentaDeAhorros.extraer(1000.0);
        unaCuentaDeAhorros.cobrarInteres();
        System.out.println(unaCuentaDeAhorros.getSaldo());

        //PRUEBAS CON CUENTA CORRIENTE
        unaCuentaCorriente.depositar(2000.0);
        unaCuentaCorriente.depositarCheque(unCheque);
        unaCuentaCorriente.extraerEfectivo(1500.0);
        unaCuentaCorriente.extraerEfectivo(8500.0);


    }
}