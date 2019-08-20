package com.company;

public class SesionDeEntrenamiento {

//ATRIBUTOS
    private Integer experienciaEntrenamiento;
    private JugadorDeFutbol jugador;

//CONSTRUCTOR
    public SesionDeEntrenamiento(JugadorDeFutbol jugador) {
        this.jugador = jugador;
        experienciaEntrenamiento = 0;
    }

//METODOS
    public void entrenarA(JugadorDeFutbol jugador){
        if (jugador.getEnergia()>=25) {
            System.out.println("El jugador "+jugador.getNombre()+" comienza el entrenamiento.");
            jugador.correr();
            jugador.hacerGol();
            jugador.correr();
            experienciaEntrenamiento = jugador.getExperiencia() + 1;
            System.out.println("La experiencia inicial del"+jugador.getNombre()+" jugador era: " + jugador.getExperiencia());
            System.out.println("La experiencia actual del"+jugador.getNombre()+" jugador es: " + experienciaEntrenamiento);
            System.out.println("El jugador "+jugador.getNombre()+" tiene "+jugador.getEnergia()+" de energia, "+ jugador.getFelicidad()+" de felicidad y "+jugador.getGoles()+" goles acumulados.");
        }else{
            System.out.println("El jugador "+jugador.getNombre()+ " no tiene suficiente energía para entrenar!!!");
        }
    }


}

