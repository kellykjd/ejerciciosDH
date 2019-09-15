package com.company;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        LectorDeArchivosCSV miLector = new LectorDeArchivosCSV();


        //DAR DE ALTA A LOS PROFESORES
        digitalHouseManager.altaProfesorTitular("Carlos","Gutiérrez",0001,"Diseño Web");
        digitalHouseManager.altaProfesorAdjunto("Axel","Centeno",0003,7);

        //DAR DE ALTA A LOS CURSOS
        digitalHouseManager.altaCurso("Mobile Android",007,30);

        //ASIGNAR LOS PROFESORES A LOS CURSOS
        digitalHouseManager.asignarProfesores(007,0001,0003);



        digitalHouseManager.inscribirGrupoDeAlumnos(miLector.leerCSV(),007);




    }
}
