package com.example.strategy;

public class Boleto implements PagamentoStrategy {

    @Override
    public double pagar(double valor) {
        // sem alteração
        return valor;
    }
}