package com.alvestech.cardapio.cliente.application.service;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
import com.alvestech.cardapio.cliente.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse saveCliente(ClienteRequest clienteRequest);
    ClienteResponse findClienteById(UUID idCliente);
    List<ClienteResponse> findAllClientes();
}