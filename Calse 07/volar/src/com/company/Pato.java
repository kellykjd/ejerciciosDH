package com.company;

public class Pato implements Volable {
    //ATRIBUTOS
    private Integer energia;

    //CONSTRUCTOR
    public Pato(Integer energia) {

        this.energia = energia;
    }

    //METODOS
    @Override
    public void volar(){
        energia = energia - 5;
        System.out.println("Estoy volando como un pato.");
    }


}
