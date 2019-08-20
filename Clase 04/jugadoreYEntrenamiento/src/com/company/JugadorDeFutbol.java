package com.company;

public class JugadorDeFutbol {

    //ATRIBUTOS
    private String nombre;
    private Integer energia;
    private Integer felicidad;
    private Integer goles;
    private Integer experiencia;

    //CONSTRUCTOR
    public JugadorDeFutbol(String nombre, Integer energia, Integer felicidad, Integer goles, Integer experiencia) {
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.goles = goles;
        this.experiencia = experiencia;
    }

//METODOS

    public void hacerGol() {
        energia = energia - 5;
        felicidad = felicidad + 10;
        goles = goles + 1;
        System.out.println("GOOOOL!");
     }

    public void correr() {
        energia = energia - 10;
        System.out.println("No me dan mas las piernas");
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getGoles() {
        return goles;
    }

    public Integer getFelicidad() {
        return felicidad;
    }
}
