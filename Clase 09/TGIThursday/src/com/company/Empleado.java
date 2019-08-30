package com.company;
abstract class Empleado {
private String nombre;
private String apellido;
private Double sueldoMensual;

    public Empleado(String nombre, String apellido, Double sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }


    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void cobrar(){

        System.out.println("El empleado "+nombre+" cobrará: $"+sueldoMensual);
}


}
