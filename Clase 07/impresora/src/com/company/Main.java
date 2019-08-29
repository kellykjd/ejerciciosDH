package com.company;

public class Main {

    public static void main(String[] args) {


        Foto unaFoto = new Foto();
        Documento unDocumento = new Documento();
        Documento dosDocumento = new Documento();
        Contrato unContrato = new Contrato();
        Foto dosFoto = new Foto();
        Foto tresFoto = new Foto();

        Impresora unaImpresora = new Impresora();
        unaImpresora.añadirALaListaDeImpresion(unaFoto);
        unaImpresora.añadirALaListaDeImpresion(unaFoto);
        unaImpresora.añadirALaListaDeImpresion(unaFoto);
        unaImpresora.añadirALaListaDeImpresion(unDocumento);
        unaImpresora.añadirALaListaDeImpresion(dosDocumento);
        unaImpresora.añadirALaListaDeImpresion(unContrato);
        unaImpresora.añadirALaListaDeImpresion(dosFoto);
        unaImpresora.añadirALaListaDeImpresion(tresFoto);
        unaImpresora.imprimir();

    }
}
