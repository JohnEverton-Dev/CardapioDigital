package com.alvestech.cardapio.pedido.application.api;

import com.alvestech.cardapio.pedido.domain.NumeroMesa;
import com.alvestech.cardapio.pedido.domain.Pedido;
import lombok.Value;

import java.util.UUID;

@Value
public class PedidoResponse {
    UUID idPedido;
    String nomeCliente;
    String nomeProduto;
    NumeroMesa numeroMesa;

    public PedidoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.nomeCliente = pedido.getCliente().getNomeCliente();
        this.nomeProduto = pedido.getFood().getNomeProduto();
        this.numeroMesa = pedido.getNumeroMesa();
    }
}