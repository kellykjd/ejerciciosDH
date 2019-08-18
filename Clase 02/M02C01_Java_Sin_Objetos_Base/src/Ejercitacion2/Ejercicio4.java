package Ejercitacion2;

import java.util.ArrayList;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {


    public void primerosCienNumeros(){
        //Comenzar a escribir código acá

        //Defino un array nuevo
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        //Retornar un ArrayList con los primeros 100 números positivos.

        for(Integer i=0; i<100; i++) {
            if (i%2!=0) {
                listaNumeros.add(i);
            }
        }
        System.out.println(listaNumeros);
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Test
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.primerosCienNumeros();
    }
}