package com.company;

public class Alumno {

    private String nombre;
    private String apellido;
    private Integer codigoAlumno;


    public Alumno(String nombre, String apellido, Integer codigoAlumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno=codigoAlumno;
    }


    @Override
    public boolean equals(Object obj) {
        Alumno unAlumno = (Alumno) obj;
        return unAlumno.codigoAlumno.equals(this.codigoAlumno);
    }

    @Override
    public String toString() {
        return "Codigo de alumno: "+codigoAlumno+", nombre: "+nombre+", apellido: "+apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }
}
