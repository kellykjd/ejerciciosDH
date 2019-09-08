package com.company;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class LectorDeArchivosCSV{

private CSVReader csvReader;
private List<Alumno> listaDeAlumnos;

public LectorDeArchivosCSV(){
    csvReader = null;
    listaDeAlumnos = new ArrayList<>();
    }


public void leerCSV(){
try
    {
        /**
         * Reading the CSV File
         * Delimiter is comma
         * Start reading from line 1
         */
        csvReader = new CSVReader(new FileReader("listadoDeAlumnos.csv"),',','"',1);
        //employeeDetails stores the values current line
        String[] employeeDetails = null;
        while((employeeDetails = csvReader.readNext())!=null)
        {
            //Printing to the console

            System.out.println(Arrays.toString(employeeDetails));
        }
    }
        catch(Exception ee)
    {
        ee.printStackTrace();
    }
        finally
    {
        try
        {
            //closing the reader
            csvReader.close();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
}



}