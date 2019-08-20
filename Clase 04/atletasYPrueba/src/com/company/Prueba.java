package com.company;

public class Prueba {

    //ATRIBUTOS
    private Integer dificultadRequerida;
    private Integer energiaRequerida;
    private Atleta atleta;

    //CONSTRUCTOR

    public Prueba(Integer dificultadRequerida, Integer energiaRequerida) {
        this.dificultadRequerida = dificultadRequerida;
        this.energiaRequerida = energiaRequerida;
    }

    //METODOS

    public Boolean puedeRealizar(Atleta atleta){
        if (atleta.getNivel()>=dificultadRequerida && atleta.getEnergia()>=energiaRequerida){
            System.out.println("El atleta "+atleta.getNombre()+" puede realizar la prueba.");
            return true;
        }else{
            System.out.println("El atleta "+atleta.getNombre()+" no puede realizar la prueba.");
            return false;
        }


    }
}
