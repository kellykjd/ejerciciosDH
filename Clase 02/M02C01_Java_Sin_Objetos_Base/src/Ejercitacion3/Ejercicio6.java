package Ejercitacion3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio6 {

    ArrayList<Integer> numerosDeLaQuiniela(Integer cantidad){

        //Retornar un array con una cantidad de números enteros aleatorios. La cantidad viene como parámetro.
        ArrayList<Integer> numerosAeleatorios = new ArrayList();
        Random random = new Random();
        for(int i=0; i<cantidad;i++){
            numerosAeleatorios.add(random.nextInt(cantidad));
        }
        return numerosAeleatorios;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio6 ejercicio6 = new Ejercicio6();

        ejercicio6.imprimirArrayList(ejercicio6.numerosDeLaQuiniela(5));
        ejercicio6.imprimirArrayList(ejercicio6.numerosDeLaQuiniela(3));
        ejercicio6.imprimirArrayList(ejercicio6.numerosDeLaQuiniela(7));

    }

    public void imprimirArrayList(ArrayList<Integer> arrayList){

        for (Integer i = 0; i < arrayList.size(); i++) {
            System.out.println(i+1+": " + arrayList.get(i));
        }
        System.out.println("________________________");
    }
}
