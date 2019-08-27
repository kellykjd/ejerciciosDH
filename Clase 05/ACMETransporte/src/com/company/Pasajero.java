package com.company;

public class Pasajero {
    private String nombre;
    private Boolean preferencia;

    public Pasajero(String nombre, Boolean preferencia) {
        this.nombre = nombre;
        this.preferencia = preferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getPreferencia() {
        return preferencia;
    }
}
