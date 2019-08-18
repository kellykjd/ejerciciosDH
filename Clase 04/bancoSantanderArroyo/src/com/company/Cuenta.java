package com.company;

public class Cuenta {

//ATRIBUTOS

private Integer nroCuenta;
private Double saldo;
private Cliente titular;

// CONSTRUCTOR

    public Cuenta(Cliente titular) {
        this.titular = titular;
        saldo = 0.00;
        System.out.println("CREASTE UNA NUEVA CUENTA");
    }


//METODOS

public void deposito(Double cantidadDinero){

        saldo=saldo+cantidadDinero;
        System.out.println("Su depósito fue de: $"+cantidadDinero+", y su saldo actual es: $"+saldo);
}

public void extraccion(Double cantidadDinero){

        if (cantidadDinero <= saldo){
            saldo=saldo-cantidadDinero;
            System.out.println("Su retiro fue de: " +cantidadDinero+", y su nuevo saldo es: "+saldo);
        }else{
            System.out.println("Fondos insuficientes");
        }
}

public Double getSaldo(){
        return saldo;
}

}
