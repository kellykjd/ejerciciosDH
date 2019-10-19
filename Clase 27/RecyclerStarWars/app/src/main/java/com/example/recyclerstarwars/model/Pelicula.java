package com.example.recyclerstarwars.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Pelicula implements Serializable {

    @SerializedName("title")
    private String titulo;
    @SerializedName("release_date")
    private String fechaEstreno;
    private String director;
    @SerializedName("opening_crawl")
    private String sinopsis;

    public Pelicula(String titulo, String fechaEstreno, String director, String sinopsis) {
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.director = director;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
