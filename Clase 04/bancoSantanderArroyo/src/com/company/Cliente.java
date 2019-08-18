package com.company;

public class Cliente {
    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private Integer nroCliente;
    private Integer dni;
    private String cuit;

    //CONSTRUCTOR
        public Cliente(String nombre, String apellido, Integer nroCliente, Integer dni, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCliente = nroCliente;
        this.dni = dni;
        this.cuit = cuit;
    }


    //METODOS


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public Integer getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }
}
