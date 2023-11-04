package com.alvestech.cardapio.cliente.application.api;

import com.alvestech.cardapio.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public static List<ClienteResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteResponse::new)
                .collect(Collectors.toList());
    }
}