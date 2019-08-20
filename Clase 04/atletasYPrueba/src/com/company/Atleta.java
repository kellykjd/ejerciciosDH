package com.company;

public class Atleta {

    //ATRIBUTOS
    private String nombre;
    private Integer nivel;
    private Integer energia;

    //CONSTRUCTOR

    public Atleta(String nombre, Integer nivel, Integer energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = energia;
    }

    //Metodo


    public String getNombre() {
        return nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getEnergia() {
        return energia;
    }
}

