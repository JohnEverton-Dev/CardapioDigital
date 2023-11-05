package com.alvestech.cardapio.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
    @NotBlank(message = "Campo Obrigatório!")
    String nomeCliente;
    @NotBlank(message = "Campo Obrigatório!")
    String celular;
}