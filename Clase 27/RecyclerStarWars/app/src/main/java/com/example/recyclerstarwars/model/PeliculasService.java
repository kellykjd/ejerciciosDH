package com.example.recyclerstarwars.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//Paso 3 TODO
public interface PeliculasService {

    @GET("/api/films")
    Call<ContainerPeliculas> traerPeliculas();

    @GET("/api/films/{id}")
    Call<Pelicula>  traerPelicula(@Path("id") int idPelicula);
}
