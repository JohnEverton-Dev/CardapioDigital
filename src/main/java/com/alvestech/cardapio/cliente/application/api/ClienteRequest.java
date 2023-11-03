package com.alvestech.cardapio.cliente.application.api;

import lombok.Value;

@Value
public class ClienteRequest {
    String nomeCliente;
    String celular;
}