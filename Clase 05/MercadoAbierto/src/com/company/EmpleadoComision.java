package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoComision extends Empleado {
    List<Double> listaVentas = new ArrayList<>();
    private Integer comision;
    private Double sumaTotal;

    public EmpleadoComision(String nombre, Double sueldo, Integer comision) {
        super(nombre, sueldo);
        this.comision = comision;
        sumaTotal=0.0;
    }

    public void registrarVenta(Double montoVenta){
        listaVentas.add(montoVenta);
    }

    @Override
    public void cobrar() {
        System.out.println("El empleado "+getNombre()+" registró las siguientes ventas y comisiones:");
        for (Double unaVenta: listaVentas) {
            System.out.println("Venta: "+unaVenta+" y comisión: "+((unaVenta*comision)/100));
            sumaTotal=sumaTotal+(unaVenta+((unaVenta*comision)/100));
        }
        System.out.println("Su sueldo a cobrar es de: "+(getSueldo()+sumaTotal));
    }
}
