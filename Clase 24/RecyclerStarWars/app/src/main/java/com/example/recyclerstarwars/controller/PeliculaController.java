package com.example.recyclerstarwars.controller;

import com.example.recyclerstarwars.ResultListener;
import com.example.recyclerstarwars.model.Pelicula;
import com.example.recyclerstarwars.model.PeliculaDao;

import java.util.ArrayList;
import java.util.List;

public class PeliculaController {

public void traerPeliculas(final ResultListener listenerDeLaVista){
    PeliculaDao peliculaDao = new PeliculaDao();
    peliculaDao.traerPeliculas(new ResultListener<List<Pelicula>>() {
        @Override
        public void finish(List<Pelicula> result) {
            //Aqui puedo modificar cómo quiero entregar el objeto, por ejemplo ordenar la lista, remover, etc
            listenerDeLaVista.finish(result);
        }
    });
}

}
