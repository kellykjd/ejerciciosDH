package com.company;

public class VehiculoMicro extends Vehiculo {
    private Integer cantidadPlazas;
    private Integer plazasDisponibles;
    private Integer asientosDisponibles;

    public VehiculoMicro(Integer asientosDisponibles, Integer cantidadPlazas) {
        super(asientosDisponibles);
        this.cantidadPlazas = cantidadPlazas;
        plazasDisponibles = cantidadPlazas;
    }

    @Override
    public void subir(Pasajero unPasajero) {
        if (unPasajero.getPreferencia()==false && plazasDisponibles > 0 && getAsientosDisponibles() < 0){
            plazasDisponibles = plazasDisponibles -1;
            System.out.println("El pasajero "+unPasajero.getNombre()+" subió al vehículo. Quedan disponibles "+plazasDisponibles+ " plazas y"+getAsientosDisponibles()+" asientos.");
        }else{
            super.subir(unPasajero);
        }
    }
}
