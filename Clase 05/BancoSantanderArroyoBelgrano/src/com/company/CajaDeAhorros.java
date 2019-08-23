package com.company;

public class CajaDeAhorros extends Cuenta {
    //ATRIBUTOS
    private Integer tasaDeInteres;

    //CONSTRUCTOR

    public CajaDeAhorros(Cliente titular, Integer tasaDeInteres) {
        super(titular);
        this.tasaDeInteres = tasaDeInteres;
    }

    //METODOS

    public void cobrarInteres() {
        depositar(getSaldo() + (getSaldo() * tasaDeInteres / 100));
        System.out.println("Se ha sumado a su cuenta el interés del mes. Su nuevo saldo es de "+ getSaldo());
    }

}

