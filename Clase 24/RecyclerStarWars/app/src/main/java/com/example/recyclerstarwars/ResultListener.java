package com.example.recyclerstarwars;

//Lister genérico para cualquier objeto que quiera recibir
public interface ResultListener <T>{

    public void finish(T result);
}
