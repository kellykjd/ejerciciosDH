package com.company;

public class Cheque {
    //ATRIBUTOS
    private Double monto;
    private String bancoEmisor;
    private String fechaDePago;

    //CONSTRUCTOR
    public Cheque(Double monto, String bancoEmisor, String fechaDePago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDePago = fechaDePago;
    }

    //METODOS

    public Double getMonto() {
        return monto;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }
}
