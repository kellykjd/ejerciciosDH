package com.company;

public class Alumno extends Object {
    private String nombre;
    private Integer numeroDeAlumno;

    public Alumno(String nombre, Integer numeroDeAlumno) {
        this.nombre = nombre;
        this.numeroDeAlumno = numeroDeAlumno;
    }


    //el método contains utiliza internamente el método .equals()
    @Override
public boolean equals(Object unObjeto){
Alumno unAlumno = (Alumno) unObjeto;
return this.numeroDeAlumno == unAlumno.numeroDeAlumno;
    }


}
