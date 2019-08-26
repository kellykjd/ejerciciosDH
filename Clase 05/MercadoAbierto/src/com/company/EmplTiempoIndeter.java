package com.company;

public class EmplTiempoIndeter extends Empleado{

    private Double suplemento1;
    private Double suplemento2;
    private Integer nroHijos;
    private Integer antigüedad;

    public EmplTiempoIndeter(String nombre, Double sueldo, Integer nroHijos, Integer antigüedad) {
        super(nombre, sueldo);
        this.suplemento1 = 0.00;
        this.suplemento2 = 0.00;
        this.nroHijos = nroHijos;
        this.antigüedad = antigüedad;
    }

    @Override
    public void cobrar() {
        suplemento1 = 200.0 * nroHijos;
        suplemento2 = 100.0 * antigüedad;
        if (suplemento1 <= 1000 && suplemento2<=500){
            System.out.println("El empleado "+getNombre()+" cobrará: "+(getSueldo()+suplemento1+suplemento2));
        }else if(suplemento1 > 1000 && suplemento2<=500){
            System.out.println("El empleado "+getNombre()+" cobrará: "+(getSueldo()+1000+suplemento2));
        }else if(suplemento1 <= 1000 && suplemento2>500){
            System.out.println("El empleado "+getNombre()+" cobrará: "+(getSueldo()+suplemento1+500));
        }else{
            System.out.println("El empleado "+getNombre()+" cobrará: "+(getSueldo()+1000+500));
        }
    }
}
