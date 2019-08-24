package com.company;

public class InvitadoDH extends Invitado{
//ATRIBUTOS
//Hereda los mismos atributos de la clase Invitado


//CONSTRUCTOR
    public InvitadoDH(String nombre, Integer dni){
        super(nombre,dni);
    }

//METODOS
    //Defino cómo quiero que imprima la interfaz
    @Override
    public void comer(){
        System.out.println("Viva La Chiqui");
    }

}
