package com.company;

public class CuentaCorriente extends Cuenta {
    //ATRIBUTOS
private Double saldo;
private Double montoAutorizado;


    //CONSTRUCTOR
    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular);
        this.saldo = getSaldo();
        this.montoAutorizado = 2000.0;
    }

    //METODOS
    public void extraerEfectivo(Double monto){
        if (monto >= getSaldo()-montoAutorizado) {
            extraer(monto);
        }else{
            System.out.println("Monto Insuficiente!!");
        }
    }

    public void depositarCheque(Cheque cheque){
            depositar(cheque.getMonto());
        System.out.println("Se ha depositado un cheque en su cuenta de "+cheque.getMonto()+". Su saldo actual es de "+getSaldo());
                }

}
