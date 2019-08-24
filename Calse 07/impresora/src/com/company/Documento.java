package com.company;

public class Documento implements Imprimible {


    @Override
    public void imprimir() {
        System.out.println("Soy un documento de Word.");
    }
}

