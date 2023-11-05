package com.alvestech.cardapio.pedido.application.service;

import com.alvestech.cardapio.pedido.application.api.PedidoRequest;
import com.alvestech.cardapio.pedido.application.api.PedidoResponse;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoResponse savePedido(PedidoRequest pedidoRequest);
    PedidoResponse findPedidoById(UUID idPedido);
    List<PedidoResponse> findAllPedidos();
}