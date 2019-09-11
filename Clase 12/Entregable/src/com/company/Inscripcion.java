package com.company;

import java.util.Date;

public class Inscripcion {
    private Alumno unAlumno;
    private Curso unCurso;
    private Date fechaDeInscripcion;

    public Inscripcion(Alumno unAlumno, Curso unCurso) {
        this.unAlumno = unAlumno;
        this.unCurso = unCurso;
        this.fechaDeInscripcion = new Date();
    }

    @Override
    public String toString() {
        return unCurso.getNombre();
    }

/* Habilitar para ejecutar la Parte K del curso

public Alumno getUnAlumno() {
        return unAlumno;
    }

    public Curso getUnCurso() {
        return unCurso;
    }*/
}
