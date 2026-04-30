package com.example.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void testPixComDesconto() {
        Pedido pedido = new Pedido();
        pedido.setStrategy(new Pix());

        double resultado = pedido.finalizarCompra(100);

        assertEquals(90.0, resultado);
    }

    @Test
    void testCartaoComTaxa() {
        Pedido pedido = new Pedido();
        pedido.setStrategy(new CartaoCredito());

        double resultado = pedido.finalizarCompra(100);

        assertEquals(105.0, resultado);
    }

    @Test
    void testBoletoSemAlteracao() {
        Pedido pedido = new Pedido();
        pedido.setStrategy(new Boleto());

        double resultado = pedido.finalizarCompra(100);

        assertEquals(100.0, resultado);
    }

    @Test
    void testSemStrategy() {
        Pedido pedido = new Pedido();

        assertThrows(IllegalStateException.class, () -> {
            pedido.finalizarCompra(100);
        });
    }
}