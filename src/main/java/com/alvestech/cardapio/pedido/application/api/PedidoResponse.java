package com.alvestech.cardapio.pedido.application.api;

import com.alvestech.cardapio.pedido.domain.NumeroMesa;
import com.alvestech.cardapio.pedido.domain.Pedido;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PedidoResponse {
    UUID idPedido;
    String cliente;
    String food;
    NumeroMesa numeroMesa;

    public PedidoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.cliente = pedido.getCliente().getNomeCliente();
        this.food = pedido.getFood().getNomeProduto();
        this.numeroMesa = pedido.getNumeroMesa();
    }

    public static List<PedidoResponse> converte(List<Pedido> pedidos) {
        return pedidos.stream()
                .map(PedidoResponse::new)
                .collect(Collectors.toList());
    }
}