package com.company;

public class Superman implements Volable {
    private Integer experiencia;

    public Superman(Integer experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void volar(){
        experiencia=experiencia + 3;
        System.out.println("Estoy volando como un campeón.");
    }
}
