package com.company;

public abstract class Profesor {

    private String nombre;
    private String apellido;
    private Integer antigüedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer antigüedad, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antigüedad = antigüedad;
        this.codigoProfesor = codigoProfesor;
    }

    @Override
    public boolean equals(Object obj) {
        Profesor unProfesor = (Profesor) obj;
        return unProfesor.codigoProfesor.equals(this.codigoProfesor);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }
}
