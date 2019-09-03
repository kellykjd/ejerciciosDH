package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class    Main {

    public static void main(String[] args) {
	// write your code here

        //EJERCICIO 01
        Map<Integer,String> diccionario1 = new HashMap<>();


        diccionario1.put(0,"Huevos");
        diccionario1.put(1,"Agua");
        diccionario1.put(2,"Escopeta");
        diccionario1.put(3,"Caballo");
        diccionario1.put(4,"Dentista");
        diccionario1.put(5,"Llamas");

        System.out.println("EJERCICIO 01");
        for (Integer clave: diccionario1.keySet()) {
            System.out.println(clave+" - "+diccionario1.get(clave));
        }


        //EJERCICIO 02
        List<String> juan = new ArrayList<>();
        List<String> miguel = new ArrayList<>();
        List<String> maria = new ArrayList<>();
        List<String> lucas = new ArrayList<>();
        Map<String,List<String>> diccionario2 = new HashMap<>();
        juan.add("Juancho");
        juan.add("Fisura");
        juan.add("Ricardo Fort");
        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Pati Corti");
        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Roberto");
        lucas.add("Luks");
        lucas.add("Jorge");
        lucas.add("Chorch");
        diccionario2.put("Juan",juan);
        diccionario2.put("Miguel",miguel);
        diccionario2.put("María",maria);
        diccionario2.put("Lucas",lucas);
        System.out.println("\n \n");
        System.out.println("EJERCICIO 02");
        for (String unAmigo:diccionario2.keySet()) {
            System.out.println(unAmigo+" "+diccionario2.keySet());
        //
       // System.out.println(unAmigo + diccionario2.keySet());


    }
}}
