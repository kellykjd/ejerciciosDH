package com.company;

public class LavadorVajilla extends Empleado{
    private Integer vajillasRotas;


    public LavadorVajilla(String nombre, String apellido, Double sueldoMensual, Integer vajillasRotas) {
        super(nombre, apellido, sueldoMensual);
        this.vajillasRotas = vajillasRotas;

    }

    public Integer getVajillasRotas() {
        return vajillasRotas;
    }

    @Override
    public void cobrar() {
    Double sueldoCalculado=getSueldoMensual()-(vajillasRotas*5);
        System.out.println("El empleado "+getNombre()+" cobrará: $"+sueldoCalculado+". Por las "+vajillasRotas+" vajillas rotas, se le descontó $"+(vajillasRotas*5));
    }
}
