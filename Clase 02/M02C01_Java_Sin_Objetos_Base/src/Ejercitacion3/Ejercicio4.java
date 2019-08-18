package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio4 {

    ArrayList<Integer> listaDePrimerosCienPositivos() {
        //Defino un array nuevo
        ArrayList<Integer>listaNumeros = new ArrayList<>();
        //Retornar un ArrayList con los primeros 100 números positivos.

        for(Integer i=0; i<100; i++) {
        listaNumeros.add(i);
        }
        return listaNumeros;
        }



    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio4 ejercicio4 = new Ejercicio4();

        ArrayList<Integer> resultado = ejercicio4.listaDePrimerosCienPositivos();

        for (Integer i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
    }
}
