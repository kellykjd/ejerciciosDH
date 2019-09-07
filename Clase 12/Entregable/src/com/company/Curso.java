package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoAlumno;
    private List<Alumno> listaDeAlumnos;

    public Curso(String nombre, Integer codigoCurso, Integer cupoMaximoAlumno) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximoAlumno = cupoMaximoAlumno;
        this.listaDeAlumnos = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        Curso unCurso = (Curso) obj;
        return unCurso.codigoCurso.equals(this.codigoCurso);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    private Boolean hayCupo(){
        return listaDeAlumnos.size() < cupoMaximoAlumno;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){

        if(hayCupo()){
            listaDeAlumnos.add(unAlumno);
            System.out.println("Alumno inscripto satisfactoriamente");
            return true;
        }
        else {
            System.out.println("No se pudo agregar al alumno, no hay cupo.");
            return false;
        }
    }


    public void eliminarUnAlumno(Alumno unAlumno){
        if(listaDeAlumnos.remove(unAlumno)){
            System.out.println("Alumno eliminado del sistema.");
        }else {
            System.out.println("No se pudo eliminar el alumno");
        }

    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }
}
