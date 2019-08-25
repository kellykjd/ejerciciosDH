package com.company;

import java.util.ArrayList;
import java.util.List;

public class NonVivoGroup {
//ATRIBUTOS
    private List<Invitado> listaDeInvitados = new ArrayList<>();
    private List<Explotables> listaDeExplotables = new ArrayList<>();

//CONSTRUCTOR

//METODOS
//Defino el método para añadir un explotable a una lista (sea individual o de packs)
public void añadirALaListaDeExplotables(Explotables unExplotable){
    listaDeExplotables.add(unExplotable);
}

//Defino el método para añadir los invitados a una lista
public void añadirALaListaDeInvitados(Invitado unInvitado){
        listaDeInvitados.add(unInvitado);
}



//Defino el método para repartir la torta. Como en esta caso ninguna otra clase accederá a repartir la torta y es un método propio, lo declaro privado
private void repartirTorta(){
    System.out.println("Repartiremos la torta");
    for (Integer i = 0; i<listaDeInvitados.size();i++){
        Invitado unInvitado = listaDeInvitados.get(i);
        unInvitado.comer();
    }
}

//Defino el método para reventar los fuegos artificiales. Como en esta caso ninguna otra clase accederá a encender los fuegos y es un método propio, lo declaro privado
private void reventarFuegos(){
    for (Explotables unExplotable: listaDeExplotables) {
        unExplotable.explotar();
    }
}

//Defino el método de encender las velas. Dentro de encender las velas llamo a los otros 2 meétodos privados.
    public void encenderVelas(){
System.out.println("Encenderemos las velas.");
reventarFuegos();
repartirTorta();
    }



}

