package EjercitacionAvanzados;

import java.util.Random;

/**
 * Created by digitalhouse on 12/08/16.
 */
public class EjercicioCazadorDragones {

    public static void juegoDelCazador() {

Integer danioTotalAlDragon=0;



for (int i=0; i<=4; i++){
        if (decidirSiElJuegoContinua()) {
            if (decidirSiGolpeaJugador()) {
                System.out.println("El jugador golpea al dragón.");
                danioTotalAlDragon=danioTotalAlDragon+decidirCuantoGolpeaJugador();
            } else {
                System.out.println("El dragón golpeó al jugador!!");
            }
        }else{
            System.out.println("Juego finalizado. El ganador fue el + . El daño hecho al dragón fue de: + unidades." );
        }
    }
    }
//Variable para decidir si golpea el jugador o golpea el dragón
    private static Boolean decidirSiGolpeaJugador() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

//Variable para decidir cuánto daño se le hace al dragón en cada partida
    private static Integer decidirCuantoGolpeaJugador() {
        //El numero aleatorio que elijo será entre 0 y 4 para poder jugar más tiempo.
        Random rand = new Random();
        return rand.nextInt(5);
    }
    //Variable para controlar si continúa el juego o no
    private static Boolean decidirSiElJuegoContinua() {
        return danioTotalAlDragon() <= 4 || decidirSiGolpeaJugador();
    }

    public static void main(String[] args){
        juegoDelCazador();

    }
}
