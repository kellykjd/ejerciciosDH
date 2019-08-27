package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Pasajero> grupoPasajeros = new ArrayList<>();

    public void agregarAGrupoDePasajeros(Pasajero unPasajero){
        grupoPasajeros.add(unPasajero);
    }

    public void subirGrupoPasajeros(Vehiculo unVehiculo){
        for (Pasajero unPasajero: grupoPasajeros) {
            unVehiculo.subir(unPasajero);
        }
    }

}
