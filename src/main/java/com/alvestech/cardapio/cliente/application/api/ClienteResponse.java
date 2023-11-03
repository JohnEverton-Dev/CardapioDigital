package com.alvestech.cardapio.cliente.application.api;

import com.alvestech.cardapio.cliente.domain.Cliente;
import lombok.Value;

import java.util.UUID;

@Value
public class ClienteResponse {
    UUID idCliente;
    String nomeCliente;
    String celular;

    public ClienteResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCliente = cliente.getNomeCliente();
        this.celular = cliente.getCelular();
    }
}