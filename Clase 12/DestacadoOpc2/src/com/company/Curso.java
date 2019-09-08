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
    @Override
    public String toString() {
        return nombre;
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
            System.out.println("Alumno "+unAlumno.getNombre()+" inscripto satisfactoriamente");
            return true;
        }
        else {
            System.out.println("No se pudo agregar al alumno" +unAlumno.getNombre()+", no hay cupo.");
            return false;
        }
    }

    public void eliminarUnAlumno(Alumno unAlumno){
      try{
          if(listaDeAlumnos.remove(unAlumno)){
              System.out.println("Alumno "+unAlumno.getNombre()+"eliminado del sistema.");
          }else {
            System.out.println("No se pudo eliminar al alumno "+unAlumno.getNombre());
          }
      }catch(NullPointerException e){
          System.out.println("El valor del alumno ingresado es nulo, no se pudo eliminar. Por favor revise e intente de nuevo.");
    }
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }
    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }
}
