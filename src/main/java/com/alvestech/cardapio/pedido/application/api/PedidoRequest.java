package com.alvestech.cardapio.pedido.application.api;

import com.alvestech.cardapio.pedido.domain.NumeroMesa;
import lombok.Value;

import java.util.UUID;

@Value
public class PedidoRequest {
    UUID idCliente;
    UUID idFood;
    NumeroMesa numeroMesa;
}