package com.company;

public class Concesionaria {
//ATRIBUTOS
private Vehiculo vehiculo;
private Cliente cliente;
private Double monto;
private Venta registroVenta;
//CONSTRUCTOR

    public Concesionaria(Vehiculo carro1, Cliente cliente1, Double monto) {


    }


    //METODOS

    public void registrarVenta(Vehiculo vehiculo, Cliente cliente, ){

       // Venta nuevaVenta = new Venta(cliente, );

        this.registroVenta = new Venta(registroVenta.getCliente(), registroVenta.getVehiculo(), registroVenta.getMontoVenta());
        System.out.println("Se registró una nueva venta con los parámetros: "+registroVenta.getCliente()+", "+registroVenta.getVehiculo()+" y "+registroVenta.getMontoVenta());
    }
}
