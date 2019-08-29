package com.company;

public class Avion implements Volable {
    private Integer horasDeVuelo;

    public Avion(Integer horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }
    @Override
    public void volar(){
        //horasDeVuelo += 13;
        horasDeVuelo = horasDeVuelo + 13;
        System.out.println("Estoy volando como un avión.");
    }
}
