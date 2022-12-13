package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Victor", LocalDate.now());
        Venda venda = new Venda(1, LocalDate.now(), 125.20);

        Desconto desconto = new DescontoPercentualDefinido(venda);
        System.out.printf("Desconto de percentual definido: %.2f\n", desconto.getValorDesconto());

        desconto = new DescontoProgressivo(venda);
        System.out.printf("Desconto progressivo: %.2f\n", desconto.getValorDesconto());

        desconto = new DescontoAniversario(venda, cliente);
        System.out.printf("Desconto de aniversário: %.2f\n", desconto.getValorDesconto());
    }
}
