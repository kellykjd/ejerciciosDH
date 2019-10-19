package com.example.recyclerstarwars.utils;

//Lister genérico para cualquier objeto que quiera recibir
public interface ResultListener <T>{

    public void finish(T result);
}
