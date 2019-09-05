package com.company;

import java.util.*;

public class Carrera {
    private Integer distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private Map<String, List<Integer>>listaDeVehiculos ;


    private Double ganador;
    private List<Vehiculo> vehiculos;


    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new HashMap<>();


        this.vehiculos = new ArrayList<>();
        this.ganador = 0.0;
    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        List<Integer> caracteristicasVehiculo = new ArrayList<>();
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) {
            caracteristicasVehiculo.add(velocidad);
            caracteristicasVehiculo.add(aceleracion);
            caracteristicasVehiculo.add(anguloDeGiro);
            listaDeVehiculos.put(patente, caracteristicasVehiculo);
            System.out.println("El vehículo con patente "+patente+" fue inscrito con éxito.");
        }else{
            System.out.println("Lo siento, se ha llegado al tope de vehículos inscritos.");
        }
        System.out.println(listaDeVehiculos);
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        List<Integer> caracteristicasVehiculo = new ArrayList<>();
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) {
            caracteristicasVehiculo.add(velocidad);
            caracteristicasVehiculo.add(aceleracion);
            caracteristicasVehiculo.add(anguloDeGiro);
            listaDeVehiculos.put(patente, caracteristicasVehiculo);
            System.out.println("El vehículo con patente "+patente+" fue inscrito con éxito.");
        }else{
            System.out.println("Lo siento, se ha llegado al tope de vehículos inscritos.");
        }
        System.out.println(listaDeVehiculos);
    }

    public void eliminarVehiculo(Vehiculo unVehiculo){
        listaDeVehiculos.remove(unVehiculo.getPatente());
        System.out.println("El vehículo "+unVehiculo+" fue eliminadoc on éxito");
        System.out.println(listaDeVehiculos);
    }

    public void eliminarVehiculoconPatente(String unaPatente){
        listaDeVehiculos.remove(unaPatente);
        System.out.println("El vehículo "+unaPatente+" fue eliminadoc on éxito");
        System.out.println(listaDeVehiculos);
    }

    public void definirGanador(){


        }

    }



