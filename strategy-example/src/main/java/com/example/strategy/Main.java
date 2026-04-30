package com.example.strategy;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.setStrategy(new Pix());
        System.out.println("Pix: " + pedido.finalizarCompra(100));

        pedido.setStrategy(new CartaoCredito());
        System.out.println("Cartão: " + pedido.finalizarCompra(100));

        pedido.setStrategy(new Boleto());
        System.out.println("Boleto: " + pedido.finalizarCompra(100));
    }
}