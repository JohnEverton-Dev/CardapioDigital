package com.alvestech.cardapio.cliente.application.repository;

import com.alvestech.cardapio.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente saveCliente(Cliente cliente);
}