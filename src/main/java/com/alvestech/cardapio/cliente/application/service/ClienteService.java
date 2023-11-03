package com.alvestech.cardapio.cliente.application.service;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
import com.alvestech.cardapio.cliente.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse saveCliente(ClienteRequest clienteRequest);
}