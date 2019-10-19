package com.example.recyclerstarwars.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//4to PAso TODO
public class PeliculasRetrofitDAO {

    private Retrofit retrofit;
    protected PeliculasService peliculasService;


    public PeliculasRetrofitDAO(String baseURL) {
        retrofit = new Retrofit.Builder()
                //Aqui le indico que el baseURL se lo pasan por parámetro
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        peliculasService = retrofit.create(PeliculasService.class);
    }
}
