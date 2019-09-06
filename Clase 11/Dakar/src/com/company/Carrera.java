package com.company;

import java.util.*;

public class Carrera {
    private Integer distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
        this.socorristaAuto  = new SocorristaAuto();
        this.socorristaMoto  = new SocorristaMoto();
    }

    private boolean hayCupo(){
        return listaDeVehiculos.size() < cantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (hayCupo()) {
            listaDeVehiculos.add(new Auto(velocidad,aceleracion,anguloDeGiro,patente));
            System.out.println("El vehículo con patente " + patente + " fue inscrito con éxito.");
    }else{
            System.out.println("Lo siento, se ha llegado al tope de vehículos inscritos.");}
            System.out.println(listaDeVehiculos);
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (hayCupo()) {
                                //Esta es otra manera de instanciar un nuevo objeto de tipo vehículo para agregarlo directamente
                                //a la lista.
            listaDeVehiculos.add(new Moto(velocidad,aceleracion,anguloDeGiro,patente));
            System.out.println("El vehículo con patente " + patente + " fue inscrito con éxito.");
        }else{
            System.out.println("Lo siento, se ha llegado al tope de vehículos inscritos.");}
        System.out.println(listaDeVehiculos);
    }

    private Vehiculo buscarPorPatente(String patente) {
        Vehiculo vehiculoABuscar = null;
        for (Vehiculo unVehiculo : listaDeVehiculos) {
            if (unVehiculo.getPatente().equals(patente)) { //recordar que el método equals está sobreescrito.
                vehiculoABuscar = unVehiculo;
            }
        }
    }

    public void eliminarVehiculo(Vehiculo unVehiculo) {
        if (listaDeVehiculos.remove(unVehiculo)){ //"listaDeVehiculos.remove" devuelve un booleano y a su vez se ejecuta el código al momento
        System.out.println("El vehículo " + unVehiculo + " fue eliminado con éxito");}
        else {
            System.out.println("No se pudo remover");
        }
        System.out.println(listaDeVehiculos);
    }

//NUNCA SE DEBE ELIMINAR ALGO DE UNA LISTA DENTRO DE UN FOR, PARA ELLO SE GUARDA EL VALOR EN  UNA VARIABLE QUE LUEGO
//SE UTILIZARÁ PARA ELIMINAR ESE ELEMENTO DE LA LISTA
    public void eliminarVehiculo(String unaPatente) {


        Vehiculo vehiculoAEliminar= buscarPorPatente(unaPatente);
        eliminarVehiculo(vehiculoAEliminar);

    }
/*

    public void eliminarVehiculoconPatente(String unaPatente) {
        listaDeVehiculos.remove(unaPatente);
        System.out.println("El vehículo " + unaPatente + " fue eliminado con éxito");
        System.out.println(listaDeVehiculos);
    }
*/

    public Vehiculo definirGanador() { //TODO: insertar un try and catch para que no corra el código si la lista está vacía ya que uede romper

        Vehiculo vehiculoGanador = listaDeVehiculos.get(0);
        for (Vehiculo vehiculo: listaDeVehiculos){
            if (vehiculo.calcularValor()>vehiculoGanador.calcularValor()){
                vehiculoGanador =vehiculo;
            }
        }
        return vehiculoGanador;
    }

    public void socorrerAuto(String patente){
        try{
            Auto vehiculoASocorrer = (Auto) buscarPorPatente(patente);
            socorristaAuto.socorrer(vehiculoASocorrer);

        }catch (ClassCastException e){

            System.out.println("Lo que estás intentado socorrer no es un Auto");
         }
       }

    public void socorrerMoto(String patente){
        try{
            Moto vehiculoASocorrer = (Moto) buscarPorPatente(patente);
            socorristaMoto.socorrer(vehiculoASocorrer);

        }catch (ClassCastException e){

            System.out.println("Lo que estás intentado socorrer no es una moto");

        }


    }

    }




