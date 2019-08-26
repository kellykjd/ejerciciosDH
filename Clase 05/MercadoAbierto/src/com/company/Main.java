package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmpleadoComision empleadoComision1 = new EmpleadoComision("Luis",3000.0,5);
        empleadoComision1.registrarVenta(2500.0);
        empleadoComision1.registrarVenta(700.0);
        empleadoComision1.registrarVenta(1000.0);
        EmpleadoFijo empleadoFijo1 = new EmpleadoFijo("Pedro",7000.0,8);
        EmplTiempoIndeter empleadoTiempoIndeterminado1 = new EmplTiempoIndeter("Lorena", 10000.0, 2,7);
        Empresa unaEmpresa = new Empresa();
        unaEmpresa.regitrarEmpleado(empleadoComision1);
        unaEmpresa.regitrarEmpleado(empleadoFijo1);
        unaEmpresa.regitrarEmpleado(empleadoTiempoIndeterminado1);

        unaEmpresa.pagarSueldo();
    }
}
