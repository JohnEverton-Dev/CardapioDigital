package com.alvestech.cardapio.pedido.application.repository;

import com.alvestech.cardapio.pedido.domain.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoRepository {
    Pedido savePedido(Pedido pedido);
    Pedido findPedidoById(UUID idPedido);
    List<Pedido> findAllPedidos();
}