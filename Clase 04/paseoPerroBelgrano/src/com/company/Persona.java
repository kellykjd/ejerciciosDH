package com.company;

public class Persona { //UperCamelCase

    // ATRIBUTOS se arma asi:   visibilidad tipoDeDato nombreAtributo
private String nombre;
private Perro unPerro; //lowerCamelCase

    //COSTRUCTOR
    public Persona(String nombre, Perro unPerro){
        this.nombre = nombre;
        this.unPerro = unPerro;
    }

    // METODOS se arma asi:   visibilidad tipoDeRetorno nombreMetodo (tipoDeDato parametro){}
    public void pasearPerro(Integer cuadras){
for(int i= 1; i<= cuadras; i++){
    unPerro.caminar();
    System.out.println("Caminamos "+i+" cuadras");
}

    }

}
