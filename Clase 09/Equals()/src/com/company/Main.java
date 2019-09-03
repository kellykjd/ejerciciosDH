package com.company;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //EJERCICIO 02

        Coca coca1 = new Coca(250, 100.0);
        Coca coca2 = new Coca(250, 200.0);
        System.out.println(coca1.equals(coca2));
        System.out.println();

        //EJERCICIO 03
        Alumno alumno1 = new Alumno("Juan",58);
        Alumno alumno2 = new Alumno("Clara",19);
        Alumno alumno3 = new Alumno("María",7);
        Alumno alumno4 = new Alumno("Adrián",43);
            Alumno alumno5 = new Alumno("Jose",7);
        List<Alumno> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add(alumno1);
        listaDeAlumnos.add(alumno2);
        listaDeAlumnos.add(alumno3);
        listaDeAlumnos.add(alumno4);
        System.out.println(listaDeAlumnos.contains(alumno5));
        System.out.println();

        //EJERCICIO 04
        Empleado empleado1 = new Empleado("Juan",58);
        Empleado empleado2 = new Empleado("Clara",19);
        Empleado empleado3 = new Empleado("María",7);
        Empleado empleado4 = new Empleado("Adrián",43);
        Empleado empleado5 = new Empleado("Jose",7);
        List<Empleado> listaDeEmpleados = new ArrayList<>();
        listaDeEmpleados.add(empleado1);
        listaDeEmpleados.add(empleado2);
        listaDeEmpleados.add(empleado3);
        listaDeEmpleados.add(empleado4);
        System.out.println(listaDeEmpleados.contains(empleado5));
        System.out.println();


    }

    }



