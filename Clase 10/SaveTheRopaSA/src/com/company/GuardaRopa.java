package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> diccionario;
    private Integer contador;

    public GuardaRopa(){
    diccionario = new HashMap<>();
    this.contador = 0;}

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        contador=contador + 1;
        diccionario.put(contador, listaDePrenda);
        System.out.println("El identificador es: "+contador);
        return contador;
    }

    public void mostrarPrendas() {
        for (Integer clave : diccionario.keySet()) {
            System.out.println(clave+" "+diccionario.get(clave));
        }
    }

    public void devolverPrendas(Integer numero){

        diccionario.remove(numero);
        System.out.println(diccionario);
    }

}
