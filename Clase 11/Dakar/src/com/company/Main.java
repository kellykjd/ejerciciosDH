package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carrera dakar = new Carrera(200,5000,"Dakar",4);
        Auto auto1 = new Auto(150,40,95,"AE8878");
        Auto auto2 = new Auto(300,30,95,"AE8879");

        Moto moto1 = new Moto(90,70,180,"MO0100");
        Moto moto2 = new Moto(180,10,95,"MO0101");


        dakar.darDeAltaAuto(auto1.getVelocidad(),auto1.getAceleracion(),auto1.getAnguloDeGiro(),auto1.getPatente());
        dakar.darDeAltaAuto(auto2.getVelocidad(),auto2.getAceleracion(),auto2.getAnguloDeGiro(),auto2.getPatente());
        dakar.darDeAltaMoto(moto1.getVelocidad(),moto1.getAceleracion(),moto1.getAnguloDeGiro(),moto1.getPatente());
        dakar.darDeAltaMoto(moto2.getVelocidad(),moto2.getAceleracion(),moto2.getAnguloDeGiro(),moto2.getPatente());

        dakar.eliminarVehiculo(auto1);
        dakar.eliminarVehiculoconPatente("MO0100");


    }
}
