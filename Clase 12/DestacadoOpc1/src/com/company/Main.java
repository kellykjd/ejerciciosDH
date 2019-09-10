package com.company;

public class Main {

    public static void main(String[] args) {
        LectorDeArchivosCSV miLector = new LectorDeArchivosCSV();
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        ProfesorTitular profesorTitular1= new ProfesorTitular("Carlos","Gutiérrez",0001,"Diseño Web");

        ProfesorAdjunto profesorAdjunto1= new ProfesorAdjunto("Axel","Centeno",0003,7);
        Curso mobileAndroid = new Curso("Mobile Android",20001,3);
        Alumno alumno1= new Alumno("Mary","Párica",0101);
        Alumno alumno2= new Alumno("Kary","Párica",0102);
        Alumno alumno3= new Alumno("Lary","Párica",0103);
        Alumno alumno4= new Alumno("Pary","Párica",0104);

        digitalHouseManager.altaProfesorTitular(profesorTitular1.getNombre(),profesorTitular1.getApellido(),profesorTitular1.getCodigoProfesor(),profesorTitular1.getEspecialidad());
        digitalHouseManager.altaProfesorAdjunto(profesorAdjunto1.getNombre(),profesorAdjunto1.getApellido(),profesorAdjunto1.getCodigoProfesor(),profesorAdjunto1.getCantidadHorasConsultas());

        digitalHouseManager.altaCurso(mobileAndroid.getNombre(),mobileAndroid.getCodigoCurso(),mobileAndroid.getCodigoCurso());

        digitalHouseManager.asignarProfesores(mobileAndroid.getCodigoCurso(),profesorTitular1.getCodigoProfesor(),profesorAdjunto1.getCodigoProfesor());

        digitalHouseManager.altaAlumno(alumno1.getNombre(),alumno1.getApellido(),alumno1.getCodigoAlumno());


        digitalHouseManager.inscribirAlumno(alumno1.getCodigoAlumno(),mobileAndroid.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno2.getCodigoAlumno(),mobileAndroid.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno3.getCodigoAlumno(),mobileAndroid.getCodigoCurso());
        digitalHouseManager.inscribirAlumno(alumno4.getCodigoAlumno(),mobileAndroid.getCodigoCurso());

        //digitalHouseManager.inscribirGrupoDeAlumnos(miLector.leerCSV(),mobileAndroid.getCodigoCurso());

        //System.out.println(miLector.leerCSV());

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
