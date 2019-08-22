package com.company;

public class Cliente {
    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private String datoDeContacto;

    //CONSTRUCTOR
    public Cliente(String nombre, String apellido, String datoDeContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.datoDeContacto = datoDeContacto;
    }

    //METODOS

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDatoDeContacto() {
        return datoDeContacto;
    }
}
