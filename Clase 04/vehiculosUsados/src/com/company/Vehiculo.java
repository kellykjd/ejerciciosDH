package com.company;

public class Vehiculo {
//ATRIBUTOS

    private String marca;
    private String modelo;
    private Integer anioFabricacion;
    private String color;
    private Integer km;

    //CONSTRUCTOR


    public Vehiculo(String marca, String modelo, Integer anioFabricacion, String color, Integer km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
        this.km = km;
    }

    //METODOS


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getColor() {
        return color;
    }

    public Integer getKm() {
        return km;
    }
}
