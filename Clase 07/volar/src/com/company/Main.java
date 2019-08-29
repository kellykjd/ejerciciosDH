package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

Pato unPato = new Pato(20);
Pato francisco = new Pato (32);
Avion unAvion = new Avion(20);
Superman unSuperman = new Superman(30);
TorreDeControl unaTorreDeControl = new TorreDeControl();

unaTorreDeControl.agregarVolador(unPato);
unaTorreDeControl.agregarVolador(francisco);
unaTorreDeControl.agregarVolador(unAvion);
unaTorreDeControl.agregarVolador(unSuperman);

unaTorreDeControl.vuelenTodos();
    }
}
