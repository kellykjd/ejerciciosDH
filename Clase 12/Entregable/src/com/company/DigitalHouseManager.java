package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager() {
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }


    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        if (listaDeCursos.add(unCurso)) {
            System.out.println("Se dio alta al curso: " + nombre);
        } else {
            System.out.println("No se pudo dar de alta el curso");
        }
    }


    private Curso buscarCursoPorCodigo(Integer codigoCurso) {
        Curso cursoBuscado = null;
        try{
            for (Curso unCurso : listaDeCursos) {
                if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                    cursoBuscado = unCurso;
                }
            }
        }catch(NullPointerException e){
            System.out.println("Estás ingresando un código de curso nulo");
        }
        return cursoBuscado;
    }


    public void bajaCurso(Integer codigoCurso) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigoCurso);
        if (listaDeCursos.remove(cursoAEliminar)) {
            System.out.println("Curso " + cursoAEliminar + " dado de baja en el sistema.");
        } else {
            System.out.println("No se pudo dar de baja el curso " + cursoAEliminar);
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        listaDeProfesores.add(profesorAdjunto);
        System.out.println("Se dio de alta al profesor: " + nombre);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        listaDeProfesores.add(profesorTitular);
        System.out.println("Se dio de alta al profesor: " + nombre);
    }


    private Profesor buscarProfesorPorCodigo(Integer codigoProfesor) {
        Profesor profesorBuscado = null;
        try{
            for (Profesor unProfesor : listaDeProfesores) {
                if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                    profesorBuscado = unProfesor;
                }
            }
        }catch(NullPointerException e){
            System.out.println("Estás ingresando un código de profesor nulo");
        }
        return profesorBuscado;
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = buscarProfesorPorCodigo(codigoProfesor);
        if (listaDeProfesores.remove(profesorAEliminar)) {
            System.out.println("Se ha dado de baja al profesor " + profesorAEliminar.getNombre() + " en el sistema.");
        } else {
            System.out.println("No se pudo dar de baja al profesor.");
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        listaDeAlumnos.add(unAlumno);
        System.out.println("Se dio de alta al alumno: " + nombre);
    }


    private Alumno buscarAlumnoPorCodigo(Integer codigoAlumno) {
        Alumno alumnoBuscado = null;
        try{
            for (Alumno unAlumno : listaDeAlumnos) {
                if (unAlumno.getCodigoAlumno().equals(codigoAlumno)) {
                    alumnoBuscado = unAlumno;
                }
            }
        }catch(NullPointerException e){
            System.out.println("Estás ingresando un código de alumno nulo");
        }
        return alumnoBuscado;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Inscripcion unaInscripcion = new Inscripcion(buscarAlumnoPorCodigo(codigoAlumno), buscarCursoPorCodigo(codigoCurso));
        buscarCursoPorCodigo(codigoCurso).agregarUnAlumno(buscarAlumnoPorCodigo(codigoAlumno));
        listaDeInscripciones.add(unaInscripcion);
    }


    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        try {
            ProfesorAdjunto profesorAdjunto = (ProfesorAdjunto) buscarProfesorPorCodigo(codigoProfesorAdjunto);
            ProfesorTitular profesorTitular = (ProfesorTitular) buscarProfesorPorCodigo(codigoProfesorTitular);
            buscarCursoPorCodigo(codigoCurso).setProfesorAdjunto(profesorAdjunto);
            buscarCursoPorCodigo(codigoCurso).setProfesorTitular(profesorTitular);
            System.out.println("Se asignaron los profesores al curso " + buscarCursoPorCodigo(codigoCurso));
        } catch (Exception e) {
            System.out.println("El código ingresado no es válido.");
        }
    }


 /*Método con sout
    public void buscarCursoPorAlumno(Alumno unAlumno) {
        System.out.println("El alumno "+unAlumno.getNombre()+" se encuentra inscripto en los siguientes cursos: ");
        for (Inscripcion unaInscripcion : listaDeInscripciones) {
            if (unaInscripcion.getUnAlumno().equals(unAlumno)) {
                System.out.println(unaInscripcion.getUnCurso());
            }
        }
    }*/

/* Método con ArrayList

   public void buscarCursoPorAlumno(Alumno unAlumno) {
    List<Curso> cursosInscriptos = new ArrayList<>();

        for (Inscripcion unaInscripcion : listaDeInscripciones) {
            if (unaInscripcion.getUnAlumno().equals(unAlumno)) {
                cursosInscriptos.add(unaInscripcion.getUnCurso());
            }
        }
        System.out.println("El alumno "+unAlumno.getNombre()+" se encuentra inscripto en los siguientes cursos: "+cursosInscriptos);
    }*/


}
