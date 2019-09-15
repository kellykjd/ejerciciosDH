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
        if(codigoCurso!=null && cupoMaximoDealumnos != null){
            if (listaDeCursos.add(unCurso)) {
                System.out.println("Se dio de alta al curso: " + nombre);
            }else {
                System.out.println("No se pudo dar de alta el curso: " + nombre);
            }
        }else{
            System.out.println("El código del curso o el cupo máximo no puede ser un valor nulo. Favor revise e intente de nuevo.");
        }





    }

    private Curso buscarCursoPorCodigo(Integer codigoCurso) {
        Curso cursoBuscado = null;
            for (Curso unCurso : listaDeCursos) {
                if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                    cursoBuscado = unCurso;
                }
            }
        return cursoBuscado;
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigoCurso);
        if (listaDeCursos.remove(cursoAEliminar)) {
            System.out.println("Curso " + cursoAEliminar + " dado de baja en el sistema.");
        } else {
            System.out.println("No se pudo dar de baja el curso , verificar el código ingresado.");
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        if(codigoProfesor!=null){
            if (listaDeProfesores.add(profesorAdjunto)) {
                System.out.println("Se dio de alta al profesor: " + nombre);
            } else {
            System.out.println("No se pudo dar de alta al profesor: " + nombre);}
        }else{
                System.out.println("El código del profesor no puede ser nulo, por favor revise e intente de nuevo.");
        }
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
       if(codigoProfesor!=null){
           if (listaDeProfesores.add(profesorTitular)) {
               System.out.println("Se dio de alta al profesor: " + nombre);
           } else {
               System.out.println("No se pudo dar de alta al profesor: " + nombre);
           }
       }else{
           System.out.println("El código del profesor no puede ser nulo, por favor revise e intente de nuevo.");
       }






    }

    private Profesor buscarProfesorPorCodigo(Integer codigoProfesor) {
        Profesor profesorBuscado = null;
                for (Profesor unProfesor : listaDeProfesores) {
                    if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                        profesorBuscado = unProfesor;
                    }
                }return profesorBuscado;
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
        if(codigoAlumno!=null){
            if (listaDeAlumnos.add(unAlumno)) {
                System.out.println("Se dio de alta al alumno: " + nombre);
            } else {
                System.out.println("No se pudar dar de alta al alumno: " + nombre);
            }
        }else{
            System.out.println("El código del alumno no puede ser nulo, por favor revise e intente de nuevo.");
        }
    }

    private Alumno buscarAlumnoPorCodigo(Integer codigoAlumno) {
        Alumno alumnoBuscado = null;
            for (Alumno unAlumno : listaDeAlumnos) {
                if (unAlumno.getCodigoAlumno().equals(codigoAlumno)) {
                    alumnoBuscado = unAlumno;
                }
            }
        return alumnoBuscado;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
            Alumno unAlumno = buscarAlumnoPorCodigo(codigoAlumno);
            Curso unCurso = buscarCursoPorCodigo(codigoCurso);
            try {
                if (unAlumno!=null && unCurso!= null){
                    Inscripcion unaInscripcion = new Inscripcion(unAlumno, unCurso);
                    if(listaDeInscripciones.add(unaInscripcion)&&unCurso.agregarUnAlumno(unAlumno)){
                        System.out.println("Se ha inscrito al alumno " + unAlumno + " en el curso " + unCurso);}}
                else{
                        System.out.println("Código inválido. No se pudo inscribir al alumno, por favor revise e intente de nuevo.");
                    }
            }catch (Exception e){
                System.out.println("No se pudo inscribir al alumno.");
            }
    }


    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
               ProfesorAdjunto profesorAdjunto = (ProfesorAdjunto) buscarProfesorPorCodigo(codigoProfesorAdjunto);
               ProfesorTitular profesorTitular = (ProfesorTitular) buscarProfesorPorCodigo(codigoProfesorTitular);
               try {
                   if(profesorAdjunto!=null && profesorTitular!=null) {
                       buscarCursoPorCodigo(codigoCurso).setProfesorAdjunto(profesorAdjunto);
                       buscarCursoPorCodigo(codigoCurso).setProfesorTitular(profesorTitular);
                       System.out.println("Se asignaron los profesores " + profesorAdjunto + " y " + profesorTitular + " al curso " + buscarCursoPorCodigo(codigoCurso));
                   }else{
                       System.out.println("Codigo de profesor inválido, por favor revise e intente de nuevo.");
                   }
               } catch (Exception e) {
                   System.out.println("Codigo de curso inválido, por favor revise e intente de nuevo.");
               }
    }

    public void inscribirGrupoDeAlumnos(List<Alumno> grupoDeAlumnos, Integer codigoCurso){
        for (Alumno alumno:grupoDeAlumnos) {
            altaAlumno(alumno.getNombre(),alumno.getApellido(),alumno.getCodigoAlumno());
            inscribirAlumno(alumno.getCodigoAlumno(),codigoCurso);
        }
    }




}
