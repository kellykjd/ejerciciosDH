package com.company;

public class LavadorVajilla extends Empleado{
    private Integer vajillasRotas;
    private Double sueldoCalculado;

    public LavadorVajilla(String nombre, String apellido, Double sueldoMensual, Integer vajillasRotas) {
        super(nombre, apellido, sueldoMensual);
        this.vajillasRotas = vajillasRotas;
        sueldoCalculado = 0.0;
    }

    public Integer getVajillasRotas() {
        return vajillasRotas;
    }

    @Override
    public void cobrar() {
    sueldoCalculado=getSueldoMensual()-(vajillasRotas*5);
        System.out.println("El empleado "+getNombre()+" cobrará: $"+sueldoCalculado+". Por las "+vajillasRotas+" vajillas rotas, se le descontó $"+(vajillasRotas*5));
    }
}
