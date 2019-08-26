package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Empleado> listaDeEmpleados = new ArrayList<>();


    public void regitrarEmpleado(Empleado unEmpleado){
        listaDeEmpleados.add(unEmpleado);
    }

  public void pagarSueldo(){
      for (Empleado unEmpleado: listaDeEmpleados) {
          unEmpleado.cobrar();
      }


  }
}
