package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Gato {
    //ATIBUTOS
    private String nombre;
    private Double energia;
    private Double velocidad;


    //CONTRUCTOR

    public Gato(String nombre) {
        this.nombre = nombre;
        this.energia = 0.0;
        this.velocidad = 5.0;
    }


    //MÉTODOS


    public void comerRaton(Raton unRaton){
        energia=energia+unRaton.getPeso();
        System.out.println("Me comí un ratón, mi nueva energía es : "+energia);

    }

    public void comerRaton(List<Raton> ratones){
        for (Raton unRaton: ratones) {
                comerRaton(unRaton);
        }
    }

    public Double energiaConsumida(Integer cantidadMetros){
        return 0.5*cantidadMetros;
    }

    public Double correr(Integer cantidadMetros){
        energia=energia-energiaConsumida(cantidadMetros);
        return cantidadMetros/velocidad;
    }

    public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){
        return (unRaton.getPeso() > (energia-energiaConsumida(unaDistancia)));
    }







}
