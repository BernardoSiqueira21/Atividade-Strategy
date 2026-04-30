package com.example.strategy;

public class CartaoCredito implements PagamentoStrategy {

    @Override
    public double pagar(double valor) {
        // taxa de 5%
        return valor * 1.05;
    }
}