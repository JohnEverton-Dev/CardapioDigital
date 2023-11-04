package com.alvestech.cardapio.cliente.application.repository;

import com.alvestech.cardapio.cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {
    Cliente saveCliente(Cliente cliente);
    Cliente findClienteById(UUID idCliente);
}