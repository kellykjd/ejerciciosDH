package com.binweb.practicalistas;

public class Villano {
    private String nombre;
    private Integer imagen;
    private String poder;

    public Villano(String nombre, Integer imagen, String poder) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    public String getPoder() {
        return poder;
    }
}
