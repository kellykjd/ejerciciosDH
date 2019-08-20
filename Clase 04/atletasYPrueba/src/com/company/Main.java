package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Atleta atlUno = new Atleta("Luis",30,60);
Atleta atlDos = new Atleta("Marcos",60,70);

Prueba testOne = new Prueba(20,60);
Prueba testTwo = new Prueba(30,70);
Prueba testThree = new Prueba(40,80);

testOne.puedeRealizar(atlUno);
testOne.puedeRealizar(atlDos);
testTwo.puedeRealizar(atlUno);
testTwo.puedeRealizar(atlDos);
testThree.puedeRealizar(atlUno);
testThree.puedeRealizar(atlDos);



    }
}
