package com.example.recyclerstarwars.model;

import android.util.Log;

import com.example.recyclerstarwars.utils.ResultListener;

import java.util.List;

//pendiente que no importe call.telecom

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//TODO PASO 5
public class PeliculaDao extends PeliculasRetrofitDAO{

private static final String BASE_URL="https://swapi.co/";
    public PeliculaDao() {
        super(BASE_URL);

    }

    public void traerPeliculas(final ResultListener<List<Pelicula>> listenerDelController){

        Call<ContainerPeliculas> call = peliculasService.traerPeliculas();

        call.enqueue(new Callback<ContainerPeliculas>() {
            @Override
            public void onResponse(Call<ContainerPeliculas> call, Response<ContainerPeliculas> response) {
                ContainerPeliculas containerPeliculas = response.body();
                listenerDelController.finish(containerPeliculas.getResults());

            }

            @Override
            public void onFailure(Call<ContainerPeliculas> call, Throwable t) {
                Log.d("aqui","pasa esto");
            }
        });

    }

//pedido adicional de ejemplo
    public void traerPelicula(Integer idPelicula,final ResultListener<Pelicula> listenerDelController){
        Call<Pelicula> call = peliculasService.traerPelicula(idPelicula);
        call.enqueue(new Callback<Pelicula>() {
            @Override
            public void onResponse(Call<Pelicula> call, Response<Pelicula> response) {
                Pelicula pelicula = response.body();
                listenerDelController.finish(pelicula);
            }

            @Override
            public void onFailure(Call<Pelicula> call, Throwable t) {

            }
        });
    }

}
