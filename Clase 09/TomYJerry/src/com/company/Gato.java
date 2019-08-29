package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Gato {
    //ATIBUTOS
    private String nombre;
    private Double energia;
    private Double velocidad;
    private List<Raton> listadoRatones;


    //CONTRUCTOR

    public Gato(String nombre) {
        this.nombre = nombre;
        this.energia = 0.0;
        this.velocidad = 5.0;
        listadoRatones = new ArrayList<>();
    }

    //MÉTODOS

    public String getNombre() {
        return nombre;
    }

    public Double getEnergia() {
        return energia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public List getListadoRatones() {
        return listadoRatones;
    }

    public void comerRaton(Raton unRaton){
        energia=energia+unRaton.getPeso();
    }

    public void agregarRatones(Raton unRaton){
        listadoRatones.add(unRaton);
    }

    public void comerRaton(List<Raton> ratones){
        for (Raton unRaton: listadoRatones) {
                comerRaton(unRaton);
        }
    }

    public Double correr(Integer cantidadMetros){
            energia = energia - (0.5*cantidadMetros);
        return cantidadMetros/velocidad;
    }

    public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){

        return (energia=energia+unRaton.getPeso()) > (energia = energia - (0.5*unaDistancia));
    }





}
