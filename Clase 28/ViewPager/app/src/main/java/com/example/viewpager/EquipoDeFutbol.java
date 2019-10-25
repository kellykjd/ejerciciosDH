package com.example.viewpager;

import java.io.Serializable;

//le extiendo de serializable para que pueda pasar por bundle
public class EquipoDeFutbol implements Serializable {

    private String nombre;
    private String urlImagen;

    public EquipoDeFutbol(String nombre, String urlImagen) {
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
}
