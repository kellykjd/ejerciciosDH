package com.example.recyclerstarwars.controller;

import com.example.recyclerstarwars.utils.ResultListener;
import com.example.recyclerstarwars.model.Pelicula;
import com.example.recyclerstarwars.model.PeliculaDao;

import java.util.List;


//TODO Paso 6: creo  los pedidos al DAO pasandole un Result Listener
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



public void traerPelicula(Integer idPelicula, final ResultListener<Pelicula> listenerDeLaVista){
    PeliculaDao peliculaDao= new PeliculaDao();
    peliculaDao.traerPelicula(idPelicula, new ResultListener<Pelicula>() {
        @Override
        public void finish(Pelicula result) {
            listenerDeLaVista.finish(result);
        }
    });
}
}
