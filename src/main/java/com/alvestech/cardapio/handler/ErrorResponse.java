package com.alvestech.cardapio.handler;

import lombok.Value;

@Value
public class ErrorResponse {
    int codigo;
    String mensagem;
}