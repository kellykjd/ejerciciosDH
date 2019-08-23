package com.company;

public class CuentaConvertilidad extends CuentaCorriente {
    private Double saldoDolares;

    public CuentaConvertilidad(Cliente titular, Double saldoDolares) {
        super(titular,null);
        this.saldoDolares = 0.00;
    }


}
