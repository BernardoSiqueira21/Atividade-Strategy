package com.example.strategy;

public class Pedido {

    private PagamentoStrategy strategy;

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public double finalizarCompra(double valor) {
        if (strategy == null) {
            throw new IllegalStateException("Forma de pagamento não definida");
        }
        return strategy.pagar(valor);
    }
}