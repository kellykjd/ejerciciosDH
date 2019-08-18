package com.company;

public class JugadorDeFutbol {

//ATRIBUTOS
    private String nombre;
    private Integer energia;
    private Integer felicidad;
    private Integer goles;
    private SesionDeEntrenamiento experiencia;

//CONSTRUCTOR
    public JugadorDeFutbol(String nombre, Integer energia, Integer felicidad, Integer goles, SesionDeEntrenamiento experiencia) {
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.goles = goles;
        this.experiencia = experiencia;
    }

//METODOS

    public void hacerGol(){
        if (energia>=5) {
            energia = energia - 5;
            felicidad = felicidad + 10;
            goles = goles + 1;
            System.out.println("GOOOOL!");
        }else{
            System.out.println("El jugador no puede jugar más");
}
    }

    public void correr(){
        if (energia>=10){
            energia = energia - 10;
            System.out.println("No me dan mas las piernas");
        }else{
            System.out.println("El jugador no puede correr más");
        }
    }



}
