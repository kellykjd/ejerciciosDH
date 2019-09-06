package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carrera dakar = new Carrera(150.0,5000,"Dakar",3);
        Auto auto1 = new Auto(180.0,80.0,30.5,"AE8878");
        Auto auto2 = new Auto(150.0,100.0,90.0,"AE8879");
        Moto moto1 = new Moto(90.0,50.0,180.0,"MO9901");
        Moto moto2 = new Moto(90.0,80.0,30.0,"MO9902");

        dakar.darDeAltaUnAuto(auto1.getVelocidad(),auto1.getAceleracion(),auto1.getAnguloDeGiro(),auto1.getPatente());
        dakar.darDeAltaUnAuto(auto2.getVelocidad(),auto2.getAceleracion(),auto2.getAnguloDeGiro(),auto2.getPatente());
        dakar.darDeAltaUnMoto(moto1.getVelocidad(),moto1.getAceleracion(),moto1.getAnguloDeGiro(),moto1.getPatente());
        dakar.darDeAltaUnMoto(moto2.getVelocidad(),moto2.getAceleracion(),moto2.getAnguloDeGiro(),moto2.getPatente());

        dakar.eliminarVehiculo(moto1);
        dakar.eliminarVehiculo("AE8879"); //También puede ser dakar.eliminarVehiculo(auto2.getPatente());
        dakar.darDeAltaUnMoto(moto2.getVelocidad(),moto2.getAceleracion(),moto2.getAnguloDeGiro(),moto2.getPatente());
        dakar.definirGanador();

        dakar.socorrerAuto(auto1.getPatente());
        dakar.socorrerMoto(moto2.getPatente());



    }
}
