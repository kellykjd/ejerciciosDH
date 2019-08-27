package com.company;

public class Vehiculo {
    private Integer cantidadAsientos;
    private Integer asientosDisponibles;

    public Vehiculo(Integer cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
        asientosDisponibles = cantidadAsientos;
    }

    public void subir(Pasajero unPasajero){
        if(unPasajero.getPreferencia() == true && asientosDisponibles <1){
            System.out.println("El pasajero "+unPasajero.getNombre()+" no subirá al vehículo. No tiene asientos disponibles.");
        }else if(unPasajero.getPreferencia() == false && asientosDisponibles <1){

            System.out.println("El pasajero "+unPasajero.getNombre()+" subió al vehículo. No quedan asientos disponibles.");
        }else{
            asientosDisponibles = asientosDisponibles -1;
            System.out.println("El pasajero "+unPasajero.getNombre()+" subió al vehículo. Quedan disponibles "+ asientosDisponibles +" asientos.");
        }
    }

    public void bajar(Pasajero unPasajero){

        if(asientosDisponibles >= cantidadAsientos){
            System.out.println("El vehículo está vacío, no tiene pasajeros.");
        }else{
            asientosDisponibles=asientosDisponibles+1;
            System.out.println("El pasajero "+unPasajero.getNombre()+" bajó del vehículo. Quedan "+asientosDisponibles+" asientos disponibles.");
        }
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }
}
