package com.company;

public class Tripode {

    //ATRIBUTOS
    private Boolean plegado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaActual;


    //CONSTRUCTOR

    public Tripode(Boolean plegado, Integer alturaMinima, Integer alturaMaxima, Integer alturaActual) {
        this.plegado = plegado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaActual = alturaActual;
    }

    //METODOS
    public void definirAltura(Integer nuevaAltura) {
        System.out.println("La altura previa del trípode era de " + alturaActual);
        this.alturaActual = nuevaAltura;
        System.out.println("La nueva altura del trípode es de " + alturaActual);
    }

    public void plegar(){
        this.plegado = true;
        System.out.println("Trípode plegado");
    }

    public void desplegar(){
        this.plegado = false;
        System.out.println("Trípode desplegado");
    }

    public void guardar(){
        this.plegado = false;
        this.alturaActual = alturaMinima;
        System.out.println("Trípode preparado para guardar.");
    }

    public Boolean listoParaGuardar(){
        System.out.println("Trípode está listo para guardar.");
        return plegado == true && alturaActual <= alturaMinima ;
    }

    public void usar(){
        this.plegado = false;
        this.alturaActual = ((alturaMaxima/2)+1);
        System.out.println("Trípode preparado para usar.");
    }

    public Boolean listoParaUsar(){
        System.out.println("Trípode está listo para usar.");
        return plegado == false && alturaActual > (alturaMaxima/2);
    }






}
