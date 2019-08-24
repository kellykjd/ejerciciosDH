package com.company;

public class Pato implements Volable {
    private Integer energia;

    public Pato(Integer energia) {
        this.energia = energia;
    }

    @Override
    public void volar(){
        energia = energia - 5;
        System.out.println("Estoy volando como un pato.");
    }


}
