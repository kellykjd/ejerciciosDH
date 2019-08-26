package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prueba {

    //EJERCICIO 07
    public void imprimirPorPantalla(List<String> nombres) {

        for (String unNombre : nombres) {
            System.out.println("El nombre del alumno es: "+unNombre);
        }
    }

    //EJERCICIO 08
    public void sumaTotal(Set<Integer> conjuntoDeEnteros){
        Integer suma = 0;
        for (Integer unEntero : conjuntoDeEnteros) {
            suma=suma+unEntero;
        }
        System.out.println("El valor de la suma total es: "+suma);
    }

    public static void main(String[] args) {
    //EJERCICIO 07
        Prueba unaPrueba = new Prueba();
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Alejandro");
        nombres.add("Juan");
        System.out.println("Ejercicio 07");
        unaPrueba.imprimirPorPantalla(nombres);

        //EJERCICIO 08
        Prueba sumaTotal = new Prueba();
        Set<Integer> conjuntoDeEnteros = new HashSet<>();
        conjuntoDeEnteros.add(3);
        conjuntoDeEnteros.add(3);
        conjuntoDeEnteros.add(3);
        conjuntoDeEnteros.add(5);
        conjuntoDeEnteros.add(1);
        conjuntoDeEnteros.add(9);
        System.out.println("Ejercicio 08");
        unaPrueba.sumaTotal(conjuntoDeEnteros);
    }



}
