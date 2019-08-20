package com.company;

public class Main {

    public static void main(String[] args) {

JugadorDeFutbol jugadorUno = new JugadorDeFutbol("Luis", 15, 30, 7, 40);
JugadorDeFutbol jugadorDos = new JugadorDeFutbol("Carlos", 40, 5,2, 3);
SesionDeEntrenamiento sesionUno = new SesionDeEntrenamiento(jugadorUno);
SesionDeEntrenamiento sesionDos = new SesionDeEntrenamiento(jugadorDos);


            sesionUno.entrenarA(jugadorUno);
            sesionDos.entrenarA(jugadorDos);

    }

}