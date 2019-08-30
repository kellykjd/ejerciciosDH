package com.company;

public class Raton {
    //ATRIBUTOS
    private String nombre;
    private Double peso;

    //CONSTRUCTOR

    public Raton(String nombre, Double peso) {
        this.nombre=nombre;
        this.peso = peso;
    }

    //METODOS

    public String getNombre() {
        return nombre;
    }
    public Double getPeso() {
        return peso;
    }
}
