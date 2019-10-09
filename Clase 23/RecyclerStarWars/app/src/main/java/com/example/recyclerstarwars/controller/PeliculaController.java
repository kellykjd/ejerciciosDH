package com.example.recyclerstarwars.controller;

import com.example.recyclerstarwars.model.Pelicula;
import com.example.recyclerstarwars.model.PeliculaDao;

import java.util.ArrayList;
import java.util.List;

public class PeliculaController {

public List<Pelicula> traerPeliculas(){
    PeliculaDao peliculaDao = new PeliculaDao();
    return peliculaDao.traerPeliculas();
}

}
