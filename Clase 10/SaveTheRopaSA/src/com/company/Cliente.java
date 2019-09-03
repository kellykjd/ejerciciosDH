package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Prenda> prendas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        prendas = new ArrayList<>();
    }

    public void prendas(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public List<Prenda> getPrendas() {
         return prendas;
    }
}
