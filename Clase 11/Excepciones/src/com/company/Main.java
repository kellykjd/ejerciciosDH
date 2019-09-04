package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*        List<String> lista = null;

        try {
            lista.add("Hola");
        } catch (Exception e) {
            System.out.println("rompí");
            e.printStackTrace();//imprime el error exacto y la línea en donde está
        }

        System.out.println("Hasta aquí llegó mi código");*/

        //EJERCICIO 01
        System.out.println("EJERCICIO 01");
        Integer unNumero = null;
        try{
            unNumero= unNumero+5;
        }catch(Exception e){
            System.out.println("Revisa tu código");
            e.printStackTrace();
        }

        //EJERCICIO 02
        System.out.println("\n EJERCICIO 02");
        List<String> animales = new ArrayList<>();
        animales.add("Pato");
        animales.add("Perro");
        animales.add("Gato");
        try{
            System.out.println(animales.get(3));
        }catch(Exception e){
            System.out.println("Revisa tu código");
            e.printStackTrace();
        }

        //EJERCICIO 03
        System.out.println("\n EJERCICIO 03");
        List<String> animales2 = new ArrayList<>();
        animales2.add("Pato");
        animales2.add("Perro");
        animales2.add("Gato");
        try{
            System.out.println(animales2.get(5));
        }catch(Exception e){
            System.out.println("Revisa tu código");
            e.printStackTrace();
        }
    }
}
