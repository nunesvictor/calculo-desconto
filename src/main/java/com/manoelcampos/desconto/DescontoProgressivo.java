package com.manoelcampos.desconto;

import java.math.BigDecimal;

public class DescontoProgressivo extends Desconto {
    public DescontoProgressivo(Venda venda) {
        super(venda);
    }

    @Override
    public double getValorDesconto() {
        int quarter = new BigDecimal(String.valueOf(venda.getValorTotal() / 25)).intValue();

        double desconto = switch(quarter) {
            case 0 -> 0;
            case 1 -> .10;
            case 2 -> .15;
            default -> .20;
        };

        return venda.getValorTotal() * desconto;
    }
}
