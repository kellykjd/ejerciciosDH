package com.company;

public class FuegoArtificial implements Explotables{
//ATRIBUTOS
    //Defino el atributo del FuegoArtificial
    private String ruido;

    //CONSTRUCTOR
    public FuegoArtificial(String ruido){
        this.ruido = ruido;
            }
//METODO
    //Defino cómo quiero que explote el fuego artifical solo!! En este casopido que solo imprima el ruido que hace

    @Override
    public void explotar(){
        System.out.println(ruido);
}

    public String getRuido() {
        return ruido;
    }
}

