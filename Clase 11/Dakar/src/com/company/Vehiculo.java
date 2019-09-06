package com.company;

import java.util.Objects;

public abstract class Vehiculo {
    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer ruedas;


    public Vehiculo(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Double peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }


    public Double calcularValor(){
        return velocidad*(aceleracion/2)/(anguloDeGiro*(peso-ruedas*100));
    }

    //Sobrescribo el equal para que compare las patentes y pueda eliminar el vehículo cuando lo pida
   /* @Override
    public boolean equals(Object obj) {
        Vehiculo unVehiculo = (Vehiculo) obj;
        return unVehiculo.patente.equals(this.patente);
    }*/

   //Esta es otra manera de hacer el override de equals() con Generate

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return patente.equals(vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    public String toString(){
        return velocidad+", "+aceleracion+", "+anguloDeGiro+", "+patente;
    }


}
