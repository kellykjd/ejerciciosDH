package com.company;

public class ClienteEmpresa extends Cliente {
    //ATRIBUTOS

    private String nombreFantasia;

    //CONSTRUCTOR
    public ClienteEmpresa(String nombre, String apellido, Integer nroCliente, Integer dni, String cuit, String nombreFantasia) {
        super("N/A", "N/A", nroCliente, null, cuit);
        this.nombreFantasia = nombreFantasia;
    }

//METODOS
    public String getNombreFantasia() {
        return nombreFantasia;
    }
}