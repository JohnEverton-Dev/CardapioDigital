package com.alvestech.cardapio.pedido.application.service;

import com.alvestech.cardapio.pedido.application.api.PedidoRequest;
import com.alvestech.cardapio.pedido.application.api.PedidoResponse;

public interface PedidoService {
    PedidoResponse savePedido(PedidoRequest pedidoRequest);
}