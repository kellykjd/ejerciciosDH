package com.company;

public class Venta {

    //ATRIBUTO

    private Double montoVenta;
    private Vehiculo vehiculo;
    private Cliente cliente;

    //CONSTRUCTOR

    public Venta(Double montoVenta, Vehiculo vehiculo, Cliente cliente) {
       this.montoVenta = montoVenta;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    //METODO

    public Double getMontoVenta() {
        return montoVenta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
