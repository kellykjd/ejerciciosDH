package com.company;

import java.util.HashSet;
import java.util.Set;

public class Restaurante {
private Set<Empleado> listaEmpleados;

public Restaurante(){
    listaEmpleados = new HashSet<>();
}

public void listaDeEmpleados(Empleado unEmpleado){
    listaEmpleados.add(unEmpleado);
}

public void pagarNomina(){
    for (Empleado unEmpleado: listaEmpleados) {
        unEmpleado.cobrar();}
}



}
