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


    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        Curso unCurso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        if(listaDeCursos.add(unCurso)){
        System.out.println("Se dio alta al curso: "+nombre);
        }else{
            System.out.println("No se pudo dar de alta el curso");}
    }


    private Curso buscarCursoPorCodigo(Integer codigoCurso){
        Curso cursoBuscado = null;
        for (Curso unCurso:listaDeCursos) {
            if(unCurso.getCodigoCurso().equals(codigoCurso)){
                cursoBuscado = unCurso;
            }
        }
        return cursoBuscado;
    }


    public void bajaCurso(Integer codigoCurso){
        Curso cursoAEliminar = buscarCursoPorCodigo(codigoCurso);
        if(listaDeCursos.remove(cursoAEliminar)){
            System.out.println("Curso dado de baja en el sistema.");
        }else {
            System.out.println("No se pudo dar de baja el curso.");
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre,apellido,codigoProfesor,cantidadDeHoras);
        listaDeProfesores.add(profesorAdjunto);
        System.out.println("Se dio de alta al profesor: "+nombre);
       }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre,apellido,codigoProfesor,especialidad);
        listaDeProfesores.add(profesorTitular);
        System.out.println("Se dio de alta al profesor: "+nombre);
    }



    private Profesor buscarProfesorPorCodigo(Integer codigoProfesor){
        Profesor profesorBuscado = null;
        for (Profesor unProfesor:listaDeProfesores) {
            if(unProfesor.getCodigoProfesor().equals(codigoProfesor)){
                profesorBuscado = unProfesor;
            }
        }
        return profesorBuscado;
    }


    public void bajaProfesor(Integer codigoProfesor){
        Profesor profesorAEliminar = buscarProfesorPorCodigo(codigoProfesor);
        if(listaDeProfesores.remove(profesorAEliminar)){
            System.out.println("Se ha dado de baja al profesor en el sistema.");
        }else {
            System.out.println("No se pudo dar de baja al profesor.");
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno unAlumno = new Alumno(nombre,apellido,codigoAlumno);
        listaDeAlumnos.add(unAlumno);
        System.out.println("Se dio de alta al alumno: "+nombre);
    }


    private Alumno buscarAlumnoPorCodigo(Integer codigoAlumno){
        Alumno alumnoBuscado = null;
        for (Alumno unAlumno:listaDeAlumnos) {
            if(unAlumno.getCodigoAlumno().equals(codigoAlumno)){
                alumnoBuscado = unAlumno;
            }
        }
        return alumnoBuscado;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Inscripcion unaInscripcion = null;

        if (buscarAlumnoPorCodigo(codigoAlumno)!=null && buscarCursoPorCodigo(codigoCurso)!=null){
            buscarCursoPorCodigo(codigoCurso).agregarUnAlumno(buscarAlumnoPorCodigo(codigoAlumno));
            listaDeInscripciones.add(unaInscripcion);
        }else{
            System.out.println("Debe indicar un código válido de alumno o curso.");
        }
    }


    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        Curso unCurso = null;



        try{
            Profesor profesorTitular = (Profesor) buscarProfesorPorCodigo(codigoProfesorTitular);
            Profesor profesorAdjunto = (Profesor) buscarProfesorPorCodigo(codigoProfesorAdjunto);

            unCurso.setProfesorAdjunto(profesorAdjunto);
        }catch (ClassCastException e){
            System.out.println("");
        }



            Profesor profesorAdjunto = buscarProfesorPorCodigo(codigoProfesorAdjunto);


            unCurso.setProfesorAdjunto(profesorAdjunto);





    }

}
