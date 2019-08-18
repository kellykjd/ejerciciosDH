package EjercitacionAvanzados;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by digitalhouse on 11/08/16.
 */
public class EjercicioPiedraPapelTijera {

    public static String jugarAlPiedraPapelOTijera(String eleccion) {
        //Comenzar a escribir código acá
        //Codigo para generar numeros aleatorios entre 0 y 2.
        Random random = new Random();
        Integer eleccionDeComputadora = random.nextInt(3);

        if (eleccion.equals("piedra")&& eleccionDeComputadora==0 || eleccion.equals("papel")&& eleccionDeComputadora==1 || eleccion.equals("tijera")&& eleccionDeComputadora==2) {
            return "empate. La compu escogió " + eleccionDeComputadora;
        } else if (eleccion.equals("piedra") && eleccionDeComputadora == 1  || eleccion.equals("papel") && eleccionDeComputadora == 2 || eleccion.equals("tijera") && eleccionDeComputadora == 0){
            return "perdedor. La compu escogió " + eleccionDeComputadora;
        } else if (eleccion.equals("piedra") && eleccionDeComputadora == 2 || eleccion.equals("papel") && eleccionDeComputadora == 0 || eleccion.equals("tijera") && eleccionDeComputadora == 1) {
            return "ganador. La compu escogió " + eleccionDeComputadora;
        }else {return "perdedor. Ingrese una opción válida: piedra, papel o tijera.";}

    }












    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Codigo para ingreso de nombre por teclado
        System.out.println ("Nombre del jugador:");
        String nombre = "";
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        //Codigo para ingreso de elección poandresr teclado
        System.out.println ("Elección del jugador:");
        String eleccion = "";
        eleccion = scan.nextLine();
        System.out.println();
        System.out.println("El jugador " + nombre + " resultó " + jugarAlPiedraPapelOTijera(eleccion));
    }
}