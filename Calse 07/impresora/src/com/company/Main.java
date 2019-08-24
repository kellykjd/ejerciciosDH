package com.company;

public class Main {

    public static void main(String[] args) {


        Foto unaFoto = new Foto();
        Impresora unaImpresora = new Impresora();
        unaImpresora.añadirALaListaDeImpresion(unaFoto);
        unaImpresora.imprimir();

    }
}
