package com.company;

public class Coca{

    private Integer tamaño;
    private Double precio;

    public Coca(Integer tamaño, Double precio) {
        this.tamaño = tamaño;
        this.precio = precio;
    }

    //Object es una clase implícita en Java, todos los objetos heredan de Object sus métodos.
    //equals() es un método heredado de Object.
    //Sobreescribo el método equals para indicarle que me compare epecíficamente el contenido del atributo que quiero, en este caso el tamaño.
    @Override
    /*equals() devuelve un booleano y debo hacer que pida un parámetro de tipo objeto para que pueda sobreescribirse
    el método equals(). Si por ejemplo igreso un parámetro de tipo COCA, el método no se sobreescribirá sino que el
    sistema lo tomará como uno nuevo.*/
    public boolean equals(Object unObjeto){
    //aquí le digo a Java que haga un CAST. Es decir, que convierta a "unObject" a la clase de tipo COCA
    //un CAST se construye así:
    //TipoDeObjetoQueNecesito + NombreDelObjeto = TipoDeObjetoQueUsaréParaConvertir + NombreDelObjetoAlQueConvertiré
    Coca unaCoca = (Coca) unObjeto;
    //aquí comparo los atributos que quiero que definan si ambos objetos contienen los mismo, en este caso: tamaño.
    //como todavía equals() no está modificado en sí, puedo usarlo para hacer la comparación.
        return (this.tamaño.equals(unaCoca.tamaño));}

}
