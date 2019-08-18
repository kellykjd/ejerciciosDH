package com.company;

public class Main { //CLASE

    public static void main(String[] args) { //MÉTODO

   Perro miPrimerPerro = new Perro("Jorge");
    Perro miSegundoPerro = new Perro("Mia");
    Perro miTercerPerro = new Perro("Jorgelin");

        Persona jose = new Persona("Jorge", miSegundoPerro);

        jose.pasearPerro(25);
    }
}
