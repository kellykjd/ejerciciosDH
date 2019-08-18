package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Cliente unCliente = new Cliente("Pat","Ugarte",12344, 1234567,"1234556");
    Cuenta miCuenta = new Cuenta(unCliente);
        System.out.println(miCuenta.getSaldo());
    miCuenta.deposito(2000.00);
        System.out.println(miCuenta.getSaldo());
        miCuenta.extraccion(500.00);
        System.out.println(miCuenta.getSaldo());

    }
}
