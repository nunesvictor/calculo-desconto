package com.manoelcampos.desconto;

import java.time.YearMonth;

public class DescontoAniversario extends Desconto {
    private static final double PERCENTUAL_DESCONTO = .15;

    private final Cliente cliente;

    public DescontoAniversario(Venda venda, Cliente cliente) {
        super(venda);
        this.cliente = cliente;
    }

    @Override
    public double getValorDesconto() {
        if (!YearMonth.from(venda.getData()).equals(YearMonth.from(cliente.getDataNascimento()))) {
            return 0;
        }

        return venda.getValorTotal() * PERCENTUAL_DESCONTO;
    }
}
