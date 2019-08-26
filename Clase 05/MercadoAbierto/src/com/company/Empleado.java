package com.company;

public class Empleado {

    private String nombre;
    private Double sueldo;

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void cobrar(){
        System.out.println("El empleado "+getNombre()+" cobrará: "+sueldo);
    }
}
