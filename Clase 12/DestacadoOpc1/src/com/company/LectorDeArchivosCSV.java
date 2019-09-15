package com.company;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class LectorDeArchivosCSV {
    //ATRIBUTOS
    private String delimitador;

    //CONSTRUCTOR
    public LectorDeArchivosCSV() {
        delimitador = ",";
    }

    //METODO
    public List<Alumno> leerCSV() {
        BufferedReader br = null;
        List<Alumno> listaDeAlumnos = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("listadoDeAlumnos.csv"));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] detalleAlumno = line.split(delimitador);
                if (detalleAlumno.length > 0) {
                    Alumno unAlumno = new Alumno(detalleAlumno[1], detalleAlumno[2], Integer.parseInt(detalleAlumno[0]));
                    listaDeAlumnos.add(unAlumno);
                }
            }
            } catch (Exception ee) {
                ee.printStackTrace();
             }
        return listaDeAlumnos;
    }
}





