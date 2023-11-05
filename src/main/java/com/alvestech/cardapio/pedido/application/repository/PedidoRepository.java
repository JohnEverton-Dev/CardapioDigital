package com.alvestech.cardapio.pedido.application.repository;

import com.alvestech.cardapio.pedido.domain.Pedido;

public interface PedidoRepository {
    Pedido savePedido(Pedido pedido);
}