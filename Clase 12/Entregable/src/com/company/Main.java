package com.company;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        //DAR DE ALTA A LOS PROFESORES
        digitalHouseManager.altaProfesorTitular("Carlos","Gutiérrez",0001,"Diseño Web");
        digitalHouseManager.altaProfesorTitular("Orlando","González",0002,"Base de Datos");
        digitalHouseManager.altaProfesorAdjunto("Axel","Centeno",0003,7);
        digitalHouseManager.altaProfesorAdjunto("Alejandro","Salvador",0004,9);

        //DAR DE ALTA A LOS CURSOS
        digitalHouseManager.altaCurso("Full Stack",20001,3);
        digitalHouseManager.altaCurso("Android",20002,2);

        //ASIGNAR LOS PROFESORES A LOS CURSOS
        digitalHouseManager.asignarProfesores(20001,0001,0003);
        digitalHouseManager.asignarProfesores(20002,0002,0004);

        //DAR DE ALTA A LOS ALUMNOS
        digitalHouseManager.altaAlumno("Mary","Párica",0101);
        digitalHouseManager.altaAlumno("Olga","Betancourt",0102);
        digitalHouseManager.altaAlumno("Kelly","Jiménez",0103);

        //INSCRIBIR A LOS ALUMNOS EN LOS CURSOS
        digitalHouseManager.inscribirAlumno(0101,20001);
        digitalHouseManager.inscribirAlumno(0102,20001);
        digitalHouseManager.inscribirAlumno(0101,20002);
        digitalHouseManager.inscribirAlumno(0102,20002);
        digitalHouseManager.inscribirAlumno(0103,20002);

        //DAR DE BAJA A UN PROFESOR
        digitalHouseManager.bajaProfesor(004);

        //DAR DE BAJA UN CURSO
        digitalHouseManager.bajaCurso(20002);

        //digitalHouseManager.buscarCursoPorCodigoAlumno(0101);

        /*PARTE K: para consultar a qué curso está un alumno inscripto, crearía un método DigitalHouseManager que reciba como parámetro un alumno,
        * y luego con un foreach busque en la lista de inscripciones y los resultados los agregue en una nueva lista o los muestre
        * con un sout (de las 2 maneras me funciona). Y en el main lo ejecuto con digitalHouseManager.buscarCursoPorCodigoAlumno(0101);
        *
        * En la clase inscripción le hago un Overrading a toString para que me devuelva el nombre del curso.
        *
        * En la clase Incripción creo los getters necesarios para obetener los codigos de curso y alumno.
        *
        * public void buscarCursoCursoPorCodigoAlumno(Alumno unAlumno) {
        * List<Curso> cursosInscriptos = new ArrayList<>();
        *
        *   for (Inscripcion unaInscripcion : listaDeInscripciones) {
        *       if (unaInscripcion.getUnAlumno().equals(unAlumno)) {
        *         cursosInscriptos.add(unaInscripcion.getUnCurso());
        *       }
        *   }
        *   System.out.println("El alumno "+unAlumno.getNombre()+" se encuentra inscripto en los siguientes cursos: "+cursosInscriptos);
        * }
        *
        * En la clase DigitalHouseManager dejé comentado los métodos al final para probar.
        * */


    }
}
