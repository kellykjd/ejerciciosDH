package com.company;

public class Main {

    public static void main(String[] args) {
        LectorDeArchivosCSV miLector = new LectorDeArchivosCSV();
 /*       DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        ProfesorTitular profesorTitular1= new ProfesorTitular("Carlos","Gutiérrez",0001,"Diseño Web");
        ProfesorTitular profesorTitular2= new ProfesorTitular("Orlando","González",0002,"Base de Datos");
        ProfesorAdjunto profesorAdjunto1= new ProfesorAdjunto("Axel","Centeno",0003,7);
        ProfesorAdjunto profesorAdjunto2= new ProfesorAdjunto("Alejandro","Salvador",0004,9);
        Curso cursoFullStack = new Curso("Full Stack",20001,3);
        Curso cursoAndroid = new Curso("Android",20002,2);
        Alumno alumno1= new Alumno("Mary","Párica",0101);
        Alumno alumno2= new Alumno("Olga","Betancourt",0102);
        Alumno alumno3= new Alumno("Kelly","Jiménez",0103);

        digitalHouseManager.altaProfesorTitular(profesorTitular1.getNombre(),profesorTitular1.getApellido(),profesorTitular1.getCodigoProfesor(),profesorTitular1.getEspecialidad());
        digitalHouseManager.altaProfesorTitular(profesorTitular2.getNombre(),profesorTitular2.getApellido(),profesorTitular2.getCodigoProfesor(),profesorTitular2.getEspecialidad());
        digitalHouseManager.altaProfesorAdjunto(profesorAdjunto1.getNombre(),profesorAdjunto1.getApellido(),profesorAdjunto1.getCodigoProfesor(),profesorAdjunto1.getCantidadHorasConsultas());
        digitalHouseManager.altaProfesorAdjunto(profesorAdjunto2.getNombre(),profesorAdjunto2.getApellido(),profesorAdjunto2.getCodigoProfesor(),profesorAdjunto2.getCantidadHorasConsultas());

        digitalHouseManager.altaCurso(cursoAndroid.getNombre(),cursoAndroid.getCodigoCurso(),cursoAndroid.getCodigoCurso());
        digitalHouseManager.altaCurso(cursoFullStack.getNombre(),cursoFullStack.getCodigoCurso(),cursoFullStack.getCodigoCurso());

        digitalHouseManager.asignarProfesores(cursoAndroid.getCodigoCurso(),profesorTitular1.getCodigoProfesor(),profesorAdjunto1.getCodigoProfesor());
        digitalHouseManager.asignarProfesores(cursoFullStack.getCodigoCurso(),profesorTitular2.getCodigoProfesor(),profesorAdjunto2.getCodigoProfesor());

        digitalHouseManager.altaAlumno(alumno1.getNombre(),alumno1.getApellido(),alumno1.getCodigoAlumno());
        digitalHouseManager.altaAlumno(alumno2.getNombre(),alumno2.getApellido(),alumno2.getCodigoAlumno());
        digitalHouseManager.altaAlumno(alumno3.getNombre(),alumno3.getApellido(),alumno3.getCodigoAlumno());

        digitalHouseManager.inscribirAlumno(alumno1.getCodigoAlumno(),cursoFullStack.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno2.getCodigoAlumno(),cursoFullStack.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno1.getCodigoAlumno(),cursoAndroid.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno2.getCodigoAlumno(),cursoAndroid.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno3.getCodigoAlumno(),cursoAndroid.getCodigoCurso());

        digitalHouseManager.bajaProfesor(profesorAdjunto1.getCodigoProfesor());
        digitalHouseManager.bajaCurso(cursoAndroid.getCodigoCurso());*/

        miLector.leerCSV();
        //digitalHouseManager.buscarCursoPorAlumno(alumno2);

        /*PARTE K: para consultar a qué curso está un alumno inscripto, crearía un método DigitalHouseManager que reciba como parámetro un alumno,
        * y luego con un foreach busque en la lista de inscripciones y los resultados los agregue en una nueva lista o los muestre
        * con un sout (de las 2 maneras me funciona). Y en el main lo ejecuto con digitalHouseManager.buscarCursoPorAlumno(alumno2);
        *
        * En la clase inscripción le hago un Overrading a toString para que me devuelva el nombre del curso.
        *
        * En la clase Incripción creo los getters necesarios para obetener los codigos de curso y alumno.
        *
        * public void buscarCursoPorAlumno(Alumno unAlumno) {
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
