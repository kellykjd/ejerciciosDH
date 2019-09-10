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
            System.out.println("Se dio de alta al curso: " + nombre);
        } else {
            System.out.println("No se pudo dar de alta el curso: " + nombre);
        }
    }

    private Curso buscarCursoPorCodigo(Integer codigoCurso) {
        Curso cursoBuscado = null;
        try {
            for (Curso unCurso : listaDeCursos) {
                if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                    cursoBuscado = unCurso;
                }
            }
        } catch (NullPointerException e) {
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
        if (listaDeProfesores.add(profesorAdjunto)) {
            System.out.println("Se dio de alta al profesor: " + nombre);
        } else {
            System.out.println("No se pudo dar de alta al profesor: " + nombre);
        }
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        if (listaDeProfesores.add(profesorTitular)) {
            System.out.println("Se dio de alta al profesor: " + nombre);
        } else {
            System.out.println("No se pudo dar de alta al profesor: " + nombre);
        }
    }

    private Profesor buscarProfesorPorCodigo(Integer codigoProfesor) {
        Profesor profesorBuscado = null;
        try {
            for (Profesor unProfesor : listaDeProfesores) {
                if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                    profesorBuscado = unProfesor;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Estás ingresando un código de profesor nulo");
        }
        return profesorBuscado;
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = buscarProfesorPorCodigo(codigoProfesor);
        if (listaDeProfesores.remove(profesorAEliminar)) {
            System.out.println("Se ha dado de baja al profesor " + profesorAEliminar.getNombre() + " en el sistema.");
        } else {
            System.out.println("No se pudo dar de baja al profesor, verificar el código ingresado.");
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        if (listaDeAlumnos.add(unAlumno)) {
            System.out.println("Se dio de alta al alumno: " + nombre);
        } else {
            System.out.println("No se pudar dar de alta al alumno: " + nombre);
        }
    }

    private Alumno buscarAlumnoPorCodigo(Integer codigoAlumno) {
        Alumno alumnoBuscado = null;
        try {
            for (Alumno unAlumno : listaDeAlumnos) {
                if (unAlumno.getCodigoAlumno().equals(codigoAlumno)) {
                    alumnoBuscado = unAlumno;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Estás ingresando un código de alumno nulo");
        }
        return alumnoBuscado;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Inscripcion unaInscripcion = new Inscripcion(buscarAlumnoPorCodigo(codigoAlumno), buscarCursoPorCodigo(codigoCurso));
        buscarCursoPorCodigo(codigoCurso).agregarUnAlumno(buscarAlumnoPorCodigo(codigoAlumno));
        if (listaDeInscripciones.add(unaInscripcion)) {
            System.out.println("Se ha inscrito al alumno " + buscarAlumnoPorCodigo(codigoAlumno) + " en el curso " + buscarCursoPorCodigo(codigoCurso));
        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        ProfesorAdjunto profesorAdjunto = (ProfesorAdjunto) buscarProfesorPorCodigo(codigoProfesorAdjunto);
        ProfesorTitular profesorTitular = (ProfesorTitular) buscarProfesorPorCodigo(codigoProfesorTitular);
        buscarCursoPorCodigo(codigoCurso).setProfesorAdjunto(profesorAdjunto);
        buscarCursoPorCodigo(codigoCurso).setProfesorTitular(profesorTitular);
        System.out.println("Se asignaron los profesores "+profesorTitular+" y "+profesorAdjunto+" al curso "+ buscarCursoPorCodigo(codigoCurso));
    }

    public void inscribirGrupoDeAlumnos(List<Alumno> grupoDeAlumnos, Integer codigoCurso){
        for (Alumno alumno:grupoDeAlumnos) {
            listaDeAlumnos.add(alumno);
            inscribirAlumno(alumno.getCodigoAlumno(),codigoCurso);
        }
    }

 /* PARTE K: Método con sout
    public void buscarCursoPorAlumno(Alumno unAlumno) {
        System.out.println("El alumno "+unAlumno.getNombre()+" se encuentra inscripto en los siguientes cursos: ");
        for (Inscripcion unaInscripcion : listaDeInscripciones) {
            if (unaInscripcion.getUnAlumno().equals(unAlumno)) {
                System.out.println(unaInscripcion.getUnCurso());
            }
        }
    }*/

/* PARTE K: Método con ArrayList

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
