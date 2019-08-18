package com.company;

public class Perro {

    // ATRIBUTOS se arma asi:   visibilidad tipoDeDato nombreAtributo
    private String nombre;
    private Integer energia;

    //CONSTRUCTOR
        public Perro(String nombreDelPerro) { //un constructor no lleva tipo de retorno, solo visibolidad y debe llamarse igual a la clase
        nombre = nombreDelPerro;
        energia = 100;
    }

    // METODOS se arma asi:   visibilidad tipoDeRetorno nombreMetodo (tipoDeDato parametro){}
    public void caminar() {
        if (energia>=10){energia = energia - 5;
        }else{
            ladrar();}

    }

    public void ladrar() {
        System.out.println("¡WUUF, WUUF!");
    }

//GETTERS Y SETTERS
    public String obtenerNombre(){
        return nombre;
    }

}