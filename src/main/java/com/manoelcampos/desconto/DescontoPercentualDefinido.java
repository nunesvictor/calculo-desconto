package com.manoelcampos.desconto;

public class DescontoPercentualDefinido extends Desconto {
    private static final double PERCENTUAL_DESCONTO = .05;

    public DescontoPercentualDefinido(Venda venda) {
        super(venda);
    }

    @Override
    public double getValorDesconto() {
        return venda.getValorTotal() * PERCENTUAL_DESCONTO;
    }
}
