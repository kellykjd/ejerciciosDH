package com.company;

public class EmpleadoFijo extends Empleado {
    private Integer mesesTrabajo;

    public EmpleadoFijo(String nombre, Double sueldo, Integer mesesTrabajo) {
        super(nombre, sueldo);
        this.mesesTrabajo = mesesTrabajo;
    }

    @Override
    public void cobrar() {
        super.cobrar();
        System.out.println("Su contrato tiene "+mesesTrabajo+ " meses.");

    }
}
