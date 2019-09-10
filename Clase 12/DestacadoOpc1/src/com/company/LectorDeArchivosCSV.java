package com.company;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class LectorDeArchivosCSV {
    //ATRIBUTOS
    private String delimitador;                                                                         //Delimiters used in the CSV file

    //CONSTRUCTOR
    public LectorDeArchivosCSV() {
        delimitador = ",";
    }

    //METODO
    public List<Alumno> leerCSV() {
        BufferedReader br = null;
        List<Alumno> listaDeAlumnos = new ArrayList<>();                                           //Create List for holding Employee objects
        try {
            br = new BufferedReader(new FileReader("listadoDeAlumnos.csv"));                   //Reading the csv file
            String line = "";
            br.readLine();                                                                              //Read to skip the header
            while ((line = br.readLine()) != null) {                                                    //Reading from the second line
                String[] detalleAlumno = line.split(delimitador);
                if (detalleAlumno.length > 0) {
                    Alumno unAlumno = new Alumno(detalleAlumno[1], detalleAlumno[2], Integer.parseInt(detalleAlumno[0]));                     //Save the alumno details in Alumno object
                    listaDeAlumnos.add(unAlumno);
                }
            }
            } catch (Exception ee) {
                ee.printStackTrace();
             }
        return listaDeAlumnos;
    }
}





