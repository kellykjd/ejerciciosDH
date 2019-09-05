package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrera {
    private Integer distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private Map<String, List<Integer>> listaDeVehiculos;
    private Double ganador;

    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, Map<String, List<Integer>> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new HashMap<>();
        this.ganador = 0.0;
    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        List<Integer> caracteristicas = new ArrayList<>();
        caracteristicas.add(velocidad);
        caracteristicas.add(aceleracion);
        caracteristicas.add(anguloDeGiro);
        listaDeVehiculos.put(patente, caracteristicas);
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        List<Integer> caracteristicas = new ArrayList<>();
        caracteristicas.add(velocidad);
        caracteristicas.add(aceleracion);
        caracteristicas.add(anguloDeGiro);
        listaDeVehiculos.put(patente, caracteristicas);
    }

    public void eliminarVehiculo(Vehiculo unVehiculo){
        listaDeVehiculos.remove(unVehiculo.getPatente());
    }

    public void eliminarVehiculoconPatente(String unaPatente){
        listaDeVehiculos.remove(unaPatente);
    }

    public void definirGanador(){


    }

}
