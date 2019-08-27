package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pasajero pasajeroUno = new Pasajero("Luis",true);
        Pasajero pasajeroDos = new Pasajero("Marcos",false);
        Pasajero pasajeroTres = new Pasajero("Ana",true);
        Pasajero pasajeroCuatro = new Pasajero("Iván",false);

        Empresa acme = new Empresa();

        acme.agregarAGrupoDePasajeros(pasajeroUno);
        acme.agregarAGrupoDePasajeros(pasajeroDos);
        acme.agregarAGrupoDePasajeros(pasajeroTres);

        VehiculoCombi combi = new VehiculoCombi(0);
        VehiculoAuto auto = new VehiculoAuto(2);
        VehiculoMicro micro = new VehiculoMicro(2,2);

        micro.subir(pasajeroUno);
        micro.subir(pasajeroDos);
        micro.subir(pasajeroCuatro);
        micro.bajar(pasajeroUno);
        micro.subir(pasajeroTres);
        micro.subir(pasajeroCuatro);
        micro.subir(pasajeroDos);

    }
}
