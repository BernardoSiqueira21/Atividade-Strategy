package com.example.strategy;

public class Pix implements PagamentoStrategy {

    @Override
    public double pagar(double valor) {
        // desconto de 10%
        return valor * 0.9;
    }
}