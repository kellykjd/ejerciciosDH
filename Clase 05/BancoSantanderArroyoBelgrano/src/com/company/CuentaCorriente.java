package com.company;

public class CuentaCorriente extends Cuenta {
    //ATRIBUTOS
private Double montoAutorizado;


    //CONSTRUCTOR
    public CuentaCorriente(Cliente titular, Double montoAutorizado) {
        super(titular);
        this.montoAutorizado = montoAutorizado;
    }

    //METODOS
    public void extraerEfectivo(Double platita){
        if (getSaldo()<=platita) {
            depositar(montoAutorizado);
            extraer(platita);
        }else{
            extraer(platita);
        }
    }

    public void depositarCheque(Cheque cheque){
            depositar(cheque.getMonto());
        System.out.println("Se ha depositado un cheque en su cuenta de "+cheque.getMonto()+". Su saldo actual es de "+getSaldo());
                }

}
