package com.manoelcampos.desconto;

public abstract class Desconto {
    Venda venda;

    public Desconto(Venda venda) {
        this.venda = venda;
    }

    public abstract double getValorDesconto();
}
