package com.company;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private List<String> listaDrogas;
    private String unaDroga;


    public Medicamento() {
        listaDrogas = new ArrayList<>();
        this.unaDroga = unaDroga;
    }

    public void contiene(String unaDroga){
        listaDrogas.add(unaDroga);
    }

    public boolean sePuedeVender(Cliente unCliente){
    if (listaDrogas.contains(unCliente.getMedicamentoAlergico())){
        System.out.println("El cliente "+unCliente.getNombre()+" no puede comprar el medicamento ya que es alérgico al "+unCliente.getMedicamentoAlergico());
        return true;
    }else{
        System.out.println("El cliente "+unCliente.getNombre()+" puede comprar el medicamento.");
        return  false;
    }
    }

}
