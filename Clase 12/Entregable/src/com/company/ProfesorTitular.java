package com.company;

public class ProfesorTitular extends Profesor{
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        super(nombre, apellido, 0, codigoProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }


}
