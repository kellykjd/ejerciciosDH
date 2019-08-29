package com.company;

public abstract class Invitado extends Object {
//ATRIBUTOS
    private String nombre;
    private Integer dni;

//CONSTRUCTOR
    public Invitado(String nombre, Integer dni){
    this.nombre = nombre;
    this.dni = dni;
    }

//METODOS
    //Defino lo que quiero que haga el método estándar
    public abstract void comer();
    }




