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
        System.out.println(contador + " " + diccionario.get(contador));
        return contador;
    }

    public void mostrarPrendas() {
        for (Integer contador : diccionario.keySet()) {
            System.out.println(contador + " " + diccionario.keySet());
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return diccionario.remove(numero);
    }

}
