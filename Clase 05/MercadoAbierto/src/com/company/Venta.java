package com.company;

public class Venta {
private Double montoVenta;
private Integer comision;
private Double montoACobrar;

    public Venta(Double montoVenta) {
        this.montoVenta = montoVenta;
        this.comision = 5;
        this.montoACobrar = 0.0;

    }

    public Double calculoCobro(Double comision, Double montoACobrar){
       return montoVenta+(montoVenta*comision/100);
    }
}
