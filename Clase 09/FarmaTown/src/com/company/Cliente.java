package com.company;

public class Cliente {
    private String nombre;
    private String medicamentoAlergico;

    public Cliente(String nombre, String medicamentoAlergico) {
        this.nombre = nombre;
        this.medicamentoAlergico = medicamentoAlergico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedicamentoAlergico() {
        return medicamentoAlergico;
    }

    @Override
    public boolean equals(Object unObjeto){
    Cliente unCliente = (Cliente) unObjeto;
    return this.medicamentoAlergico.equals(unCliente.medicamentoAlergico);
    }
}
