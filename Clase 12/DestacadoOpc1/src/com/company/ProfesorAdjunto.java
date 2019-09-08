package com.company;

public class ProfesorAdjunto extends Profesor {
    private Integer cantidadHorasConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadHorasConsultas) {
        super(nombre, apellido, 0, codigoProfesor);
        this.cantidadHorasConsultas = cantidadHorasConsultas;
    }


    public Integer getCantidadHorasConsultas() {
        return cantidadHorasConsultas;
    }
}
