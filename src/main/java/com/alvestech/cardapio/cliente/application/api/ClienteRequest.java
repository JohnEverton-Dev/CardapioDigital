package com.alvestech.cardapio.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
    String nomeCliente;
    String celular;
}