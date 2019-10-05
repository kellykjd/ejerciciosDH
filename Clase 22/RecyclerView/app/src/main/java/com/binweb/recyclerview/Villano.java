package com.binweb.recyclerview;

public class Villano {
    private String nombre;
    private String superPoder;

    public Villano(String nombre, String superPoder) {
        this.nombre = nombre;
        this.superPoder = superPoder;
    }


    public String getNombre() {
        return nombre;
    }

    public String getSuperPoder() {
        return superPoder;
    }
}
