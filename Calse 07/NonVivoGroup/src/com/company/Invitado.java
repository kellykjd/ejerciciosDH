package com.company;

public class Invitado {
//ATRIBUTOS
    private String nombre;
    private Integer dni;

//CONSTRUCTOR
    public Invitado(String nombre, Integer dni){
    this.nombre = nombre;
    this.dni = dni;
    }

//METODOS
    //Defino lo que quiero que haga ek método estándar
    public void comer(){
        System.out.println("Estoy comiendo torta");
    }

}
